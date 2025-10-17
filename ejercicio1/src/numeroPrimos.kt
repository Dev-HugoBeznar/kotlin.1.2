import numeroPrimos

class numeroPrimos {
    fun mian(){
        println(numeroPrimos(21))
    }

    fun primoONo(x: Int): Boolean {
        for (i in 2..x - 1) {
            if (x % i == 0) {
                return false
            }
        }
        return true
    }

    fun numeroPrimos(cantidad: Int): ArrayList<Int> {
        var contador = 0
        //empiezo en dos porque el 1 no cuenta
        var enteros = 2
        var lista = ArrayList<Int>()
        while (contador < cantidad) {
            if (primoONo(enteros)) {
                lista.add(enteros)
                contador++
            }

            enteros++
        }
        return lista
    }
}