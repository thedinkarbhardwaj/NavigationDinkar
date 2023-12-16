package com.example.navigationdinkar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView

class DummyDataAdapter(var contex: LoginFragment, private val data: List<String>) : RecyclerView.Adapter<DummyDataAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.textView.text = item

        holder.textView.setOnClickListener{
            val navController =
                Navigation.findNavController(
                    contex.requireActivity(),
                    R.id.nav_host_fragment
                )

            navController.navigate(
                R.id.action_loginFragment_to_mainFragment
            )
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}
