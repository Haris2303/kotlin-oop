package data

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Account(description: String = "Description") {
    val name: String by lazy {
        println("Name is called")
        "Otong"
    }

    var description: String by Delegates.observable(description) {
        property, oldValue, newValue ->
        println("$property is changed from $oldValue to $newValue")
    }
}