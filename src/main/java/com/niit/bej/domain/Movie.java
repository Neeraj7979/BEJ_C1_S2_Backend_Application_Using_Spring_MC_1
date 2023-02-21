package com.niit.bej.domain;

public class Movie {
    private String movieName;
    private String genre;
    private double movieDuration;
    private int yearOfRelease;

    public Movie(String movieName, String genre, double movieDuration, int yearOfRelease) {
        this.movieName = movieName;
        this.genre = genre;
        this.movieDuration = movieDuration;
        this.yearOfRelease = yearOfRelease;
    }

    public Movie() {
    }
}
