package com.yavari.tmdbclient.data.repository.artist.datasource

import com.yavari.tmdbclient.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDatasource {
   suspend fun getArtists(): Response<ArtistList>
}