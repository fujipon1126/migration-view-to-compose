package com.example.migrationViewToCompose.ui.sub5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ScaleGestureDetector
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.migrationViewToCompose.databinding.FragmentSub5Binding

class Sub5Fragment : Fragment() {

    private lateinit var binding: FragmentSub5Binding

    var scaleFactor = 1f
    private lateinit var scaleGestureDetector: ScaleGestureDetector

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        scaleGestureDetector = ScaleGestureDetector(
//            requireContext(),
//            object : ScaleGestureDetector.SimpleOnScaleGestureListener() {
//                override fun onScale(detector: ScaleGestureDetector): Boolean {
//                    scaleFactor *= detector.scaleFactor
//                    scaleFactor = scaleFactor.coerceIn(0.1f, 5.0f)
//
//                    binding.edit.scaleX = scaleFactor
//                    binding.edit.scaleY = scaleFactor
//
//                    return super.onScale(detector)
//                }
//            }
//        )
//    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSub5Binding.inflate(inflater, container, false)
        return binding.root
    }

//    @SuppressLint("ClickableViewAccessibility")
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        binding.edit.setOnTouchListener { _, event ->
//            scaleGestureDetector.onTouchEvent(event)
//            true
//        }
//    }
}

