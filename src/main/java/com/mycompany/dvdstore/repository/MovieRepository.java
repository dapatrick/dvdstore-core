package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MovieRepository {

    /**
     * Liste de films
     */
    private List<Movie> movies = new ArrayList<>();

    /**
     * Logger
     */
    private static final Logger logger = Logger.getLogger(MovieRepository.class.getName());

    /**
     * Ajoute un film
     * @param movie film
     */
    public void add (Movie movie) {
        movies.add(movie);
        logger.info("The movie whose title is [" + movie.getTitle()+ "], " +
                "and gendle is [" + movie.getGenre() + "] has been registered");
    }
}
