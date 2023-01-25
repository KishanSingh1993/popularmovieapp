package `in`.ktechnos.popularmovieapp.presentation.di.core


import `in`.ktechnos.popularmovieapp.domain.repository.MovieRepository
import `in`.ktechnos.popularmovieapp.domain.usecase.GetMoviesUseCase
import `in`.ktechnos.popularmovieapp.domain.usecase.UpdateMoviesUsecase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetMovieUseCase(movieRepository: MovieRepository): GetMoviesUseCase {
        return GetMoviesUseCase(movieRepository)
    }
    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository): UpdateMoviesUsecase {
        return UpdateMoviesUsecase(movieRepository)
    }

}