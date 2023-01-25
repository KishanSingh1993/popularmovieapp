package `in`.ktechnos.popularmovieapp.data.repositiory.datasource

import `in`.ktechnos.popularmovieapp.data.model.Movie


interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies:List<Movie>)

}