package com.virinchi.LMS.model;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public abstract class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookID;

    @Column(nullable = false)
    private String title;

    @Column(nullable = true)
    private String author;

    @Column(nullable = false, unique = true)
    private String isbn;

    @Column(nullable = true)
    private String edition;

    @Column(nullable = true)
    private String publisher;

    @Column(nullable = true)
    private String category;

    @Column(nullable = true)
    private String language;

    @Column(columnDefinition = "TEXT" , nullable = true)
    private String description;

    @Column(nullable = false)
    private int totalCopies;

    @Column(nullable = false)
    private int availableCopies;

    //Constructors
    public Book() {

    }
    
    public Book(long bookID, String title, String author, String isbn, String edition, String publisher, String category, String language, String description, int totalCopies, int availableCopies) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.edition = edition;
        this.publisher = publisher;
        this.category = category;
        this.language = language;
        this.description = description;
        this.totalCopies = totalCopies;
        this.availableCopies = availableCopies;
    }

    //Getter & Setters

    public long getBookID() {
        return bookID;
    }

    public void setBookID(long bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }
}
