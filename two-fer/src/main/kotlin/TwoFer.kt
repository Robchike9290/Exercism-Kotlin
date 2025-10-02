package two_fer.src.main.kotlin

object TwoFer {
    fun twofer(name: String? = null): String {
        if (name == null) {
            return "One for you, one for me."
        }
        return "One for $name, one for me."
    }

}