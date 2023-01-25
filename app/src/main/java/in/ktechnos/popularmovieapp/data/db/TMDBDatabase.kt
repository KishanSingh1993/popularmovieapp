package `in`.ktechnos.popularmovieapp.data.db

import `in`.ktechnos.popularmovieapp.data.model.Movie
import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Movie::class],
version = 1,
exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase(){
abstract fun movieDao(): MovieDao


}