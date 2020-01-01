package kv.graphql.demo.graphqldemo.model;

public class Book {

    private String id;
    private String name;
    private Integer pageCount;
    private String author;

    public Book(String id, String name, Integer pageCount, String author) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
