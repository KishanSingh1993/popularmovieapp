package `in`.ktechnos.popularmovieapp.presentation.di.movie

import `in`.ktechnos.popularmovieapp.domain.usecase.GetMoviesUseCase
import `in`.ktechnos.popularmovieapp.domain.usecase.UpdateMoviesUsecase
import `in`.ktechnos.popularmovieapp.presentation.movie.MovieViewModelFactory

import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}