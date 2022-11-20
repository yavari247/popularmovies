package com.yavari.tmdbclient.data.repository.tvshow.datasource

import com.yavari.tmdbclient.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
   suspend fun getTvShows(): Response<TvShowList>
}