import kotlin.properties.Delegates

class ImportantTask(private val name:String): Task(name) {
    var priority: Int by Delegates.vetoable(0){property, oldValue, newValue ->
        if (newValue < 0){
            println("The priority has changed from $oldValue to $newValue")
            true
        } else {
            println("The priority does not change")
            false
        }
    }
}