package org.example.cloudmovies.controllers;

import org.example.cloudmovies.models.Movie;
import org.example.cloudmovies.repositories.MoviesRepository;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesController {
    private final MoviesRepository movieRepository;

    public MoviesController(MoviesRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }
}
