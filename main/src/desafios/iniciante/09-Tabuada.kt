package desafios.iniciante

/*
09 — Tabuada
Exercício 009:
Faça um programa que leia um número Inteiro qualquer e mostre na tela a sua tabuada.

*/

fun main() {

    val tabuada = 10
    println("== == Tabuada de $tabuada == ==")
    println()
    for (index in 0..12) {
        println("$tabuada * $index = ${tabuada * index}")
    }
}