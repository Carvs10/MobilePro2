package com.example.movies.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.movies.R;
import com.example.movies.model.Movie;

public class MovieDetailFragment extends Fragment {

    TextView tvName;
    TextView tvDuration;
    TextView tvYear;
    RatingBar rbStars;

    public static final String TAG_DETAIL = "tagsDetails";
    public static final String MOVIE = "movie";


    Movie mMovies;

    public static MovieDetailFragment newInstance(Movie movie){

        //Create a instance of Fragment Detail
        MovieDetailFragment fragmentDetail = new MovieDetailFragment();

        //Setting data at params of instance of Fragment Detail
        Bundle params = new Bundle();
        params.putSerializable(MOVIE, movie);

        //Passing bundle to the fragment
        fragmentDetail.setArguments(params);

        //Return the instance of fragment created
        return fragmentDetail;
    }


    public MovieDetailFragment() {
        // Required empty public constructor

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMovies = (Movie) getArguments().getSerializable(MOVIE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View layout = inflater.inflate(R.layout.fragment_movie_detail, container, false);

        tvName  = layout.findViewById(R.id.TvName);
        tvDuration = layout.findViewById(R.id.TvDuration);
        tvYear = layout.findViewById(R.id.TvYear);
        rbStars = layout.findViewById(R.id.rbStars);

        if(mMovies != null){
            tvName.setText(mMovies.getName());
            tvDuration.setText(mMovies.getDuration());
            tvYear.setText(mMovies.getRelease_year());
            rbStars.setRating(mMovies.getStars());
        }

        return layout;
    }
}