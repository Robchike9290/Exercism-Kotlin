package sublist.src.main.kotlin

enum class Relationship {

    EQUAL, SUBLIST, SUPERLIST, UNEQUAL

}

object Sublist {
    fun List<Any>.relationshipTo(otherList: List<Any>): Relationship {
        return when {
            this == otherList -> Relationship.EQUAL
            this.isSublistOf(otherList) -> Relationship.SUBLIST
            this.isSuperListOf(otherList) -> Relationship.SUPERLIST
            else -> Relationship.UNEQUAL
        }
    }

    fun List<Any>.isSublistOf(otherList: List<Any>): Boolean {
        return when {
            this.isNotEmpty() -> this.size < otherList.size && otherList.windowed(this.size).any { it == this }
            else -> true
        }
    }

    fun List<Any>.isSuperListOf(otherList: List<Any>): Boolean {
        return when {
            otherList.isNotEmpty() -> this.size > otherList.size && this.windowed(otherList.size).any { it == otherList }
            else -> true
        }
    }
}