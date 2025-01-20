// Genre.java (Entity)
package com.example.movies.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;

@Entity
@Table(name = "Creators")
public class Creator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long creatorID;

    private String title;


    @ManyToMany(mappedBy = "creators")
    @JsonBackReference
    private List<Movie> movies;

    // Getter for id
    public Long getCreatorID() {
        return creatorID;
    }

    // Setter for id
    public void setCreatorID(Long creatorID) {
        this.creatorID = creatorID;
    }

    // Getter for name
    public String getTitle() {
        return title;
    }

    // Setter for name
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for movies
    public List<Movie> getMovies() {
        return movies;
    }

    // Setter for movies
    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
