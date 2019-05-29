package matcher.game.silveira.avila.com.tasker.viewmodel


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

import matcher.game.silveira.avila.com.tasker.R
import matcher.game.silveira.avila.com.tasker.dependencyinjection.Injectable
import matcher.game.silveira.avila.com.tasker.dependencyinjection.TaskViewModelFactory
import matcher.game.silveira.avila.com.tasker.recyclerview.ItemsAdapter
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 * Use the [ItemsFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class ItemsFragment constructor() : Fragment(), Injectable {

    private lateinit var viewModel : ItemsViewModel
    private lateinit var recyclerView : androidx.recyclerview.widget.RecyclerView
    private lateinit var itemAdapter : ItemsAdapter
    @Inject lateinit var viewModelFactory : TaskViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_items, container, false)

        recyclerView = view.findViewById(R.id.rv_items)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this, this.viewModelFactory).get(ItemsViewModel::class.java)

        setupList()

        viewModel.liveData.observe(this, Observer { data ->

            if(data != null && data.isNotEmpty()){
                itemAdapter.setData(data)
            }
        })

    }

    private fun setupList() {
        recyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(activity)
        itemAdapter = ItemsAdapter()
        recyclerView.adapter = itemAdapter
    }
}
