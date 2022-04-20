package desafios.resolvidos_Iniciante


fun main() {
    val name = "Bernardo Andre".uppercase()

    if (name.contains("Silva".uppercase())) {
        println("O seu nome tem Silva ✅")
    } else {
        println("O seu nome não tem Silva ❌")
    }

    println("Nome digitado: $name")
}