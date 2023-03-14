package android.compose.Resume

import android.compose.presentation.screen.ResumeScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.compose.ui.theme.ComposeTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ResumeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ResumeScreen()
        }
    }
}

@Composable
fun Cap() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Резюме", fontSize = 28.sp)
        }
    }
}

@Composable
fun ResumeColumn() {
    LazyColumn(modifier = Modifier.padding(start = 10.dp, top = 10.dp)) {
        itemsIndexed(
            listOf(
                ResumeModel(
                    "Королёв Роман Сергеевич",
                    "50000",
                    "100000",
                    "Мобильный разрабочтик"
                ),
                ResumeModel(
                    "Королёв Роман Сергеевич",
                    "50000",
                    "100000",
                    "Мобильный разрабочтик"
                ),
                ResumeModel(
                    "Королёв Роман Сергеевич",
                    "50000",
                    "100000",
                    "Мобильный разрабочтик"
                ),
                ResumeModel(
                    "Королёв Роман Сергеевич",
                    "50000",
                    "100000",
                    "Мобильный разрабочтик"
                ),
                ResumeModel(
                    "Королёв Роман Сергеевич",
                    "50000",
                    "100000",
                    "Мобильный разрабочтик"
                ),
                ResumeModel(
                    "Королёв Роман Сергеевич",
                    "50000",
                    "100000",
                    "Мобильный разрабочтик"
                ),
                ResumeModel(
                    "Королёв Роман Сергеевич",
                    "50000",
                    "100000",
                    "Мобильный разрабочтик"
                ),
                ResumeModel(
                    "Королёв Роман Сергеевич",
                    "50000",
                    "100000",
                    "Мобильный разрабочтик"
                ),
                ResumeModel(
                    "Королёв Роман Сергеевич",
                    "50000",
                    "100000",
                    "Мобильный разрабочтик"
                )

            )
        ) { _, item ->
            ItemResume(item)
    }
}

}