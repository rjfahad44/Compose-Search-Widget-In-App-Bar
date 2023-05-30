package com.ft.compose_search_widget_in_app_bar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ft.compose_search_widget_in_app_bar.ui.theme.ComposeSearchWidgetInAppBarTheme

class MainActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSearchWidgetInAppBarTheme {
                MainScreen(mainViewModel = mainViewModel)
            }
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun MainScreenPreview() {
    MainScreen(mainViewModel = MainViewModel())
}

