package com.yavari.tmdbclient.domain.usecase

import com.yavari.tmdbclient.data.model.artist.Artist
import com.yavari.tmdbclient.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.updateArtists()
}