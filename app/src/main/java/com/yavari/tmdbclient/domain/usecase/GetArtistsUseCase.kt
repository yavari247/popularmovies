package com.yavari.tmdbclient.domain.usecase

import com.yavari.tmdbclient.data.model.artist.Artist
import com.yavari.tmdbclient.domain.repository.ArtistRepository

class GetArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.getArtists()

}