package com.example.migration_view_to_compose.ui.sub3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.migration_view_to_compose.R
import com.example.migration_view_to_compose.databinding.FragmentSub3Binding

class Sub3Fragment : Fragment() {

    companion object {
        fun newInstance() = Sub3Fragment()
    }

    private lateinit var viewModel: Sub3ViewModel
    private lateinit var binding: FragmentSub3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[Sub3ViewModel::class.java]
        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSub3Binding.inflate(inflater, container, false)
        return binding.root
    }
}