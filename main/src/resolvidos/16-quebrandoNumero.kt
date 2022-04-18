package resolvidos

/*
16 — Quebrando um número
Exercício 016: Crie um programa que leia um número Real qualquer pelo teclado
e mostre na tela a sua porção Inteira.
 */

fun main(){
    println("DIGITE UM NÚMERO:")

    val numb = readLine()!!.toFloat()
    println("Número Real: $numb")
    println("Número Inteiro: ${numb.toInt()}")
}

