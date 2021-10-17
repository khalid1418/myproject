import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    println(
        {
    val currentyear = 2018
    "welcome to simvillage, mayor(copyright $currentyear)"
    }()
    )


    //===================
    val greetingfunction:()->String={
        val currentyear =2018
        "Welcome to simvillage , mayor(copyright $currentyear)"
    }
    println(greetingfunction())


    //======================
    val greetingfunctionplayername:(String)->String={playername ->
        val currentyear2 = 2018
        "Welcome to simvillage ,$playername (copyright $currentyear2)"

    }
    println(greetingfunctionplayername("khalid"))


    //=======================

    val greetingfunctionit:(String)->String={
        val currentyear3 = 2018
        "Welcome to SimVillage, $it! (copyright $currentyear3)"
    }
    println(greetingfunctionit("khalid"))



    //=======================================
    val greetingfunctionbuild:(String,Int)->String={playername,numbulding->
        val currentyear4=2018
        println("Adding $numbulding house")
        "Welcome to SimVillage, $playername! (copyright $currentyear4)"


    }
    println(greetingfunctionbuild("khalid",4))




    //======================================

    val greetingfunctionInference = {playername:String , numbuild:Int->
        val currentyear5 = 2018
        println("Adding $numbuild house")
        "Welcome to SimVillage, $playername! (copyright $currentyear5)"
    }
    println(greetingfunctionInference("khalid" , 5))


    //===========================
    val greetingFunctionsim = { playerName: String, numBuildings: Int ->
        val currentYear6 = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear6)"

    }
    runsimulation("khalid",greetingFunctionsim)



    //======================
    runsimulation("khalid"){playername,numbuilding->
        val currentyear7 = 2018
        println("Adding $numbuilding house")
        "Welcome to SimVillage, $playername! (copyright $currentyear7)"
    }

    //===================
    runSimulation2("khalid", :: printerconstruction) { playername, numbuildin ->
        val currentYear = 2018
        println("Adding $numbuildin houses")
        "Welcome to SimVillage, $playername! (copyright $currentYear)"
    }
    runSimulation3()



}
fun runsimulation(playername:String , greetingfunction:(String,Int)->String){
    val numbuilding = Random.nextInt(1..3)
    println(greetingfunction(playername,numbuilding))
}
inline fun runSimulation2(
    playerName: String,
    costprinter:(Int)->Unit,
    greetingFunction: (String, Int) -> String
) {
    val numBuildings = Random.nextInt(1..3)
    costprinter(numBuildings)
    println(greetingFunction(playerName, numBuildings))}
fun printerconstruction(numbulding : Int){
    val cost = 500
    println("construture cost: ${cost * numbulding}")
}
fun runSimulation3() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("khalid"))
    println(greetingFunction("khalid"))
}
fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}
