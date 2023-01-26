package `in`.ktechnos.popularmovieapp.presentation.movie

import `in`.ktechnos.popularmovieapp.domain.usecase.GetMoviesUseCase
import `in`.ktechnos.popularmovieapp.domain.usecase.UpdateMoviesUsecase
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MovieViewModelFactory(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUsecase: UpdateMoviesUsecase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MovieViewModel(getMoviesUseCase,updateMoviesUsecase) as T
    }
}

