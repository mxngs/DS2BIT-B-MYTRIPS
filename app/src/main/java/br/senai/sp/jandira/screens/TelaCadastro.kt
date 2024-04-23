package br.senai.sp.jandira.screens


import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.R

@Composable
fun TelaCadastro(controledenavegacao: NavHostController) {

    var nomeState = remember {
        mutableStateOf("")
    }

    var numeroState = remember {
        mutableStateOf("")
    }

    var emailState = remember {
        mutableStateOf("")
    }

    var senhaState = remember {
        mutableStateOf("")
    }

    //exemplo
    var contexto = LocalContext.current

    var lembrarState = remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .height(40.dp)
                .fillMaxWidth()
        ) {
            Card(
                modifier = Modifier
                    .width(160.dp)
                    .fillMaxHeight()
                    .padding(0.dp)
                    .offset(x = 8.dp, y = -1.dp),
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(Color(0xFF9036A0)),
            ) {

            }
        }

        Text(
            text = "Sign Up",
            fontSize = 30.sp,
            color = (Color(0xFF9036A0)),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.offset(x = 130.dp, y = 30.dp)
        )

        Text(
            text = "Create a new account",
            fontSize = 15.sp,
            color = (Color(0xFF757272)),
            modifier = Modifier.offset(x = 120.dp, y = 35.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.contorno),
            contentDescription = "",
            modifier = Modifier
                .offset(x = 160.dp, y = 60.dp)
                .size(width = 80.dp, height = 80.dp)
        )

        Icon(
            imageVector = Icons.Filled.AccountCircle, contentDescription = "",
            tint = Color(0xFF9036A0),
            modifier = Modifier
                .offset(x = 165.dp, y = -15.dp)
                .size(width = 70.dp, height = 70.dp)
        )
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = "",
            tint = Color(0xFF9036A0),
            modifier = Modifier
                .offset(x = 216.dp, y = -30.dp)
                .clickable {
                    Toast
                        .makeText(
                            contexto,
                            "Adiconar Foto!!",
                            Toast.LENGTH_SHORT
                        )
                        .show()
                }
        )
    }

    Card(
        modifier = Modifier
            .width(380.dp)
            .height(480.dp)
            .offset(x = 10.dp, y = 250.dp),
        colors = CardDefaults.cardColors(Color.Transparent)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(10.dp)
        ) {
            OutlinedTextField(
                value = nomeState.value,
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.AccountCircle,
                        contentDescription = "",
                        tint = Color(0xFF9036A0)
                    )
                },
                label = {
                    Text(text = "Username")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xFF9036A0),
                    unfocusedTextColor = Color(0xFF9036A0)
                )
            )

            Spacer(modifier = Modifier.height(15.dp))

            OutlinedTextField(
                value = numeroState.value,
                onValueChange = {
                                numeroState.value = it
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Phone,
                        contentDescription = "",
                        tint = Color(0xFF9036A0)
                    )
                },
                label = {
                    Text(text = "Phone")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xFF9036A0),
                    unfocusedTextColor = Color(0xFF9036A0)
                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
            )

            Spacer(modifier = Modifier.height(15.dp))

            OutlinedTextField(
                value = emailState.value,
                onValueChange = {
                    emailState.value = it
                },
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
                    Text(text = "Email")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xFF9036A0),
                    unfocusedTextColor = Color(0xFF9036A0)
                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )

            Spacer(modifier = Modifier.height(15.dp))

            OutlinedTextField(
                value = senhaState.value,
                onValueChange = {
                    senhaState.value = it
                },
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
                    Text(text = "Password")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xFF9036A0),
                    unfocusedTextColor = Color(0xFF9036A0)
                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )


            Checkbox(
                checked = lembrarState.value,
                onCheckedChange = {
                    lembrarState.value = it
                },
                modifier = Modifier.offset(x = -165.dp),
                colors = CheckboxDefaults.colors(Color(0xFF9036A0))
            )

            Text(
                text = "Over 18?",
                modifier = Modifier.offset(x = -120.dp, y = -34.dp),
                fontWeight = FontWeight.Bold,
                color = Color(0xFF9036A0)
            )
        }

        Button(
            onClick = {
                controledenavegacao.navigate("Home")
            },
            modifier = Modifier
                .width(340.dp)
                .height(50.dp)
                .offset(x = 20.dp, y = -20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9036A0))
        ) {
            Text(
                text = "CREATE ACCOUNT ",
                fontWeight = FontWeight.ExtraBold
            )
        }

        Text(
            text = "Already have an account?",
            modifier = Modifier.offset(x = 110.dp, y = -15.dp),
            color = (Color(0xFF757272))
        )
    }

    Button(
        onClick = {
            controledenavegacao.navigate("Login")
        },
        modifier = Modifier.offset(x = 260.dp, y = 658.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0x00FFFFFF))
    ) {

        Text(
            text = "Sign UP",
            fontSize = 15.sp,
            color = Color(0xFF9036A0),
            fontWeight = FontWeight.Bold
        )


    }

    Card(
        modifier = Modifier
            .height(40.dp)
            .width(80.dp)
            .offset(x = -10.dp, y = 752.dp)
            .padding(0.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(Color(0xFF9036A0))


    ) {

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaCadastroPreview() {
        //TelaCadastro()

}
