package org.example.src.Product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    void shouldShowNameBook() {
        org.example.src.Product.Book book = new org.example.src.Product.Book();
        book.setName("Книга 1");

        String expected = ("Книга 1");
        String actual = book.getName();

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowAuthorBook() {
        org.example.src.Product.Book book = new org.example.src.Product.Book();
        book.setAuthor("Автор 1");

        String expected = ("Автор 1");
        String actual = book.getAuthor();

        assertEquals(expected, actual);
    }
}

