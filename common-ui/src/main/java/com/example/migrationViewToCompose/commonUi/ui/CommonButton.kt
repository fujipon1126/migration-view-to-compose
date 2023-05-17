package com.example.migrationViewToCompose.commonUi.ui

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CommonButton(
    modifier: Modifier,
    text: String,
    buttonClick: () -> Unit
) {
    Button(
        modifier = modifier,
        onClick = buttonClick
    ) {
        Text(text = text)
    }
}