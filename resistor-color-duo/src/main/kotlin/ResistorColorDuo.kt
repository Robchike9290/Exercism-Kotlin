object ResistorColorDuo {

    fun value(vararg colors: Color): Int {
        return colors.take(2).joinToString("") { it.ordinal.toString() }.toInt()
    }
}
