import kotlin.math.floor

class DndCharacter {

    val strength: Int = ability()
    val dexterity: Int = ability()
    val constitution: Int = ability() // need to modify too
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int = ability()
    val hitpoints: Int = 10 + modifier(this.constitution)

    companion object {

        fun ability(): Int {
            val rolls = MutableList(4) { (1..6).random() }
            val lowestRoll = rolls.minOrNull()
            rolls.remove(lowestRoll)
            return rolls.sum()
        }

        fun modifier(score: Int): Int {
            return floor((score - 10.toDouble()) / 2).toInt()
        }
    }

}
