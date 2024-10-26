package program

import annotations.Fancy

@Fancy(author = "Otong")
class MyApplication(val name: String, val version: Int) {

    fun info(): String = "Application $name-$version"
}