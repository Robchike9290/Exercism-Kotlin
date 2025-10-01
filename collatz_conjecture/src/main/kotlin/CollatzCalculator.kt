package collatz_conjecture.src.main.kotlin

object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        require(start > 0) { "Start must be greater than zero, was $start" }

        var stepCount = 0
        var current = start
        while (current != 1) {
            if (current % 2 == 0) {
                current /= 2
            } else {
                current = (current * 3) + 1
            }
            stepCount++
        }
        return stepCount
    }
}
