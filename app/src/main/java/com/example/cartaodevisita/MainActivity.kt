package com.example.cartaodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaodevisita.ui.theme.CartaoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeVisitaTheme {
                TelaCartaoDeVisita()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TelaCartaoDeVisita() {
    Box {


        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally


        ) {

            Image(
                painter = painterResource(id = R.drawable.gatoecroche),
                contentDescription = null,
                contentScale = ContentScale.Inside,
                modifier = Modifier.size(400.dp),
                alpha = 0.9F

            )


            Text(
                text = "Apenas Mavi ",
                fontSize = 57.sp,
                color = Color.Blue,
                fontWeight = FontWeight.Black,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.padding(top = 80.dp)

            )
            Contato(text = "Celular")
            Contato(text = "ApenasMaviCroche")

        }
    }
}

@Composable
fun Contato(text: String) {
    Row { 
        Text(
            text = text,
            fontSize = 30.sp,
            color = Color.Black,
            fontFamily = FontFamily.Cursive,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(end = 10.dp)

        )
    }
}


