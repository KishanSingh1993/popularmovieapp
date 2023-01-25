package `in`.ktechnos.popularmovieapp.data.repositiory.datasourceImpl


import `in`.ktechnos.popularmovieapp.data.api.TMDBServices
import `in`.ktechnos.popularmovieapp.data.model.MovieList
import `in`.ktechnos.popularmovieapp.data.repositiory.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBServices,
    private val apiKey:String
): MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}

