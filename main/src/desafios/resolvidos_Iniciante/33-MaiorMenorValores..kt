package desafios.resolvidos_Iniciante

/*
33 – Maior e menor valores
Exercício 033: Faça um programa que leia três números e
mostre qual é o maior e qual é o menor.
 */

fun main() {
    val listOfNumbers = mutableListOf<Int>()
    println("Primeiro número: ")
    val numberOne = readLine()!!.toInt()
    listOfNumbers.add(numberOne)
    println("Segundo número: ")
    val numbTwo = readLine()!!.toInt()
    listOfNumbers.add(numbTwo)
    println("Terceiro número:")
    val numbThree = readLine()!!.toInt()
    listOfNumbers.add(numbThree)
    println("Números digitados: $listOfNumbers. ${listOfNumbers.maxOrNull()} " +
            "E o maior número, ${listOfNumbers.minOrNull()} menor número".trimMargin())

}