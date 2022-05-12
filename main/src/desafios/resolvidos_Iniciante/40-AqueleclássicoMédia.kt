package desafios.resolvidos_Iniciante

/*

40 — Aquele clássico da Média
Exercício 040: Crie um programa que leia duas notas de um aluno e calcule a sua média,
mostrando uma mensagem no final, conforme a média atingida:

— Média abaixo de 5,0: REPROVADO
— Média entre 5,0 e 6,9: RECUPERAÇÃO
— Média 7,0 ou superior: APROVADO

 */

fun main() {
    println("Digite a primeira nota: ")
    val exameOne = readLine()!!.toFloat()

    println("Digite a segunda nota: ")
    val exameTwo = readLine()!!.toFloat()
    val result = (exameOne + exameTwo) / 2

    when (result) {
        in 0.0..5.9 -> println("Com a nota $result você está REPROVADO")
        in 6.0..6.9 -> println("Com a nota $result você está em RECUPERAÇĀO")
        in 7.0..20.0 -> println("Com a nota $result você está APROVADO")

        else -> println("Contacte a direiçāo")
    }
}
