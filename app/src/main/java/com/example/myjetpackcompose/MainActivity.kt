package com.example.myjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.myjetpackcompose.ui.theme.MyJetpackComposeTheme
import com.example.myjetpackcompose.ui.theme.Orange10

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyJetpackComposeTheme {

//                BasicUiRowColumn()

                BasicUiBox()

            }
        }
    }
}


@Composable
fun BasicUiRowColumn() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    )
    {
        Text(
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally),
            text = "Column Vrs Row",
            color = Orange10
        )

        Row(
            modifier = Modifier
                .fillMaxWidth(.5f),
            horizontalArrangement = Arrangement.SpaceAround

        )
        {

            Button(
                onClick = {}
            ) {
                Text(
                    text = "Row 1"
                )
            }

            Button(
                onClick = {}
            ) {
                Text(
                    text = "Row 2"
                )
            }

        }


    }

}

@Composable
fun BasicUiBox() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .padding(top=50.dp,bottom=50.dp,start=20.dp,end=20.dp)

            .clip(RoundedCornerShape(10.dp))
            .background(Color.White)



        ,
    )
    {

        Button(
            modifier = Modifier
                .align(
                    Alignment.TopStart
                ),
            onClick = {}
        ) {
            Text(
                text = "Box Top Start"
            )
        }

        Button(
            modifier = Modifier
                .align(
                    Alignment.TopEnd
                ),
            onClick = {}
        ) {
            Text(
                text = "Box Top End"
            )
        }


        Button(
            modifier = Modifier
                .align(
                    Alignment.Center
                ),
            onClick = {}
        ) {
            Text(
                text = "Box Center"
            )
        }

        Button(
            modifier = Modifier
                .align(
                    Alignment.BottomStart
                ),
            onClick = {}
        ) {
            Text(
                text = "Box Bottom Start"
            )
        }

        Button(
            modifier = Modifier
                .align(
                    Alignment.BottomEnd
                ),
            onClick = {}
        ) {
            Text(
                text = "Box Bottom End"
            )
        }

    }

}


//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MyJetpackComposeTheme {
//        Greeting("Android")
//    }
//}