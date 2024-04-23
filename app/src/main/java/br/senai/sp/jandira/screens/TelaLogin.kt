package br.senai.sp.jandira.screens

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.ui.theme.My_TripsTheme


@Composable
fun TelaLogin(controledenavegacao: NavHostController) {

    var emailState = remember {
        mutableStateOf("")
    }

    var senhaState = remember {
        mutableStateOf("")
    }

    var erroState = remember {
        mutableStateOf(false)
    }

    var mensagemErrorState = remember {
        mutableStateOf("")
    }

    //exemplo
    var contexto = LocalContext.current

    My_TripsTheme {
        Column(
        ) {

            Card(

                modifier = Modifier
                    .height(40.dp)
                    .width(150.dp)
                    .padding(0.dp)
                    .offset(x = 250.dp, y = -4.dp),
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF9036A0))

            ) {


            }

            Column(
                modifier = Modifier
                    .height(1200.dp)
                    .fillMaxWidth()
            ) {
                Column(

                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)

                ) {
                    Text(
                        text = "Login",
                        textAlign = TextAlign.Center,

                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 47.sp,
                        modifier = Modifier
                            .offset(x = 1.dp, y = 120.dp)
                            .padding(bottom = 40.dp),
                        color = Color(0xFF9036A0),


                        )
                    Text(
                        text = "E-Please sign in to continue.",
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 15.sp,
                        modifier = Modifier
                            .offset(x = 1.dp, y = 76.dp)
                            .padding(bottom = 5.dp),
                        color = Color(0xFFCAC6CA)
                    )

                    Spacer(modifier = Modifier.height(145.dp))

                    Text(
                        text = mensagemErrorState.value,
                        color = Color.Red
                    )

                    OutlinedTextField(
                        value = emailState.value,
                        onValueChange = {
                            emailState.value = it
                        },
                        isError = erroState.value,
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Filled.Email,
                                contentDescription = "",
                                tint = Color(0xFF9036A0)
                            )
                        },
                        label = {
                            Text(text = "E-mail")
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0xFF9036A0),
                            unfocusedBorderColor = Color(color = 0xFF9036A0),
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))


                    OutlinedTextField(
                        value = senhaState.value,
                        onValueChange = {
                            senhaState.value = it
                        },
                        isError = erroState.value,
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Filled.Lock,
                                contentDescription = "",
                                tint = Color(0xFF9036A0)
                            )
                        },
                        label = {
                            Text(text = "Senha")
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0xFF9036A0),
                            unfocusedBorderColor = Color(color = 0xFF9036A0),
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    Button(
                        onClick = {
                            if (emailState.value == "aluno@gmail.com" && senhaState.value == "1234") {
                                //chamar a tela home
                                controledenavegacao.navigate("Home")
                            } else {
                                erroState.value = true
                                mensagemErrorState.value = "Usuário ou senha inválidos!!"
                            }
                        },

                        modifier = Modifier
                            .height(50.dp)
                            .width(130.dp)
                            .offset(x = 220.dp),
                        shape = RoundedCornerShape(15.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF9036A0)
                        )
                    ) {
                        Row {
                            Text(
                                text = "SING IN ",
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.offset()
                            )
                            Icon(
                                imageVector = Icons.Filled.ArrowForward,
                                contentDescription = ""
                            )

                        }
                    }
                    Text(
                        text = "Don't have an account?",
                        fontSize = 15.sp,
                        color = Color(0xFFC2C1C2),
                        modifier = Modifier.offset(x = 120.dp, y = 30.dp),
                        fontWeight = FontWeight.Bold
                    )

                    Button(
                        onClick = {
                            controledenavegacao.navigate("Cadastro")
                        },
                        modifier = Modifier.offset(x = 270.dp, y = -4.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0x00FFFFFF))
                    ) {
                        Text(
                            text = "Sing Up",
                            fontSize = 15.sp,
                            color = Color(0xFF9036A0),
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .height(40.dp)
                        .width(150.dp)
                        .offset(x = -20.dp, y = 160.dp),
                    colors = CardDefaults.cardColors(Color(0xFF9036A0))
                ) {

                }

            }

        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaLoginPreview() {
    My_TripsTheme {
        //TelaLogin()

    }
}