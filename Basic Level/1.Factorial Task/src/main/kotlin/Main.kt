fun factorial(num: Int):Int {
    return if (num == 1){
        1
    } else {
        num * factorial(num - 1)
    }
}

fun main() {

    var isProgramOpen = true

    while (isProgramOpen){

        println(" What would you like to do?")
        println("\n 1. Calculate Factorial of Integer")
        println("\n 2. Close Program")

        when(readln().toInt()){
            1->{
                println("Please enter a positive integer")
                val num = readln().toInt()
                if (num>=0){
                    println(factorial(num))
                } else println("Input must be positive \n")
            }
            2-> isProgramOpen = false
            else -> continue
        }

    }
}