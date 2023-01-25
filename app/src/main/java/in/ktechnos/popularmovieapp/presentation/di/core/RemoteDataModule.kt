package `in`.ktechnos.popularmovieapp.presentation.di.core


import `in`.ktechnos.popularmovieapp.data.api.TMDBServices
import `in`.ktechnos.popularmovieapp.data.repositiory.datasource.MovieRemoteDatasource
import `in`.ktechnos.popularmovieapp.data.repositiory.datasourceImpl.MovieRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBServices): MovieRemoteDatasource {
        return MovieRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }




}