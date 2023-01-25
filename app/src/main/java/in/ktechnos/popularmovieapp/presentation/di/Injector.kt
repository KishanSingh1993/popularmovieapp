package `in`.ktechnos.popularmovieapp.presentation.di

import `in`.ktechnos.popularmovieapp.presentation.di.movie.MovieSubComponent


interface Injector {
   fun createMovieSubComponent(): MovieSubComponent

}