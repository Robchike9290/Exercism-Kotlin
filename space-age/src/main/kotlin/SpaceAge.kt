class SpaceAge(val age: Int) {
    fun onEarth(): Double = (age / 31556926).toDouble()
    fun onMercury(): Double = age / 31556926 / 0.2408467
    fun onVenus(): Double = age / 31556926 / 0.61519726
    fun onMars(): Double = age / 31556926 / 1.8808158
    fun onJupiter(): Double = age / 31556926 / 11.862615
    fun onSaturn(): Double = age / 31556926 / 29.447498
    fun onUranus(): Double = age / 31556926 / 84.016846
    fun onNeptune(): Double = age / 31556926 / 164.79132
}
