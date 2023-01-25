package `in`.ktechnos.popularmovieapp.domain.usecase

import `in`.ktechnos.popularmovieapp.data.model.Movie
import `in`.ktechnos.popularmovieapp.domain.repository.MovieRepository


class GetMoviesUseCase(private val movieRepository: MovieRepository) {
  suspend fun execute():List<Movie>? = movieRepository.getMovies()
}