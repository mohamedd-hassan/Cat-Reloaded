import kotlin.properties.Delegates

open class Task(userName: String){
    var title: String? = null
    var description: String? = null

    var completed: Boolean by Delegates.observable(false){property, oldValue, newValue ->
        if (newValue == true){
            println("Task is completed")
        }
        if(newValue == false){
            println("Task is not completed")
            println(newValue)
        }
    }
     val userName: String by lazy { " name of user is $userName" }
}