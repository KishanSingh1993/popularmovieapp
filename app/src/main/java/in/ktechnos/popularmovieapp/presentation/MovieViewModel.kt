package `in`.ktechnos.popularmovieapp.presentation

import `in`.ktechnos.popularmovieapp.domain.usecase.GetMoviesUseCase
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import `in`.ktechnos.popularmovieapp.domain.usecase.UpdateMoviesUsecase


class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUsecase: UpdateMoviesUsecase
): ViewModel() {

    fun getMovies() = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMoviesUsecase.execute()
        emit(movieList)
    }

    }





