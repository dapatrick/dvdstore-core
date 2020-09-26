package com.mycompany.dvdstore;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepository;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Classe Principale
 */
public class App 
{
    /**
     * Logger
     */
    private static final Logger logger = Logger.getLogger(App.class.getName());

    /**
     * Méthode principale
     * @param args arguments
     */
    public static void main( String[] args )
    {
        logger.info("DEBUT");
        logger.info( "Veuillez saisir le genre du film" );
        Scanner sc = new Scanner(System.in);
        String genre = sc.nextLine();
        logger.info("Veuillez saisir le titre du film");
        String titre = sc.nextLine();
        Movie movie = new Movie();
        movie.setGenre(genre);
        movie.setTitle(titre);
        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);
        logger.info("FIN");
    }
}
