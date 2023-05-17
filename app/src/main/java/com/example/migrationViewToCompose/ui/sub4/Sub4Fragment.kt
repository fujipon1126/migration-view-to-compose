package com.example.migrationViewToCompose.ui.sub4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.Fragment
import com.google.android.material.composethemeadapter.MdcTheme

class Sub4Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setViewCompositionStrategy(
                ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed
            )
            setContent {
                MdcTheme {
                    // 新しいComposable
                    Sub4Screen(
                        buttonClick = {
                            Toast.makeText(context, "ボタンタップした", Toast.LENGTH_LONG).show()
                        }
                    )
                }
            }
        }
    }
}