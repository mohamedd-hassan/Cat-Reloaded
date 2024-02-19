fun calculate(A: Int, B: Int, lambda: (Int, Int) -> Int): Int{
    return lambda(A,B)
}

val sum:(Int,Int) -> Int = {x:Int, y:Int -> x+y}


val minus:(Int,Int) -> Int = {x:Int, y:Int -> x-y}


val multiply:(Int,Int) -> Int = {x:Int, y:Int -> x*y}


val roundedDownDivide:(Int,Int) -> Int = {x:Int, y:Int ->
    try {
        x/y
    }catch (e: ArithmeticException){
        println("can't divide by zero")
        0
    }}

fun main() {
    println(calculate(1, 2, sum))
    println(calculate(5, 4, minus))
    println(calculate(2, 3, multiply))
    println(calculate(4, 0, roundedDownDivide))
}