package data

class Application(val name: String) {

    object Utilities {
        fun toUpper(name: String): String {
            return name.uppercase()
        }
    }

    companion object {
        fun toLower(name: String): String {
            return name.lowercase()
        }
    }
}