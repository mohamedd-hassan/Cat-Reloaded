fun main(args: Array<String>) {
    val task = ImportantTask("7amasa")
    task.title = "Android Task"
    task.description = "Learn about delegation"

    println(task.userName)
    println(task.userName)
    println("-----------------")
    println(task.title)
    println(task.description)
    println("-----------------")
    task.priority = -5
    println(task.priority)
    println("-----------------")
    task.priority = 5
    println(task.priority)
    println("-----------------")
    println(task.completed)
    task.completed = true
    println(task.completed)
}