package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

import com.example.movies.fragments.MovieDetailFragment;
import com.example.movies.fragments.MovieListFragment;
import com.example.movies.model.Movie;


public class MovieActivity extends AppCompatActivity implements MovieListFragment.toClickMovie {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
    }


    @Override
    public void clickMovie(Movie movie) {

        Intent it = new Intent(this, MovieDetailActivity.class);
        it.putExtra("movie",movie);
        startActivity(it);

    }

    private boolean isTablet(){
        return findViewById(R.id.detail) != null;
    }

}