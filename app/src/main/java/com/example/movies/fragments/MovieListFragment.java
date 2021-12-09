package com.example.movies.fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.movies.R;
import com.example.movies.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieListFragment extends ListFragment {

    List<Movie> myMovies;
    ArrayAdapter<Movie> myAdapter;

    public MovieListFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myMovies = loadMovies();


        myAdapter = new ArrayAdapter<Movie>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                myMovies
        );

        setListAdapter(myAdapter);
    }

    private List<Movie> loadMovies(){
        List<Movie> movies = new ArrayList<Movie>();

        movies.add(new Movie("Avengers", "2h15", 2012, 4.5f));
        movies.add(new Movie("Lord of The Rings", "2h45", 2002, 5.0f));
        movies.add(new Movie("Matrix", "2h10", 1999, 4.0f));
        movies.add(new Movie("Dune", "2h35", 2021, 4.5f));
        movies.add(new Movie("Star Wars", "1h45", 1978, 5.0f));
        return movies;
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        // Communicate to MovieActivity a click on a item

        Activity activity = getActivity();

        //Verify if activity implements the inteface

        if(activity instanceof toClickMovie){

            Movie movie = (Movie) l.getItemAtPosition(position);

            toClickMovie listener = (toClickMovie) activity;
            listener.clickMovie(movie);
        }

    }

    public interface toClickMovie{
        void clickMovie(Movie movie);
    }
}