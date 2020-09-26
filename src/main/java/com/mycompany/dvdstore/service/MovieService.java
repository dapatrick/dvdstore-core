package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepository;

/**
 * Service de la classe Film
 */
public class MovieService {

    /**
     * Data Access Object
     */
    private MovieRepository movieRepository = new MovieRepository();

    /**
     * Enregistre un film
     * @param movie : film
     */
    public void registerMovie(Movie movie) {
        movieRepository.add(movie);
    }
}
