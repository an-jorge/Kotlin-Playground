package desafios.resolvidos_Iniciante

/*

41 — Classificando Atletas
Exercício Python 041: A Confederação Nacional de Natação precisa de um programa que leia
o ano de nascimento de um atleta e mostre a sua categoria, conforme a idade:

- Até 9 anos: MIRIM
- Até 14 anos: INFANTIL
- Até 19 anos: JÚNIOR
- Até 25 anos: SÉNIOR
- Acima de 25 anos: MASTER

 */

fun main() {
    println("Digite o ano do seu nascimento: ")
    val born = readLine()!!.toInt()

    when (val category = 2021 - born) {
        in 0..9 -> println("Você têm $category anos a sua categoria é: MIRIM")
        in 10..14 -> println("Com $category anos és INFATIL")
        in 15..19 -> println("Com $category anos és JÚNIOR")
        in 20..25 -> println("Com $category anos és SÊNIOR")
        in 26..200 -> print("Com $category anos és Master")

        else -> println("Contacte o direitor")
    }
}
