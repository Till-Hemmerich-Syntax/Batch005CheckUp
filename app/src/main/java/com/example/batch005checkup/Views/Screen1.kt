package com.example.batch005checkup.Views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.batch005checkup.databinding.FragmentScreen1Binding

class Screen1 : Fragment() {

    private var _binding : FragmentScreen1Binding? = null;
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentScreen1Binding.inflate(inflater, container, false)
        val view = binding.root

        return view

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}