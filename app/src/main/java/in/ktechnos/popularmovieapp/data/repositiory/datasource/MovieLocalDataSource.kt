package `in`.ktechnos.popularmovieapp.data.repositiory.datasource

import `in`.ktechnos.popularmovieapp.data.model.Movie


interface MovieLocalDataSource {
  suspend fun getMoviesFromDB():List<Movie>
  suspend fun saveMoviesToDB(movies:List<Movie>)
  suspend fun clearAll()
}