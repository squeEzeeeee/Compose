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
import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import org.intellij.lang.annotations.PrintFormat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column() {
                Cap()
                ListItem(name = "Роман Королёв", number = "+79541024498")
                profButton("Моё Резюме")

            }
        }
    }
}


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
                modifier = Modifier
                    .size(40.dp)
                    .clickable {

                    }
            )
            Text(text = "Профиль")
            Image(
                painter = painterResource(id = R.drawable.tool),
                contentDescription = "tool",
                contentScale = ContentScale.Inside,
                modifier = Modifier
                    .size(40.dp)
                    .clickable {

                    }
            )

        }


    }
}


@Composable
private fun ListItem(name: String, number: String) {
    Card(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .fillMaxSize(0.2f)
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
                        .size(100.dp)
                        .clip(CircleShape)
                )
                Column() {
                    Text(text = name, fontSize = 25.sp)
                    Text(text = number, fontSize = 17.sp)

                }
            }
        }

    }
}

@Preview
@Composable
private fun profButton(context: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.13f)
            .padding(10.dp),
        elevation = 5.dp,
        shape = RoundedCornerShape(15.dp),
    ) {
        Box(modifier = Modifier.background(Color.Black),
            contentAlignment = Alignment.Center){
            Text(text = context, color=Color.White)
        }


    }


}











