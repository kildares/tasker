package matcher.game.silveira.avila.com.tasker.recyclerview

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import matcher.game.silveira.avila.com.tasker.R
import matcher.game.silveira.avila.com.tasker.db.Task

class ItemsAdapter : androidx.recyclerview.widget.RecyclerView.Adapter<ItemsAdapter.ItemViewHolder>() {

    private lateinit var dataList: List<Task>

    fun setData(data : List<Task>){
        dataList = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType : Int): ItemViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.task_item, parent, false)
        return ItemViewHolder(view)

    }

    override fun getItemCount(): Int {
        if(dataList == null){
            return 0;
        }
        return dataList.size
    }

    override fun onBindViewHolder(holder : ItemViewHolder, position: Int) {

        holder.tvTaskName?.text = dataList[position].name
        holder.tvDay?.text = dataList[position].day
        holder.tvTime?.text = dataList[position].time

    }


    inner class ItemViewHolder(itemView : View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {

        val tvDay = itemView.findViewById<TextView>(R.id.tv_dia)
        val tvTaskName = itemView.findViewById<TextView>(R.id.tv_task_name)
        val tvTime = itemView.findViewById<TextView>(R.id.tv_time)

    }


}