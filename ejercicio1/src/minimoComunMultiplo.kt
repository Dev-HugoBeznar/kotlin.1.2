class minimoComunMultiplo {
    fun main(){
        println(minMultiplo(10, 8))
    }

    fun minMultiplo(x: Int, y: Int): Int {
        var funcionando = true
        var funcionandoInside = true
        var contadorMultiploX = 1
        var contadorMultiploY = 1
        var resultado = 0
        while (funcionando) {
            funcionandoInside = true
            contadorMultiploY = 1
            while (funcionandoInside) {
                if ((contadorMultiploX * x) == (contadorMultiploY * y)) {
                    resultado = contadorMultiploX * x
                    funcionando = false
                    funcionandoInside = false
                } else if ((contadorMultiploX * x) < (contadorMultiploY * y)) {
                    funcionandoInside = false
                } else {
                    contadorMultiploY++
                }
            }
            contadorMultiploX++
        }
        return resultado
    }
}