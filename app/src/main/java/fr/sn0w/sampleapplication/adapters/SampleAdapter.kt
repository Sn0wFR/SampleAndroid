package fr.sn0w.sampleapplication.adapters;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import fr.sn0w.sampleapplication.R
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Sn0w on 29/07/2023.
 */
class SampleAdapter(private var mDataList: MutableList<Any>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder , position: Int ) {
        val sampleHolder: SampleViewHolder = holder as SampleViewHolder
        val sample: Any = mDataList[position]
        sampleHolder.bind(sample)

        // il est possible de definir plusieurs viewHolder pour une meme liste
    }

    override fun getItemCount(): Int {
        return mDataList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_sample, parent, false)
            return SampleViewHolder(view)

            // si plusieurs viewHolder, il faut definir lequel utiliser en fonction du viewType

    }

    fun changeList(newList: MutableList<Any>) {
        mDataList = newList
        this.notifyItemRangeChanged(0, mDataList.size)
    }

    fun addToEndOfList(newList: MutableList<Any>) {
        val mDataSize = mDataList.size
        mDataList.addAll(newList)
        this.notifyItemRangeChanged(mDataSize, newList.size)
    }

    fun addToStartOfList(newList: MutableList<Any>) {
        mDataList.addAll(0, newList)
        this.notifyItemRangeChanged(0, newList.size)
    }

    fun removeFromList(newList: MutableList<Any>) {
        mDataList.removeAll(newList)
        this.notifyItemRangeChanged(0, mDataList.size)
    }

    fun updateAtPosition(position: Int, any: Any) {
        mDataList[position] = any
        this.notifyItemChanged(position)
    }

    fun removeAtPosition(position: Int) {
        mDataList.removeAt(position)
        this.notifyItemRemoved(position)
    }

    fun addAtPosition(position: Int, any: Any) {
        mDataList.add(position, any)
        this.notifyItemInserted(position)
    }

    fun updateRange(start: Int, end: Int, newList: MutableList<Any>) {
        mDataList.subList(start, end).clear()
        mDataList.addAll(start, newList)
        this.notifyItemRangeChanged(start, end)
    }

    fun removeRange(start: Int, end: Int) {
        mDataList.subList(start, end).clear()
        this.notifyItemRangeRemoved(start, end)
    }

    fun addRange(start: Int, end: Int, newList: MutableList<Any>) {
        mDataList.addAll(start, newList)
        this.notifyItemRangeInserted(start, end)
    }

    inner class SampleViewHolder(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        private val text: TextView = itemView.findViewById(R.id.item_sample_text)

        fun bind(any: Any) {
            // on donne les valeurs aux elements de la vue
            text.text = R.string.sample_text.toString()

        }
    }

}
