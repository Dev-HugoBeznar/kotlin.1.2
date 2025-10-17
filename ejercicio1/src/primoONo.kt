import primoONo

class primoONo {
    fun main(){
        if (primoONo(73)) {
            println("es primo")
        } else {
            println("no es primo")
        }
    }

    fun primoONo(x: Int): Boolean {
        for (i in 2..x - 1) {
            if (x % i == 0) {
                return false
            }
        }
        return true
    }
}