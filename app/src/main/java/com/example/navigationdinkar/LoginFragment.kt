package com.example.navigationdinkar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationdinkar.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    lateinit var loginbtn:Button
    lateinit var view2: View

  //  lateinit var recyclerView:RecyclerView

   // lateinit var viewModel: LoginViewModel
    lateinit var binding: FragmentLoginBinding
//
    private lateinit var recyclerView: RecyclerView
    private val dummyDataList = mutableListOf<String>()
    private lateinit var adapter: DummyDataAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLoginBinding.inflate(layoutInflater)
        recyclerView = binding.recyclerview

        view2 =  inflater.inflate(R.layout.fragment_login, container, false)
        loginbtn = view2.findViewById(R.id.loginbtn)

        recyclerView = view2.findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Create dummy data
        if (dummyDataList.isEmpty()) {
            for (i in 1..20) {
                dummyDataList.add("Item $i")
            }
        }

        // Create and set the adapter
        adapter = DummyDataAdapter(this,dummyDataList)
        recyclerView.adapter = adapter


        return  view2

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        viewModel= ViewModelProvider(this).get(LoginViewModel::class.java)
//        viewModel.init(this,)

//        loginbtn.setOnClickListener {
//            val navController =
//                Navigation.findNavController(
//                    requireActivity(),
//                    R.id.nav_host_fragment
//                )
//
//            navController.navigate(
//                R.id.action_loginFragment_to_mainFragment
//            )
//        }

    }

    override fun onDestroyView() {
        super.onDestroyView()

      Toast.makeText(this.requireContext(), "Ondestroyview", Toast.LENGTH_LONG).show();
    }


}