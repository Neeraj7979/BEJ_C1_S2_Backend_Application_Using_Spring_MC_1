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

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(double movieDuration) {
        this.movieDuration = movieDuration;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}
