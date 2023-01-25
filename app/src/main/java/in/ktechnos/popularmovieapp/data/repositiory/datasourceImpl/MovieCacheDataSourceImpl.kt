package `in`.ktechnos.popularmovieapp.data.repositiory.datasourceImpl

import `in`.ktechnos.popularmovieapp.data.model.Movie
import `in`.ktechnos.popularmovieapp.data.repositiory.datasource.MovieCacheDataSource

class MovieCacheDataSourceImpl :
    MovieCacheDataSource {
    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
       movieList.clear()
       movieList = ArrayList(movies)
    }
}