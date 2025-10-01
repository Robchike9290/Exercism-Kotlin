import kotlin.math.abs
import kotlin.math.sqrt

object Darts {

    fun score(x: Number, y: Number /* choose proper types! */): Int {
        val xSquared = abs(x.toDouble()) * abs(x.toDouble())
        val ySquared = abs(y.toDouble()) * abs(y.toDouble())
        val distanceFromOrigin = sqrt(xSquared + ySquared)
        if (distanceFromOrigin > 10) return 0
        if (distanceFromOrigin > 5) return 1
        if (distanceFromOrigin > 1) return 5
        else return 10
    }
}
