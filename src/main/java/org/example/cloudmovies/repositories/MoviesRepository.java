package org.example.cloudmovies.repositories;

import org.example.cloudmovies.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movie, Long> {
}
