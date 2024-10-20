package data

class Car(paramBrand: String, paramName: String, paramYear: Int) {

//    Initializer block
    init {
        println("Car $paramBrand dibuat")
    }

    constructor(paramBrand: String, paramName: String):
            this(paramBrand, paramName, 2024) {
                println("Secondary constructor")
            }

    constructor(paramBrand: String):
            this(paramBrand, "") {
                println("Secondary constructor 2")
            }

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear
}