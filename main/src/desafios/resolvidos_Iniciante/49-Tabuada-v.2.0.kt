package desafios.resolvidos_Iniciante

/*
49 — Tabuada v.2.0
Exercício Python 049: refaça o DESAFIO 009, mostrando a tabuada de um número que o utilizador
escolher, contudo, utilizando agora um laço for.

 */

fun main() {
    println("INSIRA O NÚMERO DE CASA DE TABELA QUE DESEJA: ")

    val tabChoose = readLine()!!.toInt()
    println("Você escolheu a casa de: $tabChoose")
    for (item in 0..12) {
        println("$item x $tabChoose = ${item * tabChoose}")
    }
}
