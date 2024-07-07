fun main() {
    val test1 = Counter()
    val test2 = Counter()

    val singleton1 = SingletonCounter
    val singleton2 = SingletonCounter

    test1.count += 2
    test2.count++

    singleton1.count += 2
    singleton2.count++

    println("test1 Count: ${test1.count}")
    println("test2 Count: ${test2.count}")
    println("singleton1 Count: ${singleton1.count}")
    println("singleton2 Count: ${singleton2.count}")
}

class Counter{
    var count = 0
}

object SingletonCounter{
    var count = 0
}