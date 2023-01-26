package `in`.ktechnos.popularmovieapp.presentation

import `in`.ktechnos.popularmovieapp.R
import `in`.ktechnos.popularmovieapp.databinding.ActivityMovieDetailsBinding
import `in`.ktechnos.popularmovieapp.presentation.movie.IMAGE_PATH
import `in`.ktechnos.popularmovieapp.presentation.movie.MOVIE_NAME
import `in`.ktechnos.popularmovieapp.presentation.movie.mDESCRIPTION
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide

class MovieDetails : AppCompatActivity() {

    var srcPath: String? = null
    var mName: String? = null
    var mDesc: String? = null

    private lateinit var binding: ActivityMovieDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_movie_details)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_movie_details)

        val bundle: Bundle? = intent.extras
        if (bundle != null) {

            mName = bundle.getString(MOVIE_NAME)
            mDesc = bundle.getString(mDESCRIPTION)
            srcPath = bundle.getString(IMAGE_PATH)

            val posterURL = "https://image.tmdb.org/t/p/w500"+srcPath
            Glide.with(applicationContext)
                .load(posterURL)
                .into(binding.imgSrc)

           binding.mName.text = mName
           binding.desc.text = mDesc
        }
    }
}