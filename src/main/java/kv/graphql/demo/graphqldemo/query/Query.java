package kv.graphql.demo.graphqldemo.query;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import kv.graphql.demo.graphqldemo.model.Author;
import kv.graphql.demo.graphqldemo.model.Book;
import kv.graphql.demo.graphqldemo.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    private DataRepository dataRepository;

    public Book getBookById(String bookId) {
        return dataRepository.getBookById(bookId);
    }




}
