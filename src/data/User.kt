package data

class User(var username: String, var password: String) {

    override fun toString(): String {
        return "User With username = $username"
    }
}