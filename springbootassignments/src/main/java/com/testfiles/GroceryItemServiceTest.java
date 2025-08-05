package com.testfiles;


import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;

import com.daofiles.GroceryItemRepository;
import com.servicefiles.GroceryItemService;
import com.springbootprograms.GroceryItem;

@ExtendWith(MockitoExtension.class)
public class GroceryItemServiceTest {

    @Mock
    private GroceryItemRepository repository;

    @InjectMocks
    private GroceryItemService service;

    

    @Test
    void testAddGroceryItem() {
        GroceryItem item = new GroceryItem();
        item.setId(1);
        item.setName("Apple");
        item.setQuantity(50);

        when(repository.save(item)).thenReturn(item);

        GroceryItem result = service.addItem(item);

        assertEquals("Apple", result.getName());
        verify(repository, times(1)).save(item);
    }

    @Test
    void testGetAllItems() {
        GroceryItem item1 = new GroceryItem();
        item1.setId(1);
        item1.setName("Apple");
        item1.setQuantity(50);

        GroceryItem item2 = new GroceryItem();
        item2.setId(2);
        item2.setName("Banana");
        item2.setQuantity(30);

        when(repository.findAll()).thenReturn(List.of(item1, item2));

        List<GroceryItem> result = service.getAllItems();

        assertEquals(2, result.size());
    }

    @Test
    void testGetItemById() {
        GroceryItem item = new GroceryItem();
        item.setId(1);
        item.setName("Apple");
        item.setQuantity(50);

        when(repository.findById(1)).thenReturn(Optional.of(item));

        GroceryItem result = service.getItemById(1);

        assertEquals("Apple", result.getName());
    }

    @Test
    void testUpdateItem() {
        GroceryItem existing = new GroceryItem();
        existing.setId(1);
        existing.setName("Apple");
        existing.setQuantity(50);

        GroceryItem updated = new GroceryItem();
        updated.setId(1);
        updated.setName("Mango");
        updated.setQuantity(100);

        when(repository.findById(1)).thenReturn(Optional.of(existing));
        when(repository.save(any(GroceryItem.class))).thenReturn(updated);

        GroceryItem result = service.updateItem(1, updated);

        assertEquals("Mango", result.getName());
    }

    @Test
    void testDeleteItem() {
        doNothing().when(repository).deleteById(1);
        service.deleteItem(1);
        verify(repository, times(1)).deleteById(1);
    }
}