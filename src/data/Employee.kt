package data

open class Employee(val name: String) {
//    open artinya bisa di override
    open fun sayHello(name: String) {
        println("Hello ${name}, my name is ${this.name}")
    }
}

// Inheritance
open class Manager(name: String) : Employee(name) {
    final override fun sayHello(name: String) {
        println("Hello ${name}, my name is ${this.name}, i'm a Manager")
    }
}

class SuperManager(name: String) : Manager(name) {
//    ERROR!!!
//    override fun sayHello(name: String) {
//        println("Hello ${name}, my name is ${this.name}, i'm a Super Manager")
//    }
}

// Inheritance
class VicePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello ${name}, my name is ${this.name}, i'm a Vice President")
    }
}