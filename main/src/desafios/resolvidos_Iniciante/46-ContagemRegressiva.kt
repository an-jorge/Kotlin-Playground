package desafios.resolvidos_Iniciante

/*

46 — Contagem regressiva
Exercício 046: faça um programa que mostre uma contagem regressiva na tela para o estouro de fogos de artifício,
indo de 10 até 0, com uma pausa de 1 segundo entre eles.

 */


fun main() {
    for (i in 10 downTo 0) {
        Thread.sleep(1000)
        println(i)
    }
    println("BUMMM BUM")
    print("Success")

}
