package desafios.resolvidos_Iniciante

/*
47 — Contagem de pares
Exercício 047: Crie um programa que mostre na tela todos os números pares que estão no intervalo entre 1 e 50

*/

fun main() {
    val onlyEven = mutableListOf<Int>()
    for (even in 0..51) {
        if (even % 2 == 0) {
            onlyEven.add(even)
        }

    }
    println("The sequence has ${onlyEven.count()} even numbers")

}
