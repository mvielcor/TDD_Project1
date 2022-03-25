package org.cefire.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BookCollectionTest {
    @Test
    public void shouldFindABookByISBN(){
        final String isbnToLocate="un-isbn-2";

        BookCollection books = new BookCollection(new Book[]{
                new Book("un-isbn-1", "un titulo 1", "un autor 1"),
                new Book(isbnToLocate, "un titulo 2", "un autor 2"),
                new Book(isbnToLocate, "un titulo 2", "un autor 2"),
                new Book("un-isbn-3", "un titulo 3", "un autor 3"),
        });

        List<Book> foundBooks = books.find(isbnToLocate);
        Assertions.assertFalse(foundBooks.isEmpty());
        foundBooks.forEach((Book book)-> Assertions.assertEquals(isbnToLocate,book.getISBN()));
    }
    @Test
    public void shouldGetAnEmptyListIfNotFoundISBN(){
        final String isbnToLocate="un-isbn-que-no-existeix";

        BookCollection books = new BookCollection(new Book[]{
                new Book("un-isbn-1", "un titulo 1", "un autor 1"),
                new Book("un-isbn-2", "un titulo 2", "un autor 2"),
                new Book("un-isbn-3", "un titulo 3", "un autor 3"),
        });
        Assertions.assertTrue(books.find(isbnToLocate).isEmpty());
    }

}
