package matcher.game.silveira.avila.com.tasker.viewmodel


import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

import matcher.game.silveira.avila.com.tasker.R
import matcher.game.silveira.avila.com.tasker.recyclerview.ItemsAdapter

/**
 * A simple [Fragment] subclass.
 * Use the [ItemsFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class ItemsFragment : Fragment() {

    private lateinit var viewModel : ItemsViewModel
    private lateinit var recyclerView : androidx.recyclerview.widget.RecyclerView
    private lateinit var itemAdapter : ItemsAdapter

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

        setupList()

        viewModel = ViewModelProviders.of(this).get(ItemsViewModel::class.java)

        viewModel.data.observe(this, Observer { data ->

            if(viewModel.data != null){
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
