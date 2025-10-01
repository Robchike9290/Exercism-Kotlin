object SumOfMultiples {

    fun sum(values: Set<Int>, level: Int): Int {
        if (values.isEmpty()) return 0

        val itemValues = mutableSetOf<Int>()

        for (value in values) {
            if (value == 0) continue
            for (i in value until level step value) {
                itemValues.add(i)
            }
        }

        return itemValues.sum()
    }
}
