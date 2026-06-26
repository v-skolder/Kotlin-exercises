fun main() {
    val input = readln()

    val slice = input.split(",")

    val validNumbers = slice.filter { it.toInt(2) % 5 == 0 && it.toInt(2) != 0 }

    println(validNumbers.joinToString(","))
}
