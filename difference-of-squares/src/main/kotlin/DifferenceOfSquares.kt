class Squares(numberOfNaturalNumbers: Int) {
    var sumOfSquares = 0
    var squareOfSum = 0

    fun sumOfSquares() {
        for(i in 1..numberOfNaturalNumbers) {
            this.sumOfSquares += i * i
        }
    }

    fun squareOfSum() {
        for(i in 1..numberOfNaturalNumbers) {
            this.squareOfSum += i
        }
        this.squareOfSum *= this.squareOfSum
    }

    fun difference(): Int {
        return this.squareOfSum - this.sumOfSquares
    }
}
