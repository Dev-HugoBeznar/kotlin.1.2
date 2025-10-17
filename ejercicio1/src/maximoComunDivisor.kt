class maximoComunDivisor {
    fun main(){
        println(maxComun(60, 30))
    }

    fun maxComun(x: Int, y: Int): Int {
        var xDivisor = ArrayList<Int>()
        var yDivisor = ArrayList<Int>()

        for (i in 1..x) {
            if ((x % i) == 0) {
                xDivisor.add(i)
            }
        }

        for (i in 1..y) {
            if ((y % i) == 0) {
                yDivisor.add(i)
            }
        }

        var comprovador = 0
        for (i in xDivisor) {
            for (j in yDivisor) {
                if (i == j && i > comprovador) {
                    comprovador = i
                }
            }
        }
        return comprovador

    }
}