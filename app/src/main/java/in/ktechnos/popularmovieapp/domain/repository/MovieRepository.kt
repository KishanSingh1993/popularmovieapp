package `in`.ktechnos.popularmovieapp.domain.repository

import `in`.ktechnos.popularmovieapp.data.model.Movie


interface MovieRepository {

    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?

}