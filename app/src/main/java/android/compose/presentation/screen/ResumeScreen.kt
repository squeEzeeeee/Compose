package android.compose.presentation.screen

import android.compose.Resume.Cap
import android.compose.Resume.ResumeColumn
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun ResumeScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
    ) {
        Cap()
        ResumeColumn()
    }
}