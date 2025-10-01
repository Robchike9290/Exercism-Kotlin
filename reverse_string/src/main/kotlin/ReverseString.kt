package reverse_string.src.main.kotlin

object ReverseString {
    fun reverse(input: String): String {
        var reversedString = ""
        val finalIndex = input.length - 1
        for (i in finalIndex downTo 0) {
            reversedString += input[i]
        }
        return reversedString
    }
}
