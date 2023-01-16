package com.example.myimage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myimage.ui.theme.MyImageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyImageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyImageTheme()
                }
            }
        }
    }
}

@Composable
fun ChangeImageAndText(modifier: Modifier = Modifier){
    var result by remember { mutableStateOf(1)}
    var count by remember { mutableStateOf(1)}

    val descripeResource = when (result){
        1 -> R.string.pha_dong_thap
        2 -> R.string.chua_ba
        3 -> R.string.chua_hang
        4 -> R.string.song_ta_pa
        5 -> R.string.cham_chim
        else -> R.string.tt_phu_yen
    }

    val titleResource = when (result){
        1 -> R.string.pha_dong_thap_title
        2 -> R.string.chua_ba_title
        3 -> R.string.chua_hang_title
        4 -> R.string.song_ta_pa_title
        5 -> R.string.cham_chim_title
        else -> R.string.tt_phu_yen_title
    }

    val imageResource = when(result){
        1 -> R.drawable.pha_dong_thap
        2 -> R.drawable.chua_ba
        3 -> R.drawable.chua_hang
        4 -> R.drawable.song_ta_pa
        5 -> R.drawable.cham_chim
        else -> R.drawable.tt_phu_yen
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        when (result){
            1 -> {
                Image(
                    painter = painterResource(imageResource),
                    contentDescription = result.toString(),

                    modifier = Modifier
                        .border(
                            BorderStroke(2.dp, Color(0, 0, 0)),
                            shape = RoundedCornerShape(4.dp)
                        )
                        .padding(16.dp)
                )

                Spacer(modifier = Modifier.height(100.dp))

                Column(
                    modifier = Modifier
                        .border(
                            BorderStroke(2.dp, Color(0, 0, 0)),
                            shape = RoundedCornerShape(4.dp)
                        )
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(text = stringResource(descripeResource), fontSize = 32.sp)
                    Text(text = stringResource(titleResource), fontSize = 32.sp)
                }

                Spacer(modifier = Modifier.height(164.dp))

                Row(Modifier.weight(.5f)) {
                    Button(onClick = { result = 6 }) {
                        Text(text = "Previous", fontSize = 24.sp)
                    }
                    Button(
                        onClick = { result++}) {
                        Text(text = "Next", fontSize = 24.sp)
                    }
                }
            }
            2 -> {
                Image(
                    painter = painterResource(imageResource),
                    contentDescription = result.toString(),

                    modifier = Modifier
                        .border(
                            BorderStroke(2.dp, Color(0, 0, 0)),
                            shape = RoundedCornerShape(4.dp)
                        )
                        .padding(16.dp)
                )
                Spacer(modifier = Modifier.height(100.dp))

                Column(
                    modifier = Modifier
                        .border(
                            BorderStroke(2.dp, Color(0, 0, 0)),
                            shape = RoundedCornerShape(4.dp)
                        )
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(text = stringResource(descripeResource), fontSize = 32.sp)
                    Text(text = stringResource(titleResource), fontSize = 32.sp)
                }

                Spacer(modifier = Modifier.height(164.dp))

                Row(Modifier.weight(.5f)) {
                    Button(onClick = { result--}) {
                        Text(text = "Previous", fontSize = 24.sp)
                    }
                    Button(onClick = { result++}) {
                        Text(text = "Next", fontSize = 24.sp)
                    }
                }
            }
            3 ->  {
                Image(
                    painter = painterResource(imageResource),
                    contentDescription = result.toString(),

                    modifier = Modifier
                        .border(
                            BorderStroke(2.dp, Color(0, 0, 0)),
                            shape = RoundedCornerShape(4.dp)
                        )
                        .padding(16.dp)
                )
                Spacer(modifier = Modifier.height(100.dp))

                Column(
                    modifier = Modifier
                        .border(
                            BorderStroke(2.dp, Color(0, 0, 0)),
                            shape = RoundedCornerShape(4.dp)
                        )
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(text = stringResource(descripeResource), fontSize = 32.sp)
                    Text(text = stringResource(titleResource), fontSize = 32.sp)
                }

                Spacer(modifier = Modifier.height(164.dp))

                Row(Modifier.weight(.5f)) {
                    Button(onClick = { result--}) {
                        Text(text = "Previous", fontSize = 24.sp)
                    }
                    Button(onClick = { result++}) {
                        Text(text = "Next", fontSize = 24.sp)
                    }
                }
            }
            4 ->  {
                Image(
                    painter = painterResource(imageResource),
                    contentDescription = result.toString(),

                    modifier = Modifier
                        .border(
                            BorderStroke(2.dp, Color(0, 0, 0)),
                            shape = RoundedCornerShape(4.dp)
                        )
                        .padding(16.dp)
                )
                Spacer(modifier = Modifier.height(100.dp))

                Column(
                    modifier = Modifier
                        .border(
                            BorderStroke(2.dp, Color(0, 0, 0)),
                            shape = RoundedCornerShape(4.dp)
                        )
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(text = stringResource(descripeResource), fontSize = 32.sp)
                    Text(text = stringResource(titleResource), fontSize = 32.sp)
                }

                Spacer(modifier = Modifier.height(164.dp))

                Row(Modifier.weight(.5f)) {
                    Button(onClick = { result--}) {
                        Text(text = "Previous", fontSize = 24.sp)
                    }
                    Button(onClick = { result++}) {
                        Text(text = "Next", fontSize = 24.sp)
                    }
                }
            }
            5 ->  {
                Image(
                    painter = painterResource(imageResource),
                    contentDescription = result.toString(),

                    modifier = Modifier
                        .border(
                            BorderStroke(2.dp, Color(0, 0, 0)),
                            shape = RoundedCornerShape(4.dp)
                        )
                        .padding(16.dp)
                )
                Spacer(modifier = Modifier.height(100.dp))

                Column(
                    modifier = Modifier
                        .border(
                            BorderStroke(2.dp, Color(0, 0, 0)),
                            shape = RoundedCornerShape(4.dp)
                        )
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(text = stringResource(descripeResource), fontSize = 32.sp)
                    Text(text = stringResource(titleResource), fontSize = 32.sp)
                }

                Spacer(modifier = Modifier.height(164.dp))

                Row(Modifier.weight(.5f)) {
                    Button(onClick = { result--}) {
                        Text(text = "Previous", fontSize = 24.sp)
                    }
                    Button(onClick = { result++}) {
                        Text(text = "Next", fontSize = 24.sp)
                    }
                }
            }
            else -> {
                Image(
                    painter = painterResource(imageResource),
                    contentDescription = result.toString(),

                    modifier = Modifier
                        .border(
                            BorderStroke(2.dp, Color(0, 0, 0)),
                            shape = RoundedCornerShape(4.dp)
                        )
                        .padding(16.dp)
                )
                Spacer(modifier = Modifier.height(100.dp))

                Column(
                    modifier = Modifier
                        .border(
                            BorderStroke(2.dp, Color(0, 0, 0)),
                            shape = RoundedCornerShape(4.dp)
                        )
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(text = stringResource(descripeResource), fontSize = 32.sp)
                    Text(text = stringResource(titleResource), fontSize = 32.sp)
                }

                Spacer(modifier = Modifier.height(164.dp))

                Row(Modifier.weight(.5f)) {
                    Button(onClick = { result--}) {
                        Text(text = "Previous", fontSize = 24.sp)
                    }
                    Button(onClick = { result = 1}) {
                        Text(text = "Next", fontSize = 24.sp)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyImageTheme() {
    ChangeImageAndText(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )
}
