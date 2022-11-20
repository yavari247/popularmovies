package com.yavari.tmdbclient.domain.usecase

import com.yavari.tmdbclient.data.model.tvshow.TvShow
import com.yavari.tmdbclient.domain.repository.TvShowRepository

class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.updateTvShows()
}