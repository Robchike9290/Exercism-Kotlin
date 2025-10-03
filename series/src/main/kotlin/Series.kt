object Series {

    fun slices(n: Int, s: String): List<List<Int>> {
        require(n in 1..s.length) { "n must be less than length of string" }
        return (0..s.length - n).map { i ->
            s.substring(i, i + n).map { it.digitToInt() }
        }
    }
}
