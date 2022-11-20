package com.yavari.tmdbclient.domain.usecase

import com.yavari.tmdbclient.data.model.movie.Movie
import com.yavari.tmdbclient.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
  suspend fun execute():List<Movie>? = movieRepository.getMovies()
}