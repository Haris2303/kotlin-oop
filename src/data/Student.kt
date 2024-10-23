package data

class Student(val name: String, private val age: Int) {
    val getAge: Int
        get() = age
}

fun Student?.sayHello(name: String) {
    if(this != null) println("Hello $name, my name is ${this.name}, and my age is ${this.getAge}")
}

val Student.upperName: String get() = this.name.uppercase()