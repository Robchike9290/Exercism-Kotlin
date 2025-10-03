enum class Color(val code: Int) {
    BLACK(0),
    BROWN(1),
    RED(2),
    ORANGE(3),
    YELLOW(4),
    GREEN(5),
    BLUE(6),
    VIOLET(7),
    GREY(8),
    WHITE(9);
}

object ResistorColor {

    fun colorCode(input: String): Int {
        return Color.valueOf(input.uppercase()).code
    }

    fun colors(): List<String> {
        return Color.values().map { it.name.lowercase() }
    }

}
