class Clock (private val hours: Int = 0, private val minutes: Int = 0) {
    private var actualMinutes: Int = 0
    private var actualHours: Int = 0

    init {
        normalize(hours, minutes)
    }

    fun normalize (hours: Int, minutes: Int) {
        this.actualHours = ((hours + minutes / 60) % 24)
            .let { if (minutes % 60 < 0) it - 1 else it }
            .let { if (it < 0) it + 24 else it }
        this.actualMinutes = (minutes % 60)
            .let { if (it < 0) it + 60 else it }
    }

    @Override
    override fun equals(other: Any?): Boolean = other is Clock && actualHours == other.actualHours && actualMinutes == other.actualMinutes

    private fun Int.padZeroChars() = toString().padStart(length = 2, padChar = '0')

    override fun toString() = "${actualHours.padZeroChars()}:${actualMinutes.padZeroChars()}"

    fun subtract(minutes: Int) {
        actualMinutes -= minutes
        normalize(actualHours, actualMinutes)
    }

    fun add(minutes: Int) {
        actualMinutes += minutes
        normalize(actualHours, actualMinutes)
    }
}
