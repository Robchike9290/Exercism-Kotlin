package allergies.src.main.kotlin

class Allergies(val score: Int) {

    var allergenList = mutableListOf<Allergen>()

    init {
        addAllergen(score)
    }

    fun getList(): List<Allergen> {
        return allergenList.reversed()
    }

    fun addAllergen(score: Int) {
        if (score > 0) {
            var mod = 1;
            while (score >= mod * 2) mod *= 2
            when (mod) {
                128 -> allergenList.add(Allergen.CATS)
                64 -> allergenList.add(Allergen.POLLEN)
                32 -> allergenList.add(Allergen.CHOCOLATE)
                16 -> allergenList.add(Allergen.TOMATOES)
                8 -> allergenList.add(Allergen.STRAWBERRIES)
                4 -> allergenList.add(Allergen.SHELLFISH)
                2 -> allergenList.add(Allergen.PEANUTS)
                1 -> allergenList.add(Allergen.EGGS)
            }
            addAllergen(score - mod)
        }
    }

    fun isAllergicTo(allergen: Allergen): Boolean {
        return allergenList.contains(allergen)
    }
}
