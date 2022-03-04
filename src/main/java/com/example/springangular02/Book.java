package com.example.springangular02;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String author;

    public Book(Long id, String title, String author) {

        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book() {

    }
}
