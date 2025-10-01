class Triangle<out T : Number>(val a: T, val b: T, val c: T) {
    init {
        val a = a.toDouble()
        val b = b.toDouble()
        val c = c.toDouble()
        require(a > 0 && b > 0 && c > 0) { "All sides must be positive" }

        val longestSide = maxOf(a, b, c)
        require((a + b + c) - longestSide > longestSide) {
            "The sum of the lengths of any two sides must be greater than the length of the remaining side"
        }
    }

    val isEquilateral: Boolean
        get() = a == b && b == c
    val isIsosceles: Boolean
        get() = a == b || b == c || a == c
    val isScalene: Boolean
        get() = a != b && b != c && a != c
}
