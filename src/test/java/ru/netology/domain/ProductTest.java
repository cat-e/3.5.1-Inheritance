package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.manager.ProductManager;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private final ProductRepository repository = new ProductRepository();
    private final ProductManager manager = new ProductManager(repository);
    private final Book aliceInWonderland = new Book(1, "Alice In Wonderland", 1000, "Lewis Carrol");
    private final Book wizardOfOz = new Book(2, "Wizard Of Oz", 1200, "Frank L Baum");
    private final Smartphone iPhone11 = new Smartphone(3, "iPhone 11", 85000, "Apple");

    @BeforeEach
    public void setUp() {
        manager.add(aliceInWonderland);
        manager.add(aliceInWonderland);
        manager.add(iPhone11);
    }

    @Test
    void matches() {
        boolean ans = true;
        boolean val;
        String search = "Alice In Wonderland";
        Product product = new Product(1,"Alice In Wonderland",1000);
        val = product.matches(search);
        assertEquals(ans, val);
    }

}