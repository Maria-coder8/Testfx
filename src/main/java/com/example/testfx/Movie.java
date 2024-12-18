package com.example.testfx;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String moviePosterSrc;
    private int MovieID;
    private String title;
    private int ReleaseYear;
    private int runningTime;// In min
    private String director;
    private String country;
    private double budget;
    private double revenue;
    private List<Float> rating;
    private String languages;
    private String genres;
    private List <String> cast;

    public Movie(String moviePosterSrc, int MovieID, String title, int ReleaseYear, int runningTime, String director, String country, double budget, double revenue, List<Float> rating, String languages, String genres, List<String> cast) {
        this.moviePosterSrc = moviePosterSrc;
        this.MovieID = MovieID;
        this.title = title;
        this.ReleaseYear = ReleaseYear;
        this.runningTime = runningTime;
        this.director = director;
        this.country=country;
        this.budget=budget;
        this.revenue=revenue;
        this.rating=rating;
        this.languages=languages;
        this.genres=genres;
        this.cast=cast;
    }

    //No argument constructor;
    public Movie() {
        this.moviePosterSrc = "";
        this.MovieID = 0;
        this.title = "";
        this.ReleaseYear = 0;
        this.runningTime = 0;
        this.director = "";
        this.country="";
        this.budget=0;
        this.revenue=0;
        this.rating= new ArrayList<>();
        this.languages=languages;
        this.genres=genres;
        this.cast= new ArrayList<>();
    }

    public Movie(String moviePosterSrc, String title, String releaseDate, String director, String country, double budget, double rating, String language, List<String> genres, List<String> cast) {
    }

    public String getMoviePosterSrc() {
        return moviePosterSrc;
    }

    public void setMoviePosterSrc(String moviePosterSrc) {
        this.moviePosterSrc = moviePosterSrc;
    }

    public int getMovieID() {
        return MovieID;
    }

    public void setMovieID(int movieID) {
        MovieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return ReleaseYear;
    }

    public void setReleaseDate(String releaseYear) {
        this.ReleaseYear = ReleaseYear;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public List<String> getCast() {
        return cast;
    }

    public void setCast(List<String> cast) {
        this.cast = cast;
    }

    public List<Float> getRating() {
        return rating;
    }

    public void setRating(List<Float> rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Watchit.Movie{" +
                "MovieID=" + MovieID +
                ", title='" + title + '\'' +
                ", ReleaseYear='" + ReleaseYear + '\'' +
                ", runningTime=" + runningTime +
                ", director='" + director + '\'' +
                ", country='" + country + '\'' +
                ", budget=" + budget +
                ", revenue=" + revenue +
                ", rating=" + rating +
                ", languages=" + languages +
                ", genres=" + genres +
                ", cast=" + cast +
                '}';
    }

    public float calcRating() {
        float averageRating = 0;

        if (rating != null) { //if there is exception !!
            float sum = 0;
            for(Float avg: rating ) {
                sum += avg;
            }
            averageRating = sum / rating.size();
        }
        return averageRating;
    }

    public String CalcDuration() {
        int hrs = runningTime / 60;
        int min = runningTime % 60;

        if (hrs != 0) {
            return hrs + " hrs " + min + " min";
        } else {
            return min + " min";
        }
    }
}
