package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student = Student("Ucup", 20)
    student.sayHello("Otong")
    println(student.upperName)
}