package com.example.navigationdinkar

import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager

class LoginViewModel:ViewModel() {
    lateinit var causefragment: LoginFragment

    private val dummyDataList = mutableListOf<String>()
    private lateinit var adapter: DummyDataAdapter

    fun init(activity: LoginFragment) {
        causefragment = activity

if (dummyDataList.isEmpty()) {
   // setrecyclerview()
}

    }

//    private fun setrecyclerview() {
//
//        causefragment.recyclerView.layoutManager = LinearLayoutManager(causefragment.requireContext())
//
//        // Create dummy data
//        for (i in 1..20) {
//            dummyDataList.add("Item $i")
//        }
//
//        // Create and set the adapter
//        adapter = DummyDataAdapter(causefragment,dummyDataList)
//        causefragment.recyclerView.adapter = adapter
//    }


}