package `perfect-numbers`.src.main.kotlin


enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

object NaturalNumber {
    fun classify(naturalNumber: Int): Classification {
        require(naturalNumber > 0) {"Input an integer greater than zero"}
        val factors = (1 until naturalNumber).filter { naturalNumber % it == 0 }
        val sumOfFactors = factors.sum()
        return when {
            sumOfFactors < naturalNumber -> Classification.DEFICIENT
            sumOfFactors == naturalNumber -> Classification.PERFECT
            else -> Classification.ABUNDANT
        }
    }
}
