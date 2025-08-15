package com.example.myjetpackcompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Size
import com.example.myjetpackcompose.ui.theme.Black10
import com.example.myjetpackcompose.ui.theme.MyJetpackComposeTheme
import com.example.myjetpackcompose.ui.theme.Orange10

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyJetpackComposeTheme {

//                BasicUiRowColumn()

//                BasicUiBox()

//                BasicStates()

//                BasicTextFieldUI()

                BasicImage()

            }
        }
    }
}

@Composable
fun BasicUiRowColumn() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {
        Text(
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
            text = "Column Vrs Row",
            color = Orange10
        )

        Row(
            modifier = Modifier.fillMaxWidth(.5f), horizontalArrangement = Arrangement.SpaceAround

        ) {

            Button(
                onClick = {}) {
                Text(
                    text = "Row 1"
                )
            }

            Button(
                onClick = {}) {
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
            .padding(top = 50.dp, bottom = 50.dp, start = 20.dp, end = 20.dp)

            .clip(RoundedCornerShape(10.dp))
            .background(Color.White),
    ) {

        Button(
            modifier = Modifier.align(
                Alignment.TopStart
            ), onClick = {}) {
            Text(
                text = "Box Top Start"
            )
        }

        Button(
            modifier = Modifier.align(
                Alignment.TopEnd
            ), onClick = {}) {
            Text(
                text = "Box Top End"
            )
        }


        Button(
            modifier = Modifier.align(
                Alignment.Center
            ), onClick = {}) {
            Text(
                text = "Box Center"
            )
        }

        Button(
            modifier = Modifier.align(
                Alignment.BottomStart
            ), onClick = {}) {
            Text(
                text = "Box Bottom Start"
            )
        }

        Button(
            modifier = Modifier.align(
                Alignment.BottomEnd
            ), onClick = {}) {
            Text(
                text = "Box Bottom End"
            )
        }

    }

}

@Composable
fun BasicStates() {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {

        val textStateVisibilty = remember {
            mutableStateOf(true)
        }


        val ts = if (textStateVisibilty.value) "Text Visible" else "Text Not Visible "


//        if (textStateVisibilty.value) {
//            Text(
//                text = "Text Visible"
//            )
//        }

        Text(
            modifier = Modifier.alpha(
                if (textStateVisibilty.value) 1f else 0.3f
            ), text = ts
        )


        Spacer(
            modifier = Modifier.height(50.dp)

        )


        Button(
            onClick = {
                textStateVisibilty.value = !textStateVisibilty.value
            }) {
            Text(
                text = "Change Visibilty"
            )
        }


    }


}

@Composable
fun BasicTextFieldUI() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var textInput by remember {
            mutableStateOf("")
        }


        /** Best for: Most standard UI forms. **/
//        TextField(
//            value = textInput,
//            onValueChange = { newText ->
//                textInput = newText
//            },
//            label = {
//                Text(text = "Name")
//            },
//            textStyle = TextStyle(
//                color = Black10,
//                fontStyle = FontStyle.Italic,
//            ),
//            leadingIcon = {Icon(
//                imageVector = Icons.Default.Person,
//                contentDescription = null,
//                )}
//        )

        /** Best for: When you need full control over the look & feel. **/
        BasicTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .clip(RoundedCornerShape(50.dp))
                .background(MaterialTheme.colorScheme.primaryContainer)
                .padding(16.dp),
            value = textInput,
            onValueChange = {
                textInput = it
            },
            cursorBrush = SolidColor(MaterialTheme.colorScheme.primary),
            maxLines = 1,
            singleLine = true,
            textStyle = TextStyle(
                color = Black10,
                fontSize = 18.sp,
                fontStyle = FontStyle.Italic,
            ),
            decorationBox = { innerTextField ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {

                    Icon(
                        imageVector = Icons.Default.Search, contentDescription = null
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Box(
                        modifier = Modifier.weight(1f)
                    ) {

                        if (textInput.isEmpty()) {
                            Text(
                                text = "Search",
                                color = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)
                            )
                        }

                        innerTextField()


                    }

                    if (textInput.isNotEmpty()) {

                        Spacer(modifier = Modifier.width(8.dp))

                        Icon(
                            modifier = Modifier.clickable {
                                textInput = ""
                            }, imageVector = Icons.Default.Clear, contentDescription = null
                        )

                    }
                }
            }


        )
    }
}

@Composable
fun BasicImage() {

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .padding(all = 10.dp),
    ) {
//        Image(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(all = 10.dp),
//            painter = painterResource(id = R.drawable.image),
//            contentDescription = "My Image",
//        )


        Spacer(
            modifier = Modifier.height(50.dp)
        )


        var imageUrl = "https://i.pravatar.cc/300"


        var model =
            ImageRequest.Builder(LocalContext.current).data(imageUrl).size(Size.ORIGINAL).build()

        AsyncImage(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(Color.LightGray),
            model = model,
            contentDescription = "Async Image",

            )


        Spacer(
            modifier = Modifier.height(50.dp)
        )


        var imageState = rememberAsyncImagePainter(model = model).state



        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ) {

            //
            if (imageState is AsyncImagePainter.State.Success) {
                Image(
                    modifier = Modifier
                        .fillMaxSize()
                        .height(200.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color.LightGray),
                    painter = imageState.painter,
                    contentDescription = "Async Image Success"
                )

            }
            //
            if (imageState is AsyncImagePainter.State.Loading) {
                CircularProgressIndicator(
                    modifier = Modifier
                        .clip(RoundedCornerShape(20.dp))
                        .align(Alignment.Center),
                    color = Color.Red
                )


            }
            //
            if (imageState is AsyncImagePainter.State.Error) {
                Icon(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color.LightGray),
                    imageVector = Icons.Default.Clear,
                    contentDescription = "Async Image Error",
                    tint = Color.Red
                )

            }

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