import kotlin.math.abs

val ROMAN_NUMBERS = mapOf(
    1 to "I", 5 to "V",
    10 to "X", 50 to "L",
    100 to "C", 500 to "D",
    1000 to "M"
)

fun main() {

    val input = readln()
    var number = input.toInt()
    var result = ""

    while (number != 0) {
        if (number > 0) {
            var closestRomanNumber = ROMAN_NUMBERS.keys
                .minBy { abs(it - number) }

            number -= closestRomanNumber
            result += ROMAN_NUMBERS[closestRomanNumber]

        } else {
            var closestRomanNumber = ROMAN_NUMBERS.keys
                .minBy { abs(it - abs(number)) }

            number += closestRomanNumber
            result = ROMAN_NUMBERS[closestRomanNumber] + result

        }
    }

    println(result)
}
