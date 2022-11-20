package com.yavari.tmdbclient.presentation.di.core

import com.yavari.tmdbclient.data.repository.artist.ArtistRepositoryImpl
import com.yavari.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.yavari.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.yavari.tmdbclient.data.repository.artist.datasource.ArtistRemoteDatasource
import com.yavari.tmdbclient.data.repository.movie.MovieRepositoryImpl
import com.yavari.tmdbclient.data.repository.movie.datasource.MovieCacheDataSource
import com.yavari.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.yavari.tmdbclient.data.repository.movie.datasource.MovieRemoteDatasource
import com.yavari.tmdbclient.data.repository.tvshow.TvShowRepositoryImpl
import com.yavari.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.yavari.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.yavari.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.yavari.tmdbclient.domain.repository.ArtistRepository
import com.yavari.tmdbclient.domain.repository.MovieRepository
import com.yavari.tmdbclient.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )


    }

}