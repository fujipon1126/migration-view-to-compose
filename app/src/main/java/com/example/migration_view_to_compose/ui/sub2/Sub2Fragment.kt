package com.example.migration_view_to_compose.ui.sub2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.migration_view_to_compose.R
import com.example.migration_view_to_compose.databinding.FragmentSub2Binding

class Sub2Fragment : Fragment() {

    companion object {
        fun newInstance() = Sub2Fragment()
    }

    private lateinit var viewModel: Sub2ViewModel
    private lateinit var binding: FragmentSub2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[Sub2ViewModel::class.java]
        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSub2Binding.inflate(inflater, container, false)
        return binding.root
    }
}