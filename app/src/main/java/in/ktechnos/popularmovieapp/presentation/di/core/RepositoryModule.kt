package `in`.ktechnos.popularmovieapp.presentation.di.core


import `in`.ktechnos.popularmovieapp.data.repositiory.MovieRepositoryImpl
import `in`.ktechnos.popularmovieapp.data.repositiory.datasource.MovieCacheDataSource
import `in`.ktechnos.popularmovieapp.data.repositiory.datasource.MovieLocalDataSource
import `in`.ktechnos.popularmovieapp.data.repositiory.datasource.MovieRemoteDatasource
import `in`.ktechnos.popularmovieapp.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }


}