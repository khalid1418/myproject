fun main() {
    var listofnum = mutableListOf(1,2,3,4,5)
    listofnum[3]=12
    listofnum.removeIf{it == 12}
    println(listofnum)
}