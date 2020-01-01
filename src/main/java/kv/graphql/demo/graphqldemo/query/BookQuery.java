package kv.graphql.demo.graphqldemo.query;

import com.coxautodev.graphql.tools.GraphQLResolver;
import kv.graphql.demo.graphqldemo.model.Author;
import kv.graphql.demo.graphqldemo.model.Book;
import kv.graphql.demo.graphqldemo.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookQuery implements GraphQLResolver<Book> {

    @Autowired
    private DataRepository dataRepository;
    public Author getAuthor(Book book) {
        return dataRepository.getAuthor(book.getAuthor());
    }
}
