package com.testfiles;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.daofiles.GroceryItemRepository;
import com.springbootprograms.GroceryItem;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class GroceryItemIntegrationTest {

    @Autowired
    private GroceryItemRepository repository;

    private GroceryItem item;

    @BeforeEach
    void setUp() {
        item = new GroceryItem();
        item.setId(1); 
        item.setName("Apple");
        item.setQuantity(50);
    }

    @Test
    @Order(1)
    void testAddAndGetItemIntegration() {
        repository.save(item);

        GroceryItem result = repository.findById(item.getId()).orElse(null);

        assertNotNull(result);
        assertEquals("Apple", result.getName());
    }

    @Test
    @Order(2)
    void testUpdateItemIntegration() {
        GroceryItem toUpdate = repository.findById(item.getId()).orElse(null);
        assertNotNull(toUpdate);
        toUpdate.setName("Banana");
        repository.save(toUpdate);

        GroceryItem updated = repository.findById(toUpdate.getId()).orElse(null);
        assertEquals("Banana", updated.getName());
    }

    @Test
    @Order(3)
    void testGetAllItemsIntegration() {
        List<GroceryItem> items = repository.findAll();
        assertTrue(items.size() > 0);
    }

    @Test
    @Order(4)
    void testDeleteItemIntegration() {
        repository.deleteById(item.getId());
        assertFalse(repository.findById(item.getId()).isPresent());
    }
}