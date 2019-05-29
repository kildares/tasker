package matcher.game.silveira.avila.com.tasker.repository

import androidx.lifecycle.LiveData
import matcher.game.silveira.avila.com.tasker.db.Task
import matcher.game.silveira.avila.com.tasker.db.TaskDao
import javax.inject.Inject

class TaskRepository @Inject constructor (taskDao : TaskDao){

    var taskDao : TaskDao = taskDao

    fun getTaskLiveDataList() : LiveData<List<Task>> {
        return taskDao.getTaskList()
    }

}