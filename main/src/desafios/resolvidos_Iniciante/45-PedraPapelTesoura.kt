package desafios.resolvidos_Iniciante

/*
Exercício 045:
Crie um programa que faça o computador jogar Jokenpô com você

 */

fun main() {

    println("–+ Jokenpô –+ \n")
    println("Suas opções")

    println(
        "" +
                "[0] Papel \n" +
                "[1] Teusora \n" +
                "[2] Pedra \n"
    )

    val playerUser = readLine()!!.toInt()
    val playerPC = (0..2).random()
    val items = listOf<String>("📄 Papel", "✂️ Teusora", "🪨 Pedra")

    while (playerUser in 0..2 ) {

        println("Jo")
        Thread.sleep(1000)
        println("Ke")
        Thread.sleep(1000)
        println("npô \n")
        Thread.sleep(1000)

        println("O computador jogou > ${items[playerPC]}")
        println("O Player jogou > ${items[playerUser]}")

        // Player jogou PAPEL
        if (playerPC == playerUser) {
            println("Empate")

        } else if (playerUser == 1) {
            println("O player ganhou")
        } else if (playerUser == 2) {
            println("O computador ganhou")
        }

        // Computador jogou TEUZORA
        if (playerPC == 1 && playerUser == 0) {
            println("O player ganhou")
        } else if (playerUser == 2) {
            println("O player ganhou")
        }

        // Computador jogou PEDRA
        if (playerPC == 2 && playerUser == 0) {
            println("O computador ganhou")
        } else if (playerUser == 1) {
            println("O computador ganhou")
        }

        break
    }

}