package kv.graphql.demo.graphqldemo.repository;

import kv.graphql.demo.graphqldemo.model.Author;
import kv.graphql.demo.graphqldemo.model.Book;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataRepository {

   private static List<Book> books =
           Arrays.asList(
                   new Book("book-1","Harry Potter and the Philosopher's Stone",223,"author-1"),
                   new Book("book-2","Moby Dick",635,"author-2"),
                   new Book("book-3","Interview with the Gan",224,"author-3")
           );

    private static List<Author> authors =
            Arrays.asList(
                    new Author("author-1","Joanne","Rowling"),
                    new Author("author-2","Herman","Melville"),
                    new Author("author-3","Anne","Rice")
           );
    public Book getBookById(String bookId) {
            return books
                    .stream()
                    .filter(book -> book.getId().equals(bookId))
                    .findFirst()
                    .orElse(null);
    }

    public Author getAuthor(String authorId) {
        return authors
                .stream()
                .filter(author -> author.getId().equals(authorId))
                .findFirst()
                .orElse(null);
    }
}
