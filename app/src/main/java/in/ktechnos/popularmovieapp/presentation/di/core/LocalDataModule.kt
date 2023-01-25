package `in`.ktechnos.popularmovieapp.presentation.di.core


import `in`.ktechnos.popularmovieapp.data.db.MovieDao
import `in`.ktechnos.popularmovieapp.data.repositiory.datasource.MovieLocalDataSource
import `in`.ktechnos.popularmovieapp.data.repositiory.datasourceImpl.MovieLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }


}