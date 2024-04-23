package br.senai.sp.jandira

import java.time.LocalDate

fun reduzirData(dataAntiga: LocalDate):String{

    val dia = dataAntiga.dayOfMonth
    val mes = dataAntiga.month.toString().subSequence(0..2)
    return "$dia - $mes"

}