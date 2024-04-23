package br.senai.sp.jandira

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.screens.TelaCadastro
import br.senai.sp.jandira.screens.TelaHome
import br.senai.sp.jandira.screens.TelaLogin
import br.senai.sp.jandira.ui.theme.My_TripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            My_TripsTheme {
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        val controledenavegacao = rememberNavController()
                        NavHost(
                            navController = controledenavegacao,
                            startDestination = "Login"
                        ){
                            composable(route = "Login"){ TelaLogin(controledenavegacao)}
                            composable(route = "Cadastro"){ TelaCadastro(controledenavegacao)}
                            composable(route = "Home"){ TelaHome(controledenavegacao)}

                        }

                    }
                }
            }
        }
    }


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    My_TripsTheme {
        Greeting("Android")
    }
}