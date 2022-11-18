package com.example.migration_view_to_compose.ui.sub3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.migration_view_to_compose.R
import java.util.Locale
import kotlin.Int

class Sub3Adapter : RecyclerView.Adapter<Sub3Adapter.ViewHolder>() {

    private val dataset = arrayOfNulls<String>(50)

    init {
        var i = 0
        while (i < 50) {
            dataset[i] = String.format(Locale.JAPANESE, "RecyclerView_0%d", i)
            i++
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            textView = view.findViewById(R.id.textview)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.sub3_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val item = dataset[position]
        viewHolder.textView.text = item.toString()
    }

    override fun getItemCount() = dataset.size
}