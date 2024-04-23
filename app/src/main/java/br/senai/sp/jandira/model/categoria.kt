package br.senai.sp.jandira.model

import androidx.compose.ui.graphics.painter.Painter
import java.time.LocalDate

//Criado uma nova classe pra categoria, pis quando colocada na mesma de viagens da erro
data class Categoria(
    var id: Int = 0,
    var nome: String = "",
    var imagem: Painter? = null

)