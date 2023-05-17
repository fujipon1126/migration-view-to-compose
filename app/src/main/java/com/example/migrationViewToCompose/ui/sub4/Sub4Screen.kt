package com.example.migrationViewToCompose.ui.sub4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.android.material.composethemeadapter.MdcTheme

@Composable
fun Sub4Screen(
    modifier: Modifier = Modifier,
    buttonClick: () -> Unit
) {
    Surface(
        modifier = modifier.fillMaxSize(),
    ) {
        MdcTheme { // 既存のthemes.xmlを再利用
            Column(
                modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier.padding(bottom = 8.dp),
                    text = "ようこそ、Composeの世界へ",
                    color = MaterialTheme.colors.secondary
                )
                Button(
                    onClick = buttonClick
                ) {
                    Text(text = "ボタンだよ")
                }
            }
        }
    }
}

@Preview
@Composable
fun Sub4ScreenPreview() {
    Sub4Screen(buttonClick = {})
}