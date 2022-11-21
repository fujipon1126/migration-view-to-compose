package com.example.migration_view_to_compose.ui.sub3

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.android.material.composethemeadapter.MdcTheme
import java.util.Locale

@Composable
fun Sub3Screen(
    modifier: Modifier = Modifier
) {
    MdcTheme {
        Surface(modifier = modifier.fillMaxSize()) {
            LazyColumn {
                items(50) { index ->
                    Text(
                        modifier = modifier.fillMaxWidth(),
                        fontSize = 30.sp,
                        textAlign = TextAlign.Center,
                        text = String.format(Locale.JAPANESE, "RecyclerView_0%d", index),
                        color = MaterialTheme.colors.secondary
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun Sub3ScreenPreview() {
    Sub3Screen()
}