//  Book.java
//  Sample Google API
//
//  Created by Mohammadreza on 10/7/18.
//  Copyright © 2019 Mohammadreza Mohades. All rights reserved.

package Models;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Book {

    private String title, description;
    private ArrayList<String> authors = new ArrayList<String>();
    private int id;
    private Image icon_de_la_book;
    private String datePublished;
    private Map<String, String> isbn = new HashMap<String, String>();
    private Publisher publisherInstance;

    public Book(String title, ArrayList<String> authors, Map<String, String> isbn, String description, int id) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
        this.description = description;
        this.id = id;

    }

    public Book() {
    }

    public Image getIcon() {
        return icon_de_la_book;

    }

    public void setIcon(Image icon) {

        this.icon_de_la_book = icon;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public Map<String, String> getIsbn() {
        return isbn;
    }

    public void setIsbn(Map<String, String> isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Publisher getPublisherInstance() {
        return publisherInstance;
    }

    public void setPublisherInstance(Publisher publisherInstance) {
        this.publisherInstance = publisherInstance;
    }



    @Override
    public String toString() {
        return String.format("Title: %s with ID: %d", this.title, this.id);
    }


}
