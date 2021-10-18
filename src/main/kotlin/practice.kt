import java.io.File

fun main() {
    var filelistofnumber = File("data/listofnumber.txt").readText().split("\n")


    println(filelistofnumber.maxOf { it })
}