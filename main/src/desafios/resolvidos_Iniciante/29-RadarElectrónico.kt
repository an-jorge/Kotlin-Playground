package desafios.resolvidos_Iniciante


fun main() {
    println("Digite a velocidade do veiculo: ")

    when (val speed = readLine()!!.toFloat()) {
        in 00.00..69.99 -> println("Velocidade de segurança")
        in 69.99..80.99 -> println("Velocidade Normal")
        in 81.00..299.99 -> println("Você foi multado por excesso de velocidade deverá pagar ${(speed - 80.00) * 7} kz")

        else -> {
            println("= Contacte um operator =")
        }
    }
}