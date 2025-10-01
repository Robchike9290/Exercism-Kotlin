package etl.src.main.kotlin

import kotlin.collections.iterator

object ETL {
    fun transform(source: Map<Int, Collection<Char>>): Map<Char, Int> {
        val charScoresMap = mutableMapOf<Char, Int>()
        for ((score, chars) in source) {
            for (char in chars) {
                charScoresMap[char.lowercaseChar()] = score
            }
        }
        return charScoresMap
    }
}
