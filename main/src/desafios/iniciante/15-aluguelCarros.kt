package desafios.iniciante

/*
15 – Aluguel de Carros
Exercício 015:
Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos
quais ele foi alugado. Calcule o preço a pagar, sabendo que o carro custa R$60 por dia e R$0,15 por Km rodado.

 */

fun main() {
    println("Quantos Km a viatura vez durante a viagem: [ Km ]")
    val travelKm = readLine()!!.toDouble()
    println("Por quantos dias o cliente ficou com a viatura: ")
    val days = readLine()!!.toInt()
    val result = travelKm * days
    println("O valor a pagar é de: $result")
}