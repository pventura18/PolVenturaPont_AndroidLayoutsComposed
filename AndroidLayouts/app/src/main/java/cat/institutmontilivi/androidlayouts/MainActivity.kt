package cat.institutmontilivi.androidlayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cat.institutmontilivi.androidlayouts.ui.theme.AndroidLayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidLayoutsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticlesComposed2()
                }
            }
        }
    }
}



@Preview(showSystemUi = true)
@Composable
fun PrimersBotons() {
    Box(
        modifier = Modifier
            .background(Color(31, 35, 57))
            .padding(10.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    )
    {
        Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .fillMaxWidth()
                    .align(Alignment.Center)
                    .background(color = Color(192, 192, 192)),
                horizontalArrangement = Arrangement.SpaceBetween
            )
        {
                Button(
                    onClick = { /* Handle button click here */ },
                    modifier = Modifier
                        .padding(10.dp)
                        .weight(1f)
                        .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                    colors = ButtonDefaults.buttonColors(Color(255,147,51))
                )
                {
                    Text(
                        text = "Primer\nbotó",
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center,
                        color = Color(31, 35, 57)
                    )
                }

                Button(
                    onClick = { /* Handle button click here */ },
                    modifier = Modifier
                        .padding(10.dp)
                        .weight(1f)
                        .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                    colors = ButtonDefaults.buttonColors(Color(255,147,51))
                )
                {
                    Text(
                        text = "Segon\nbotó",
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center,
                        color = Color(31, 35, 57)
                    )
                }

                Button(
                    onClick = { /* Handle button click here */ },
                    modifier = Modifier
                        .padding(10.dp)
                        .weight(1f)
                        .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                    colors = ButtonDefaults.buttonColors(Color(255,147,51))

                )
                {
                    Text(
                        text = "Tercer\nbotó",
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center,
                        color = Color(31, 35, 57)
                    )
                }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun CalculadoraComposed() {
    Column(modifier = Modifier
        .background(Color(31, 35, 57))
        .padding(20.dp)
        .fillMaxWidth()
        .fillMaxHeight())
    {
        Text(text = "1.10",
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(50, 50, 50)),
            textAlign = TextAlign.Right,
            fontSize = 40.sp,
            color = Color(255,147,51))

        Row(
            modifier = Modifier.fillMaxWidth()
        )
        {
            Row(
                modifier = Modifier.weight(3f)
            )
            {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                ){
                    Row(
                        modifier = Modifier.weight(1f)
                    ){
                        Button(
                            onClick = { /* Handle button click here */ },
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(10.dp)
                                .weight(1f)
                                .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                            colors = ButtonDefaults.buttonColors(Color(255,147,51))
                        ) {
                            Text(
                                fontSize = 40.sp,
                                text = "1",
                                color = Color(31, 35, 57),
                                modifier = Modifier
                            )

                        }
                        Button(
                            onClick = { /* Handle button click here */ },
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(10.dp)
                                .weight(1f)
                                .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                            colors = ButtonDefaults.buttonColors(Color(255,147,51))
                        ) {
                            Text(
                                fontSize = 40.sp,
                                text = "2",
                                color = Color(31, 35, 57),
                                modifier = Modifier
                            )

                        }
                        Button(
                            onClick = { /* Handle button click here */ },
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(10.dp)
                                .weight(1f)
                                .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                            colors = ButtonDefaults.buttonColors(Color(255,147,51))
                        ) {
                            Text(
                                fontSize = 40.sp,
                                text = "3",
                                color = Color(31, 35, 57),
                                modifier = Modifier
                            )

                        }
                    }
                    Row(
                        modifier = Modifier.weight(1f)
                    ){
                        Button(
                            onClick = { /* Handle button click here */ },
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(10.dp)
                                .weight(1f)
                                .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                            colors = ButtonDefaults.buttonColors(Color(255,147,51))
                        ) {
                            Text(
                                fontSize = 40.sp,
                                text = "4",
                                color = Color(31, 35, 57),
                                modifier = Modifier
                            )

                        }
                        Button(
                            onClick = { /* Handle button click here */ },
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(10.dp)
                                .weight(1f)
                                .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                            colors = ButtonDefaults.buttonColors(Color(255,147,51))
                        ) {
                            Text(
                                fontSize = 40.sp,
                                text = "5",
                                color = Color(31, 35, 57),
                                modifier = Modifier
                            )

                        }
                        Button(
                            onClick = { /* Handle button click here */ },
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(10.dp)
                                .weight(1f)
                                .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                            colors = ButtonDefaults.buttonColors(Color(255,147,51))
                        ) {
                            Text(
                                fontSize = 40.sp,
                                text = "6",
                                color = Color(31, 35, 57),
                                modifier = Modifier
                            )

                        }
                    }
                    Row(
                        modifier = Modifier.weight(1f)
                    ){
                        Button(
                            onClick = { /* Handle button click here */ },
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(10.dp)
                                .weight(1f)
                                .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                            colors = ButtonDefaults.buttonColors(Color(255,147,51))
                        ) {
                            Text(
                                fontSize = 40.sp,
                                text = "7",
                                color = Color(31, 35, 57),
                                modifier = Modifier
                            )

                        }
                        Button(
                            onClick = { /* Handle button click here */ },
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(10.dp)
                                .weight(1f)
                                .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                            colors = ButtonDefaults.buttonColors(Color(255,147,51))
                        ) {
                            Text(
                                fontSize = 40.sp,
                                text = "8",
                                color = Color(31, 35, 57),
                                modifier = Modifier
                            )

                        }
                        Button(
                            onClick = { /* Handle button click here */ },
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(10.dp)
                                .weight(1f)
                                .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                            colors = ButtonDefaults.buttonColors(Color(255,147,51))
                        ) {
                            Text(
                                fontSize = 40.sp,
                                text = "9",
                                color = Color(31, 35, 57),
                                modifier = Modifier
                            )

                        }
                    }
                    Row(
                        modifier = Modifier.weight(1f)
                    ){
                        Button(
                            onClick = { /* Handle button click here */ },
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(10.dp)
                                .weight(1f)
                                .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                            colors = ButtonDefaults.buttonColors(Color(255,147,51))
                        ) {
                            Text(
                                fontSize = 40.sp,
                                text = "0",
                                color = Color(31, 35, 57),
                                modifier = Modifier
                            )

                        }
                    }
                }
            }
            Row(
                modifier = Modifier.weight(1f)
            )
            {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                )
                {
                    Button(
                        onClick = { /* Handle button click here */ },
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .padding(10.dp)
                            .weight(1f)
                            .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                        colors = ButtonDefaults.buttonColors(Color(255,147,51))
                    ) {
                        Text(
                            fontSize = 40.sp,
                            text = "C",
                            color = Color(31, 35, 57),
                            modifier = Modifier
                        )

                    }
                    Button(
                        onClick = { /* Handle button click here */ },
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .padding(10.dp)
                            .weight(1f)
                            .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                        colors = ButtonDefaults.buttonColors(Color(255,147,51))
                    ) {
                        Text(
                            fontSize = 40.sp,
                            text = "+",
                            color = Color(31, 35, 57)
                        )
                    }
                    Button(
                        onClick = { /* Handle button click here */ },
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .padding(10.dp)
                            .weight(1f)
                            .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                        colors = ButtonDefaults.buttonColors(Color(255,147,51))
                    ) {
                        Text(
                            fontSize = 40.sp,
                            text = "=",
                            color = Color(31, 35, 57)
                        )
                    }
                }
            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DibuixComposed(){
    Column(
        modifier = Modifier
            .background(Color(31, 35, 57))
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Box(modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .weight(1F)
        ){
            Box(
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .align(Alignment.Center)
            ){
                Image(
                    painter = painterResource(id = R.drawable.androidoreo),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
        Box(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
                .fillMaxHeight()
                .weight(1F)
        ){
            Box(
                modifier = Modifier
                    .background(Color(254, 87, 34, 255))
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .align(Alignment.Center)
                    .verticalScroll(rememberScrollState())
            ){
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis magna ex, rhoncus et lobortis sed, dapibus non nunc. Nunc consequat, erat in luctus interdum, est velit tempor justo, nec fringilla ex odio in lorem. Aenean diam tellus, facilisis sed nunc quis, posuere faucibus mi. Nullam non porta libero. Nulla vitae nisl a erat tempus maximus.",
                color = Color(31, 35, 57),
                    style = MaterialTheme.typography.displaySmall,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .align(Alignment.Center)
                        )
            }
        }

    }
}

@Preview(showSystemUi = true, heightDp = 2000)
@Composable
fun FormulariComposed(){
    Column(
        modifier = Modifier
            .background(Color(31, 35, 57))
            .fillMaxWidth()
            .fillMaxHeight()
    ){
        Box(modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .weight(1F)
        ){
            Box(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .align(Alignment.Center)
            ){
                Text(text = "Nom (*)",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.align(Alignment.TopStart))
            }
        }

        Box(modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .weight(1F)
        ){
            Box(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .align(Alignment.Center)
            ){
                Text(text = "Cognom (*)",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.align(Alignment.TopStart))
            }
        }

        Box(modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .weight(1F)
        ){
            Box(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .align(Alignment.Center)
            ){
                Text(text = "Correu electrònic (*)",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.align(Alignment.TopStart))
            }
        }

        Box(modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .weight(6F)
        ){
            Box(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .align(Alignment.Center)
            ){
                Text(text = "Missatge (*)",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.align(Alignment.TopStart))
            }
        }

        Row(modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .weight(1F)
        ){
            Checkbox(checked = false, onCheckedChange = {},
                modifier = Modifier.fillMaxHeight())

            Text(text = "Subscriu-me per correu",
                style = MaterialTheme.typography.titleLarge,
                color = Color.White,
            modifier = Modifier
                .align(Alignment.CenterVertically))
        }

        Box(modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .weight(1F)
        ){
            Box(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .align(Alignment.Center)
            ){
                Text(text = "Url del servidor (*)",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.align(Alignment.TopStart))
            }
        }

        Row(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .fillMaxHeight()
                .weight(1F)
        ){
            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier

                    .weight(1f)
                    .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color(255,147,51))
            )
            {
                Text(
                    text = "Confirma",
                    style = MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier

                    .weight(1f)
                    .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color(255,147,51))
            )
            {
                Text(
                    text = "Rebutja",
                    style = MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }
        }
    }
}

@Preview (showSystemUi = true)
@Composable
fun ColorsComposed(){
    Column(modifier = Modifier
        .background(Color(31, 35, 57))
        .padding(5.dp)
        .fillMaxWidth()
        .fillMaxHeight()
    ){
        Row(modifier = Modifier
            .padding(10.dp)
            .weight(2F)){
            Column(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .weight(2F)
            ) {
                Text(text = "Paraula",
                color = Color.White,
                modifier = Modifier.weight(1F))

                Box(modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .weight(2F)
                ){
                    Text(text = "Paraula (max 20 lletres)",
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier.align(Alignment.CenterStart),
                        color = Color.Gray)
                }

                Text(text = "Traducció",
                    color = Color.White,
                    modifier = Modifier.weight(1F))

                Box(modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .weight(2F)
                ){
                    Text(text = "Paraula (max 20 lletres)",
                    style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier.align(Alignment.CenterStart),
                    color = Color.Gray)
                }
            }

            Spacer(modifier = Modifier.width(10.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(1F)
                    .background(Color(255, 147, 51), shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color(255,147,51))
            ){
                Text(
                    text = "Esborra",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }
        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .weight(8F)
            .background(Color(70, 70, 70))
            .padding(10.dp)
            .verticalScroll(rememberScrollState())
        ){
            Text(text = "Afegeix - Edita - Esborra",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.White)

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color(217, 51, 254, 255), shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color(209, 2, 255, 255))
            ){
                Text(
                    text = "Rosa",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color(151, 151, 151, 255), shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color(150, 150, 150, 255))
            ){
                Text(
                    text = "Gris",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color.Red, shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color.Red)
            ){
                Text(
                    text = "Vermell",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color.Green, shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color.Green)
            ){
                Text(
                    text = "Verd",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color.Yellow, shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color.Yellow)
            ){
                Text(
                    text = "Groc",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color.Blue, shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color.Blue)
            ){
                Text(
                    text = "Blau",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color(217, 51, 254, 255), shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color(209, 2, 255, 255))
            ){
                Text(
                    text = "Rosa",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color(151, 151, 151, 255), shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color(150, 150, 150, 255))
            ){
                Text(
                    text = "Gris",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color.Red, shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color.Red)
            ){
                Text(
                    text = "Vermell",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color.Green, shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color.Green)
            ){
                Text(
                    text = "Verd",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color.Yellow, shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color.Yellow)
            ){
                Text(
                    text = "Groc",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color.Blue, shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color.Blue)
            ){
                Text(
                    text = "Blau",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color(217, 51, 254, 255), shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color(209, 2, 255, 255))
            ){
                Text(
                    text = "Rosa",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color(151, 151, 151, 255), shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color(150, 150, 150, 255))
            ){
                Text(
                    text = "Gris",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color.Red, shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color.Red)
            ){
                Text(
                    text = "Vermell",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color.Green, shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color.Green)
            ){
                Text(
                    text = "Verd",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color.Yellow, shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color.Yellow)
            ){
                Text(
                    text = "Groc",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp)
                    .background(Color.Blue, shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color.Blue)
            ){
                Text(
                    text = "Blau",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57)
                )
            }
        }
    }
}

@Composable
fun Articles(){
    Row(
        modifier = Modifier.verticalScroll(rememberScrollState())
            .fillMaxHeight()
            .fillMaxWidth()
    ){
        Column(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .fillMaxHeight()
                .weight(1F)
        ){
            Column(
                modifier = Modifier
                    .background(Color(60, 60, 60))
                    .fillMaxWidth()
                    .fillMaxHeight()
            ){
                Text(text = "ARTICLE 1",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis magna ex, rhoncus et lobortis sed, dapibus non nunc. Nunc consequat, erat in luctus interdum, est velit tempor justo, nec fringilla ex odio in lorem. Aenean diam tellus, facilisis sed nunc quis, posuere faucibus mi. Nullam non porta libero.",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(255, 255, 255, 255),
                    style = MaterialTheme.typography.titleSmall
                )
                Text(text = "---------------",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center
                )


                Text(text = "ARTICLE 2",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis magna ex, rhoncus et lobortis sed, dapibus non nunc. Nunc consequat, erat in luctus interdum, est velit tempor justo, nec fringilla ex odio in lorem. Aenean diam tellus, facilisis sed nunc quis, posuere faucibus mi. Nullam non porta libero.",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(255, 255, 255, 255),
                    style = MaterialTheme.typography.titleSmall
                )
                Text(text = "---------------",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center
                )

                Text(text = "ARTICLE 3",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis magna ex, rhoncus et lobortis sed, dapibus non nunc. Nunc consequat, erat in luctus interdum, est velit tempor justo, nec fringilla ex odio in lorem. Aenean diam tellus, facilisis sed nunc quis, posuere faucibus mi. Nullam non porta libero.",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(255, 255, 255, 255),
                    style = MaterialTheme.typography.titleSmall
                )
                Text(text = "---------------",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center
                )


                Text(text = "ARTICLE 4",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis magna ex, rhoncus et lobortis sed, dapibus non nunc. Nunc consequat, erat in luctus interdum, est velit tempor justo, nec fringilla ex odio in lorem. Aenean diam tellus, facilisis sed nunc quis, posuere faucibus mi. Nullam non porta libero.",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(255, 255, 255, 255),
                    style = MaterialTheme.typography.titleSmall
                )
                Text(text = "---------------",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center
                )


                Text(text = "ARTICLE 5",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis magna ex, rhoncus et lobortis sed, dapibus non nunc. Nunc consequat, erat in luctus interdum, est velit tempor justo, nec fringilla ex odio in lorem. Aenean diam tellus, facilisis sed nunc quis, posuere faucibus mi. Nullam non porta libero.",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(255, 255, 255, 255),
                    style = MaterialTheme.typography.titleSmall
                )
                Text(text = "---------------",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center
                )
            }
        }

        Column(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .fillMaxHeight()
                .weight(1F)){
            Column(
                modifier = Modifier
                    .background(Color(60, 60, 60))
                    .fillMaxWidth()
                    .fillMaxHeight()
            ){
                Text(text = "ARTICLE 6",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis magna ex, rhoncus et lobortis sed, dapibus non nunc. Nunc consequat, erat in luctus interdum, est velit tempor justo, nec fringilla ex odio in lorem.",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(255, 255, 255, 255),
                    style = MaterialTheme.typography.titleSmall
                )
                Text(text = "---------------",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center
                )



                Text(text = "ARTICLE 7",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis magna ex, rhoncus et lobortis sed, dapibus non nunc. Nunc consequat, erat in luctus interdum, est velit tempor justo, nec fringilla ex odio in lorem.",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(255, 255, 255, 255),
                    style = MaterialTheme.typography.titleSmall
                )
                Text(text = "---------------",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center
                )



                Text(text = "ARTICLE 8",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis magna ex, rhoncus et lobortis sed, dapibus non nunc. Nunc consequat, erat in luctus interdum, est velit tempor justo, nec fringilla ex odio in lorem.",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(255, 255, 255, 255),
                    style = MaterialTheme.typography.titleSmall
                )
                Text(text = "---------------",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center
                )



                Text(text = "ARTICLE 9",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis magna ex, rhoncus et lobortis sed, dapibus non nunc. Nunc consequat, erat in luctus interdum, est velit tempor justo, nec fringilla ex odio in lorem.",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(255, 255, 255, 255),
                    style = MaterialTheme.typography.titleSmall
                )
                Text(text = "---------------",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center
                )



                Text(text = "ARTICLE 10",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis magna ex, rhoncus et lobortis sed, dapibus non nunc. Nunc consequat, erat in luctus interdum, est velit tempor justo, nec fringilla ex odio in lorem.",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(255, 255, 255, 255),
                    style = MaterialTheme.typography.titleSmall
                )
                Text(text = "---------------",
                    modifier = Modifier.fillMaxWidth(),
                    color = Color(254, 146, 51, 255),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ArticlesComposed1(){
    Column(
        modifier = Modifier
            .background(Color(31, 35, 57))
            .padding(10.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ){
        Text(text = "Dues columnes",
            color = Color.White,
            style = MaterialTheme.typography.displaySmall,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
            )
        Articles()
    }
}

@Preview(showSystemUi = true)
@Composable
fun ArticlesComposed2(){
    Column(
        modifier = Modifier
            .background(Color(31, 35, 57))
            .padding(10.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ){
        Text(text = "Dues columnes",
            color = Color.White,
            style = MaterialTheme.typography.displaySmall,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(modifier = Modifier.horizontalScroll(rememberScrollState())){
            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .background(Color(251, 144, 51, 255), shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color(251,144,51,255))
            ){
                Text(
                    text = "INICI",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57),
                )
            }

            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .background(Color(251, 144, 51, 255), shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color(251,144,51,255))
            ){
                Text(
                    text = "ACTUALITAT",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57),
                )
            }

            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .background(Color(251, 144, 51, 255), shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color(251,144,51,255))
            ){
                Text(
                    text = "ESPORTS",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57),
                )
            }

            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .background(Color(251, 144, 51, 255), shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color(251,144,51,255))
            ){
                Text(
                    text = "ECONOMIA",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57),
                )
            }

            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .background(Color(251, 144, 51, 255), shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color(251,144,51,255))
            ){
                Text(
                    text = "POLITICA",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57),
                )
            }

            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .background(Color(251, 144, 51, 255), shape = RoundedCornerShape(10)),
                colors = ButtonDefaults.buttonColors(Color(251,144,51,255))
            ){
                Text(
                    text = "TECNOLOGIA",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(31, 35, 57),
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Articles()
    }
}