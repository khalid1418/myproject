fun main() {
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
divide(num1, num2)
}
fun divide(num1:Int , num2:Int){
    try {
        println("$num1 / $num2 =  ${num1 / num2}")
    }catch (exception : ArithmeticException){
        println("can't divide by zero")
    }

}