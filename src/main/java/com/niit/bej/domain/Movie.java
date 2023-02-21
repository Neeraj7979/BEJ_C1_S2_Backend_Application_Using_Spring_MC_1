package com.niit.bej.domain;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Movie{" + "movieName='" + movieName + '\'' + ", genre='" + genre + '\'' + ", movieDuration=" + movieDuration + ", yearOfRelease=" + yearOfRelease + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Double.compare(movie.movieDuration, movieDuration) == 0 && yearOfRelease == movie.yearOfRelease && Objects.equals(movieName, movie.movieName) && Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, genre, movieDuration, yearOfRelease);
    }
}
