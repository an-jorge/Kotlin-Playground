package desafios.resolvidos_Iniciante

import kotlin.math.sqrt

/*

06 — Dobro, Triplo, Raiz Quadrada
Exercício 006: Crie um algoritmo que leia um número e mostre o seu dobro, triplo e raiz quadrada.

 */

fun main() {
    println("DIGITE O NÚMERO: ")
    val myNumb = readLine()!!.toInt()
    println("Dobro de $myNumb -> ${myNumb * 2}")
    println("Triplo de $myNumb -> ${myNumb * 3}")
    println("Raiz quadrada de $myNumb -> ${sqrt(myNumb.toFloat())}")
}