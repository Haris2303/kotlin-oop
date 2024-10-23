package data

class Teacher(private val name: String) {
    val getName: String
        get() = name

    private fun teach() {
        println("Teach!")
    }
}