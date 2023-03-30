package com.example.migration_view_to_compose.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.migration_view_to_compose.MainActivity
import com.example.migration_view_to_compose.R
import com.example.migration_view_to_compose.common_ui.ui.CommonButton
import com.example.migration_view_to_compose.databinding.FragmentMainBinding
import com.google.android.material.composethemeadapter.MdcTheme

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: FragmentMainBinding
    private val Fragment.mainActivity: MainActivity?
        get() = this.activity as? MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            // sub1ButtonをComposeViewに置き換え
//            sub1Button.setOnClickListener {
//                mainActivity?.navigateTo(R.id.sub1_fragment)
//            }
            sub1Button.setContent {
                MdcTheme {
                    // common-uiのボタンを利用する
                    CommonButton(
                        modifier = Modifier.padding(start = 8.dp, top = 8.dp),
                        text = "To Sub1"
                    ) {
                        mainActivity?.navigateTo(R.id.sub1_fragment)
                    }
                }
            }
            sub2Button.setOnClickListener {
                mainActivity?.navigateTo(R.id.sub2_fragment)
            }
            sub3Button.setOnClickListener {
                mainActivity?.navigateTo(R.id.sub3_fragment)
            }
            sub4Button.setOnClickListener {
                mainActivity?.navigateTo(R.id.sub4_fragment)
            }
            sub5Button.setOnClickListener {
                mainActivity?.navigateTo(R.id.sub5_fragment)
            }
        }

    }

}