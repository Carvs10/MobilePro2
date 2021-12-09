package com.example.movies.model;

import java.io.Serializable;

public class Movie  implements Serializable {
    private String name;
    private String duration;
    private int release_year;
    private float stars;

    public Movie(String name, String duration, int release_year, float stars){
        this.name = name;
        this.duration = duration;
        this.release_year =  release_year;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }


    @Override
    public String toString(){
        return name;
    }
}
