package matcher.game.silveira.avila.com.tasker.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import matcher.game.silveira.avila.com.tasker.db.Task


class ItemsViewModel : ViewModel() {

    private val liveData = MutableLiveData<List<Task>>()
    val data: LiveData<List<Task>> get() = liveData

    init {
        val tempData = ArrayList<Task>()

        val first = Task("Person", "111", "2324")

        tempData.add(first)

        liveData.value = tempData
    }

}