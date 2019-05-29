package matcher.game.silveira.avila.com.tasker.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Task(@PrimaryKey val id : Int, val name: String, val day: String, val time: String) {

}
