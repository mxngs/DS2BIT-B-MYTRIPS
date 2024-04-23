package br.senai.sp.jandira.repository

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.R
import br.senai.sp.jandira.model.Categoria
import br.senai.sp.jandira.model.Viagem
import java.time.LocalDate

//Criado uma nova classe pra categoria, pis quando colocada na mesma de viagens da erro
class Categoriarepositorio {

    @Composable
    @RequiresApi(Build.VERSION_CODES.O)
    fun listarTodasAsCategorias(): List<Categoria> {

        val montanha = Categoria()
        montanha.id = 1
        montanha.nome = "Montain"
        montanha.imagem = painterResource(id = R.drawable.montanha)

        val neve = Categoria()
        neve.id = 2
        neve.nome = "Snow"
        neve.imagem = painterResource(id = R.drawable.neve)

        val praia = Categoria()
        praia.id = 3
        praia.nome = "Beach"
        praia.imagem = painterResource(id = R.drawable.praia)

        val interior = Categoria()
        interior.id = 4
        interior.nome = "countryside"
        interior.imagem = painterResource(id = R.drawable.interior
        )

        return listOf(montanha, neve, praia, interior)

    }
}