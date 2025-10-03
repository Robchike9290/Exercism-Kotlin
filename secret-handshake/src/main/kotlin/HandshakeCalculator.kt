object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val binary = Integer.toBinaryString(number).padStart(5, '0')
        val handshakeSequence = mutableListOf<Signal>()
        for (i in 4 downTo 0) {
            if (binary[i] == '1') {
                when (i) {
                    4 -> handshakeSequence.add(Signal.WINK)
                    3 -> handshakeSequence.add(Signal.DOUBLE_BLINK)
                    2 -> handshakeSequence.add(Signal.CLOSE_YOUR_EYES)
                    1 -> handshakeSequence.add(Signal.JUMP)
                    0 -> handshakeSequence.reverse()
                }
            }
        }
        return handshakeSequence
    }
}
