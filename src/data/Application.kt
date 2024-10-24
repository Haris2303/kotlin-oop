package data

class Application {

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