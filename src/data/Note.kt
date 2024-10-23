package data

class Note(title: String) {

    var title: String = title
        get() {
            println("Call getter function")
            return field
        }
        set(value) {
            println("Call setter function")
            if(value.isNotBlank()) {
                field = value
            } else {
                println("Invalid title")
            }
        }
}

class BigNote(private val paramTitle: String) {
    val title: String
        get() = paramTitle.uppercase()
}