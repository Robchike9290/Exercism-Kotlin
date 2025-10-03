object PrimeFactorCalculator {

    fun primeFactors(int: Int): List<Int> {
        val primeFactorsList = mutableListOf<Int>()
        var primeFactorCandidate = 2
        var modifiedInt = int
        while (primeFactorCandidate <= modifiedInt) {
            if (modifiedInt % primeFactorCandidate == 0) {
                primeFactorsList.add(primeFactorCandidate)
                modifiedInt /= primeFactorCandidate
            } else {
                primeFactorCandidate++
            }
        }
        return primeFactorsList
    }

    fun primeFactors(long: Long): List<Long> {
        val primeFactorsList = mutableListOf<Long>()
        var primeFactorCandidate = 2L
        var modifiedLong = long
        while (primeFactorCandidate <= modifiedLong) {
            if (modifiedLong % primeFactorCandidate == 0L) {
                primeFactorsList.add(primeFactorCandidate)
                modifiedLong /= primeFactorCandidate
            } else {
                primeFactorCandidate++
            }
        }
        return primeFactorsList
    }
}
