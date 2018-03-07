package com.example.sontbv.retrofittutorial.webservice;

import com.example.sontbv.retrofittutorial.model.Movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sontbv on 3/7/18.
 */

public interface ApiInterface {
    @GET("films")
    Call<List<Movie>> getMovies();

}
