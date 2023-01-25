package `in`.ktechnos.popularmovieapp.presentation.di.core


import `in`.ktechnos.popularmovieapp.presentation.di.movie.MovieSubComponent

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
AppModule::class,
NetModule::class,
DataBaseModule::class,
UseCaseModule::class,
RepositoryModule::class,
RemoteDataModule::class,
LocalDataModule::class,
CacheDataModule::class
])
interface AppComponent {

fun movieSubComponent(): MovieSubComponent.Factory


}