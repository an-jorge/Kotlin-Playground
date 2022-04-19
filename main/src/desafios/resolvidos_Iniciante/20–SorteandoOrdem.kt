package desafios.resolvidos_Iniciante

fun main() {
    val students = mutableListOf<String>()

    repeat(4){
        println("Digite o nome aluno: ")
        val names: String = readLine()!!
        students.add(names)

    }

    println("== Ordem de apresentaçāo ==")
    println(students.sorted())
}