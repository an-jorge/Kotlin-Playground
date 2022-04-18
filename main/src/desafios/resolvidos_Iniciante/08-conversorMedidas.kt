package desafios.resolvidos_Iniciante

/*
08 — Conversor de Medidas
Exercício Python 008: Escreva um programa que leia um valor em metros, e o exiba convertido em centímetros e milímetros.

 */

fun main(){
    println("Digite o valor em metros que deseja converter: ")
    val meter = readLine()!!.toFloat()
    println("$meter m equivale a ${meter * 100} cm ")
}

