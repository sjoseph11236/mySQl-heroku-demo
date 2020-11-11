package com.wozu.hackthonbackend.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "ratings")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "movie_id", nullable = true)
//    private Movie movie;

    @JsonProperty("Source")
    private String source;
    @JsonProperty("Value")
    private String value;

    public Rating() {};

    public Long getId() {
        return id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

//    public Movie getMovie() {
//        return movie;
//    }
//
//    public void setMovie(Movie movie) {
//        this.movie = movie;
//    }

    @Override
    public String toString() {
        return "Rating{" +
                "id=" + id +
//                ", movie=" + movie +
                ", source='" + source + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}