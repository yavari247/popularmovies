package com.yavari.tmdbclient.data.repository.movie.datasourceImpl

import com.yavari.tmdbclient.data.api.TMDBService
import com.yavari.tmdbclient.data.model.movie.MovieList
import com.yavari.tmdbclient.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}

