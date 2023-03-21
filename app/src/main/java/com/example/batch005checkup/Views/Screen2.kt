package com.example.batch005checkup.Views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.example.batch005checkup.R
import com.example.batch005checkup.ViewModel.Screen2ViewModel
import com.example.batch005checkup.databinding.FragmentScreen2Binding

class Screen2 : Fragment() {

    private  val viewModel : Screen2ViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_screen2, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

}