package com.idnp.skinguardianapp.data.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.idnp.skinguardianapp.R
import com.idnp.skinguardianapp.data.model.Routine

class RoutinesAdapter(
    var routines: List<Routine>,
    private val onRoutineSelected: (Int)-> Unit,
    private val onButtonClicked: (Long)-> Unit
): RecyclerView.Adapter<RoutinesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoutinesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_routine,parent,false)
        return RoutinesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return routines.size
    }

    override fun onBindViewHolder(holder: RoutinesViewHolder, position: Int) {
        holder.render(
            routines[position],
            position,
            { position ->
                onRoutineSelected(position)
            },
            { position ->
                onButtonClicked(position)
            }
        )
//        holder.itemView.setOnClickListener { onRoutineSelected(position) }
    }
}










