package `in`.ktechnos.popularmovieapp.presentation.di.movie

import `in`.ktechnos.popularmovieapp.presentation.MovieActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {
    fun inject(movieActivity: MovieActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create(): MovieSubComponent
    }

}

