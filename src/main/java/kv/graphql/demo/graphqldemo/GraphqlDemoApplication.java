package kv.graphql.demo.graphqldemo;

import com.coxautodev.graphql.tools.SchemaParserDictionary;
import kv.graphql.demo.graphqldemo.model.Author;
import kv.graphql.demo.graphqldemo.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlDemoApplication.class, args);
	}

	@Bean
	public SchemaParserDictionary schemaParserDictionary() {
		SchemaParserDictionary dict = new SchemaParserDictionary();
		dict.add("Book", Book.class);
		dict.add("Author", Author.class);
		return dict;
	}

}
