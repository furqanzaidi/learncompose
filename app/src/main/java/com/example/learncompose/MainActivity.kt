package com.example.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learncompose.ui.theme.Gray10

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UserID()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview(name: String? = "") {
//    UserID()
}

@Composable
fun UserID() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(10.dp)
            .background(Gray10)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_person),
            contentDescription = "person image",
            modifier = Modifier.padding(start = 7.dp),
            alignment = Alignment.Center
        )
        Column(modifier = Modifier.padding(10.dp)) {
            Text(
                text = "Furqan Zaidi",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(start = 7.dp, top = 3.dp)
            )
            Text(
                text = "App Developer",
                fontSize = 12.sp,
                fontWeight = FontWeight.Light,
                modifier = Modifier.padding(start = 7.dp, top = 3.dp)
            )
        }
    }

}