// Genre.java (Entity)
package com.example.movies.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Genre")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long genreID;

    private String title;


    @ManyToMany(mappedBy = "genres")
    @JsonBackReference
    private List<Movie> movies;

    // Getter for id
    public Long getGenreID() {
        return genreID;
    }

    // Setter for id
    public void setGenreID(Long genreID) {
        this.genreID = genreID;
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
