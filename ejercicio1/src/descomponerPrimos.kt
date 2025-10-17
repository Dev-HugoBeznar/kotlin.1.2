class descomponerPrimos {
    fun main(){
        println(descomposicionNumPrimos(64))
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

    fun descomposicionNumPrimos(numero: Int): ArrayList<Int> {
        var listaADevolver = ArrayList<Int>()
        var listaDePrimos = numeroPrimos(numero)
        var funcionando = true
        var contador = 0
        var numero1 = numero
        while (funcionando) {
            if (numero1 == 1) {
                funcionando = false
            }
            if (numero1 % listaDePrimos.get(contador) == 0) {
                numero1 = numero1 / listaDePrimos.get(contador)
                listaADevolver.add(listaDePrimos.get(contador))
            }else{
                contador++
            }
        }
        return listaADevolver
    }
}