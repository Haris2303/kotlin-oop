package data

open class Shape {

    open val corner: Int = -1
}

class Rectangle : Shape() {
    override val corner = 4
}

class Triangle : Shape() {
    override val corner = 3
}