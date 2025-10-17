class factorial {

    fun main(){
        println(factorial(3))
    }

    fun factorial(x: Int): Int {
        var factorial = 1;
        for (i in 1..x) {
            factorial = factorial * i;
        }
        return factorial;
    }

}