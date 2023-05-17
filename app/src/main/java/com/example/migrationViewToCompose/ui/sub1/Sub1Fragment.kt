package com.example.migrationViewToCompose.ui.sub1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.migrationViewToCompose.databinding.FragmentSub1Binding

class Sub1Fragment : Fragment() {

    companion object {
        fun newInstance() = Sub1Fragment()
    }

    private lateinit var viewModel: Sub1ViewModel
    private lateinit var binding: FragmentSub1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[Sub1ViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSub1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            button.setOnClickListener {
                if (editText.text.isNullOrEmpty()) {
                    Toast.makeText(context, "何か入力してよ！！！", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                // 入力した文字をTextViewにコピーしてEditTextはクリア
                text.text = editText.text
                editText.text.clear()
            }
        }
    }
}