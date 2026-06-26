val pares = mapOf(')' to '(', ']' to '[', '}' to '{')

fun main() {
    val input = readln()
    val stack = mutableListOf<Char>()

    for (c in input) {
        when (c) {
            '(', '[', '{' -> stack.add(c)
            ')', ']', '}' -> {
                if (stack.isEmpty() || stack.removeAt(stack.lastIndex) != pares[c]) {
                    print(false)
                    return
                }
            }
        }
    }

    print(stack.isEmpty())
}
