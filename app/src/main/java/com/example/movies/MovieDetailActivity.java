package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

import com.example.movies.fragments.MovieDetailFragment;
import com.example.movies.model.Movie;

public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        Intent it = getIntent();

        Movie movie = (Movie) it.getExtras().getSerializable("movie");

        MovieDetailFragment movieDetailFragment = MovieDetailFragment.newInstance(movie);

        FragmentManager fm = getSupportFragmentManager();

        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.detail, movieDetailFragment, MovieDetailFragment.TAG_DETAIL);
        ft.commit();
    }
}