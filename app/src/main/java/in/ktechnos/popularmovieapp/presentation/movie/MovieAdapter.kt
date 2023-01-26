package `in`.ktechnos.popularmovieapp.presentation.movie

import `in`.ktechnos.popularmovieapp.R
import `in`.ktechnos.popularmovieapp.data.model.Movie
import `in`.ktechnos.popularmovieapp.databinding.ListItemBinding
import `in`.ktechnos.popularmovieapp.presentation.MovieDetails
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView

import com.bumptech.glide.Glide

const val IMAGE_PATH = "image_path"
const val MOVIE_NAME = "movie_name"
const val mDESCRIPTION = "description"
class MovieAdapter(private val onClickListener: OnClickListener):RecyclerView.Adapter<MyViewHolder>() {
    private val movieList = ArrayList<Movie>()

    fun setList(movies:List<Movie>){
         movieList.clear()
         movieList.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : ListItemBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.list_item,
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.bind(movieList[position])
        val meme = movieList[position]
        holder.itemView.setOnClickListener {
            onClickListener.onClick(meme)
        }
    }

    class OnClickListener(val clickListener: (meme: Movie) -> Unit) {
        fun onClick(meme: Movie) = clickListener(meme)
    }

}



class MyViewHolder(val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root){

   fun bind(movie:Movie){
        binding.titleTextView.text = movie.title
        //binding.descriptionTextView.text = movie.overview
        val posterURL = "https://image.tmdb.org/t/p/w500"+movie.posterPath
        Glide.with(binding.imageView.context)
            .load(posterURL)
            .into(binding.imageView)

       binding.cardView.setOnClickListener{

           val intent = Intent(binding.cardView.context, MovieDetails()::class.java)
           intent.putExtra(IMAGE_PATH, movie.posterPath)
           intent.putExtra(MOVIE_NAME, movie.title)
           intent.putExtra(mDESCRIPTION, movie.overview)
           binding.cardView.context.startActivity(intent)
       }
   }


}