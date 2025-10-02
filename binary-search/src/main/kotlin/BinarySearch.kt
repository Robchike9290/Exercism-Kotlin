import kotlin.math.ceil

object BinarySearch {
    fun search(list: List<Int>, item: Int): Int {
        if (list.isEmpty()) throw NoSuchElementException()
        val midIndex = ceil(list.size.toDouble() / 2)
        if (list[midIndex.toInt()] == item) {
            return item
        } else if (list[midIndex.toInt()] > item) {
            val rightHalf = list.slice(midIndex.toInt() + 1 until list.size)
            return search(rightHalf, item)
        } else {
            val leftHalf = list.slice(0 until midIndex.toInt())
            return search(leftHalf, item)
        }
    }
}
