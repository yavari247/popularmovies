package com.yavari.tmdbclient.presentation.di.tvshow

import com.yavari.tmdbclient.domain.usecase.GetTvShowsUseCase
import com.yavari.tmdbclient.domain.usecase.UpdateTvShowsUseCase
import com.yavari.tmdbclient.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}