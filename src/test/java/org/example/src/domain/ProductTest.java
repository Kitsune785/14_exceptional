package org.example.src.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    void shouldShowId() {
        org.example.src.domain.Product product = new org.example.src.domain.Product();
        product.setId(1);

        int expected = 1;
        int actual = product.getId();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowName() {
        org.example.src.domain.Product product = new org.example.src.domain.Product();
        product.setName("Продукт 1");

        String expected = ("Продукт 1");
        String actual = product.getName();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowPrice() {
        org.example.src.domain.Product product = new org.example.src.domain.Product();
        product.setPrice(100);

        int expected = 100;
        int actual = product.getPrice();

        assertEquals(expected, actual);
    }
}
