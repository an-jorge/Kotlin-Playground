package desafios.resolvidos_Iniciante

/*

28 – Jogo da Adivinhação v1.0
Exercício 028: Escreva um programa que faça o computador "pensar" num número
inteiro entre 0 e 5 e peça para o utilizador tentar descobrir qual foi o número escolhido pelo computador.
O programa deverá escrever na tela se o utilizador venceu ou perdeu.

 */
fun main() {

    println("Digite um número e descobra o número escolhido pelo Computador: ")

    val user = readLine()!!.toInt()
    val cpu = (0..5).random()
    if (user == cpu) {
        println("ACERTO!! Você digitou $user e o Computador $cpu")
    } else {
        println("ERROU FEIO!! ")
    }
}