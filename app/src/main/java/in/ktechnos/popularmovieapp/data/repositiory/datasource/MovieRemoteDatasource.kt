package `in`.ktechnos.popularmovieapp.data.repositiory.datasource

import `in`.ktechnos.popularmovieapp.data.model.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
   suspend fun getMovies(): Response<MovieList>
}