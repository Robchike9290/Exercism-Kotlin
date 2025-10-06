object Yacht {

    fun solve(category: YachtCategory, vararg dices: Int): Int {
        val diceList = dices.toList()
        val littleStraight = listOf(1, 2, 3, 4, 5)
        val bigStraight = listOf(2, 3, 4, 5, 6)

        when (category) {
            YachtCategory.YACHT ->
                return if (diceList.distinct().size == 1) 50
                else 0
            YachtCategory.ONES -> return diceList.filter{it == 1}.sum()
            YachtCategory.TWOS -> return diceList.filter{it == 2}.sum()
            YachtCategory.THREES -> return diceList.filter{it == 3}.sum()
            YachtCategory.FOURS -> return diceList.filter{it == 4}.sum()
            YachtCategory.FIVES -> return diceList.filter{it == 5}.sum()
            YachtCategory.SIXES -> return diceList.filter{it == 6}.sum()
            YachtCategory.FULL_HOUSE ->
                return if (isFullHouse(diceList)) diceList.sum()
                else 0
            YachtCategory.FOUR_OF_A_KIND -> return fourOfAKindScore(diceList)
            YachtCategory.LITTLE_STRAIGHT ->
                return if (diceList.sorted() == littleStraight) 30
                else 0
            YachtCategory.BIG_STRAIGHT ->
                return if (diceList.sorted() == bigStraight) 30
                else 0
            YachtCategory.CHOICE -> return diceList.sum()
        }
    }

    fun isFullHouse(dice: List<Int>): Boolean {
        val diceOccurrences = dice.groupingBy { it }.eachCount()
        return diceOccurrences.size == 2 && diceOccurrences.containsValue(2)
    }

    fun fourOfAKindScore(dice: List<Int>): Int {
        val diceOccurrences = dice.groupingBy { it }.eachCount()
        if (diceOccurrences.containsValue(4) || diceOccurrences.containsValue(5)) {
            val fourOfAKindDiceValue = diceOccurrences.filterValues { it == 4 || it == 5 }.keys.firstOrNull()
            return fourOfAKindDiceValue!! * 4
        } else {
            return 0
        }
    }
}
