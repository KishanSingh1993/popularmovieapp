package `in`.ktechnos.popularmovieapp.data.model


import `in`.ktechnos.popularmovieapp.data.model.Movie
import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("results")
    val movies: List<Movie>
)