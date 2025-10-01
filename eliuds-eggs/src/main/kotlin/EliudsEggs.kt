package eliuds_eggs.src.main.kotlin

object EliudsEggs {

    fun eggCount(number: Int): Int{
        val binaryString = Integer.toBinaryString(number)
        var numberOfEggs = 0
        for (char in binaryString) {
            if (char == '1') numberOfEggs++
        }
        return numberOfEggs
    }
}
