package com.mycompany.dvdstore.entity;

import java.io.Serializable;

/**
 * Entité Film
 */
public class Movie implements Serializable {

    /**
     * Titre du Film
     */
    private String title;

    /**
     * Genre du film
     */
    private String genre;

    /**
     *
     * @return titre du film
     */
    public String getTitle() {
        return title;
    }

    /**
     * Définit le titre<br>
     *     du film
     * @param title titre du<br>
     *              film
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return genre du film
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Renseigne le genre<br>
     *     du film
     * @param genre genre du<br>
     *              film
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
