package matcher.game.silveira.avila.com.tasker.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import matcher.game.silveira.avila.com.tasker.db.Task
import matcher.game.silveira.avila.com.tasker.repository.TaskRepository
import javax.inject.Inject


class ItemsViewModel @Inject constructor(private val taskRepository: TaskRepository) : ViewModel() {

    val liveData : LiveData<List<Task>> = taskRepository.getTaskLiveDataList()

}