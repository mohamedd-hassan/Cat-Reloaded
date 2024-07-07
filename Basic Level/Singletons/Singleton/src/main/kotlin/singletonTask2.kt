fun main(){
    val helper1 = Helper1()
    val helper2 = Helper2()

    helper1.incrementStaticCounter()
    helper2.incrementStaticCounter()
    helper1.incrementStaticCounter()
    helper2.incrementStaticCounter()

    helper1.incrementCounter()
    helper2.incrementCounter()
    helper1.incrementCounter()
    helper2.incrementCounter()
}

class Counter2{
    var count = 0

    companion object{
        var staticCount = 0
    }
    var companion = Companion
}

class Helper1{
    private val counter = Counter2()
    fun incrementStaticCounter(){
        counter.companion.staticCount++
        println("Static Counter: ${counter.companion.staticCount} from Helper1")
    }
    fun incrementCounter(){
        counter.count++
        println("Counter: ${counter.count} from Helper1")
    }
}

class Helper2{
    private val counter = Counter2()
    fun incrementStaticCounter(){
        counter.companion.staticCount++
        println("Static Counter: ${counter.companion.staticCount} from Helper2")
    }
    fun incrementCounter(){
        counter.count++
        println("Counter: ${counter.count} from Helper2")
    }
}