package android.compose

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
import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import org.intellij.lang.annotations.PrintFormat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column() {
                Cap()
                ListItem(name = "Роман Королёв", number = "+79541024498")

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun Cap() {

    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = 5.dp
    )
    {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Image(
                painter = painterResource(id = R.drawable.bell),
                contentDescription = "bell",
                contentScale = ContentScale.Inside,
                modifier = Modifier.size(40.dp)
            )
            Text(text = "Профиль")
            Image(
                painter = painterResource(id = R.drawable.tool),
                contentDescription = "tool",
                contentScale = ContentScale.Inside,
                modifier = Modifier.size(40.dp)
            )

        }


    }
}


@Composable
private fun ListItem(name: String, number: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        elevation = 5.dp,
        shape = RoundedCornerShape(15.dp)
    )
    {
        Box() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.worker),
                    contentDescription = "worker",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column() {
                    Text(text = name)
                    Text(text = number)

                }
            }
        }

    }
}










