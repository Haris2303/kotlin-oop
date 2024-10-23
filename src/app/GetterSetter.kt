package app

import data.BigNote
import data.Note

fun main() {
    val note = Note("Otong")
    println(note.title)
    note.title = ""
    println(note.title)

    val bigNote = BigNote("Belajar Kotlin OOP")
    println(bigNote.title)
}