package model;

import java.util.List;


/**
 * Created by Abashkin Alexandr on 16.03.2015.
 */
public class Book {
    private long id;
    private String author;
    private String title;
    private int count = 0;
    private List<User> users;
    private List<Report> report;

    public Book(long id, String author, String title) {
        setId(id);
        setAuthor(author);
        setTitle(title);

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Report> getReport() {
        return report;
    }

    public void setReport(List<Report> report) {
        this.report = report;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", count=" + count +
                '}';
    }
}
