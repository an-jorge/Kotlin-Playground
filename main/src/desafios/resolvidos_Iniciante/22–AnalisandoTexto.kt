package desafios.resolvidos_Iniciante

import java.util.*


fun main() {
    println("Digite o seu nome: ")
    val name = readLine()!!.toString()

    println("Seu nome em maiúsculas $name".uppercase(Locale.getDefault()))
    println("Seu nome em minúsculas $name".lowercase(Locale.getDefault()))
    println("O seu nome tem no total ${name.filter { !it.isWhitespace() }.length} caracteres")

}