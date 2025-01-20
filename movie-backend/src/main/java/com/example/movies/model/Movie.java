package com.example.movies.model;


import java.util.List;

//import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.JoinColumn;

@Entity
@Table(name = "Movie")
public class Movie {

    @Id
    private Long movieID;
    @ManyToMany
    @JoinTable(
      name = "movie_genre", 
      joinColumns = @JoinColumn(name = "movieID"), 
      inverseJoinColumns = @JoinColumn(name = "genreID"))
    @JsonManagedReference 
    private List<Genre> genres;
    @ManyToMany
    @JoinTable(
      name = "movie_creator", 
      joinColumns = @JoinColumn(name = "movieID"), 
      inverseJoinColumns = @JoinColumn(name = "creatorID"))
    @JsonManagedReference 
    private List<Creator> creators;
    private String title;
    private String release_date;
    private String popularity;
    private String overview;
    private int rating;
    private String image_url;
   
 
    
    public Long getId() {
        return movieID;
    }

    public void setId(Long id) {
        this.movieID = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return release_date;
    }

    public void setReleaseDate(String release_date) {
        this.release_date = release_date;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }
    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getImageUrl() {
        return image_url;
    }

    public void setImageUrl(String image_url) {
        this.image_url = image_url;
    }

    // Getter for genres
    public List<Genre> getGenres() {
        return genres;
    }

    // Setter for genres
    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
    // Getter for genres
    public List<Creator> getCreators() {
        return creators;
    }

    // Setter for genres
    public void setCreators(List<Creator> creators) {
        this.creators = creators;
    }
}
