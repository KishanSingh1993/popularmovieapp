package `in`.ktechnos.popularmovieapp.data.repositiory.datasourceImpl


import `in`.ktechnos.popularmovieapp.data.db.MovieDao
import `in`.ktechnos.popularmovieapp.data.model.Movie
import `in`.ktechnos.popularmovieapp.data.repositiory.datasource.MovieLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieLocalDataSourceImpl(private val movieDao: MovieDao):
    MovieLocalDataSource {
    override suspend fun getMoviesFromDB(): List<Movie> {
       return movieDao.getMovies()
    }

    override suspend fun saveMoviesToDB(movies: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.saveMovies(movies)
        }
    }

    override suspend fun clearAll() {
       CoroutineScope(Dispatchers.IO).launch {
           movieDao.deleteAllMovies()
       }
    }
}