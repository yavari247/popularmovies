package com.yavari.tmdbclient.presentation.di

import com.yavari.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.yavari.tmdbclient.presentation.di.movie.MovieSubComponent
import com.yavari.tmdbclient.presentation.di.tvshow.TvShowSubComponent

interface Injector {
   fun createMovieSubComponent():MovieSubComponent
   fun createTvShowSubComponent():TvShowSubComponent
   fun createArtistSubComponent():ArtistSubComponent
}