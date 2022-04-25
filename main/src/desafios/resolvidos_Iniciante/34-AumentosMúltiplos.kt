package desafios.resolvidos_Iniciante

/*
34 — Aumentos múltiplos
Exercício 034: Escreva um programa que pergunte o salário de um funcionário e
calcule o valor do seu aumento. Para salários superiores a R$1250,00, calcule um aumento
 de 10%. Para os inferiores ou iguais, o aumento é de 15%.

 */

fun main() {
    println("Seu salario actual: ")
    val currentSalary = readLine()!!.toDouble()
    if (currentSalary >= 1250.0) {
        val newSalary = currentSalary + (currentSalary * 10 / 100)
        println("Seu salario de $currentSalary Kz com aumento de 10% passou para $newSalary Kz")
    } else if (currentSalary <= 1250.0) {
        val newSalary = currentSalary + (currentSalary * 15 / 100)
        println("Seu salario de $currentSalary Kz com aumento de 15% passou para $newSalary Kz")
    }

}
