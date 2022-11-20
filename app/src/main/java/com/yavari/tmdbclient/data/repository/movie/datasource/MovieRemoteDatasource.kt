package com.yavari.tmdbclient.data.repository.movie.datasource

import com.yavari.tmdbclient.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
   suspend fun getMovies(): Response<MovieList>
}