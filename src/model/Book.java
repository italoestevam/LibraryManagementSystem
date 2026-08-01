package model;

import java.time.LocalDateTime;

public class Book {
    private long id ;
    private String title;
    private String autho;
    private String isbn;
    private String publisher;
    private Integer publicaionYear;
    private Integer pages;
    private String language;
    private boolean avaliable;
    private String category;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public Book() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPublicaionYear() {
        return publicaionYear;
    }

    public void setPublicaionYear(Integer publicaionYear) {
        this.publicaionYear = publicaionYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutho() {
        return autho;
    }

    public void setAutho(String autho) {
        this.autho = autho;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(long id, String title, String autho, String isbn, String publisher, Integer publicaionYear, Integer pages, String language, boolean avaliable, String category, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.title = title;
        this.autho = autho;
        this.isbn = isbn;
        this.publisher = publisher;
        this.publicaionYear = publicaionYear;
        this.pages = pages;
        this.language = language;
        this.avaliable = avaliable;
        this.category = category;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", autho='" + autho + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publicaionYear=" + publicaionYear +
                ", pages=" + pages +
                ", language='" + language + '\'' +
                ", avaliable=" + avaliable +
                ", category='" + category + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
