package com.example.composetestandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.example.composetestandroid.ui.theme.ComposeTestAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestAndroidTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    val data: List<String> = makeData()
                    ListView(data)
                }
            }
        }
    }

    private fun makeData(): List<String> {
        val _data: Array<String> = arrayOf(
            "꽁치",
            "갈치",
            "고등어",
            "삼치",
            "멸치",
            "참치",
            "쥐치",
            "기타등등",
        )

        return _data.toList()
    }
}

@Composable
fun ListView(data: List<String>) {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        data.forEach {
            ListItem(name = it)
        }
    }
}

@Composable
fun ListItem(name: String) {
    Text(text = "$name")
}