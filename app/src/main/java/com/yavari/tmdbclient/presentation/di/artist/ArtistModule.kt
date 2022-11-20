package com.yavari.tmdbclient.presentation.di.artist

import com.yavari.tmdbclient.domain.usecase.GetArtistsUseCase
import com.yavari.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.yavari.tmdbclient.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }

}