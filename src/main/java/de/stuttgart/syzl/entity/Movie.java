package de.stuttgart.syzl.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="movies")
@Data
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long movieId;

    //imdb values
    private String id;
    private String imDbRating;
    private String imDbRatingCount;
    private String year;
    private String rank;
    private String image;
    private String fullTitle;
    private String title;
    private String crew;

    private String imdbId;
    private boolean netflix;
    private boolean prime;
    private boolean youtube;
    private boolean imdb;


}
