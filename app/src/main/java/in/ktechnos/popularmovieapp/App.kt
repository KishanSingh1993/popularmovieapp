package `in`.ktechnos.popularmovieapp

import `in`.ktechnos.popularmovieapp.presentation.di.Injector
import `in`.ktechnos.popularmovieapp.presentation.di.core.*
import `in`.ktechnos.popularmovieapp.presentation.di.movie.MovieSubComponent
import android.app.Application
import androidx.viewbinding.BuildConfig

import javax.inject.Inject

class App : Application(), Injector {
private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule("https://api.themoviedb.org/3/"))
            .remoteDataModule(RemoteDataModule("f60ae473c8d03fdd88e75848cea96a8e"))
            .build()

    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }


}