package matcher.game.silveira.avila.com.tasker.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TaskDao{

    @Query("SELECT * FROM Task")
    fun getTaskList() : LiveData<List<Task>>

    @Insert
    fun insertTask(data : List<Task>)
}