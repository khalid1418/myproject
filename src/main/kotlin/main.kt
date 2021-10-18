fun main() {  //part 1
    var listofcity = mutableListOf("Riyadh" , "Dammam" , "Dubai")

    listofcity.addAll(2 , listOf("jeddah","kuwait"))
    println(listofcity)
    listofcity[4]="UAE"
    println(listofcity)
    for (index in 0 until listofcity.size){
        println("$index -${ listofcity[index]}")
    }
}