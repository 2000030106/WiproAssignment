package com.testfiles;


import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.controllerfiles.GroceryItemController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.servicefiles.GroceryItemService;
import com.springbootprograms.GroceryItem;

@WebMvcTest(GroceryItemController.class)
class GroceryItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GroceryItemService service;

    @Autowired
    private ObjectMapper objectMapper;

    private GroceryItem item;

    @BeforeEach
    void setUp() {
        item = new GroceryItem();
        item.setId(1);
        item.setName("Apple");
        item.setQuantity(50);
    }

    @Test
    void testAddGroceryItem() throws Exception {
        when(service.addItem(any(GroceryItem.class))).thenReturn(item);

        mockMvc.perform(post("/items")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(item)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Apple"));
    }

    @Test
    void testGetAllItems() throws Exception {
        when(service.getAllItems()).thenReturn(List.of(item));

        mockMvc.perform(get("/items"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(1));
    }

    @Test
    void testGetItemById() throws Exception {
        when(service.getItemById(1)).thenReturn(item);

        mockMvc.perform(get("/items/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Apple"));
    }

    @Test
    void testUpdateItem() throws Exception {
        item.setName("Mango");
        item.setQuantity(100);
        when(service.updateItem(eq(1), any(GroceryItem.class))).thenReturn(item);

        mockMvc.perform(put("/items/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(item)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Mango"));
    }

    @Test
    void testDeleteItem() throws Exception {
        doNothing().when(service).deleteItem(1);

        mockMvc.perform(delete("/items/1"))
                .andExpect(status().isOk());
    }
}