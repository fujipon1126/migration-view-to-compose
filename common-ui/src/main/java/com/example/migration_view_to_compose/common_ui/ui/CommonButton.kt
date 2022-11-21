package com.example.migration_view_to_compose.common_ui.ui

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun CommonButton(
    text: String,
    buttonClick: () -> Unit
) {
    Button(
        onClick = buttonClick
    ) {
        Text(text = text)
    }
}