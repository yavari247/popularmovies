package com.yavari.tmdbclient.presentation.di.movie

import com.yavari.tmdbclient.domain.usecase.GetMoviesUseCase
import com.yavari.tmdbclient.domain.usecase.UpdateMoviesUsecase
import com.yavari.tmdbclient.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}