package Boolean

fun firstOperand(): Boolean{
    println("First Operand")
    return false
}
fun secondOperand(): Boolean{
    println("Second Operand")
    return true
}
fun main(){
    demoBoolean()
//    demoChar()
}
private fun demoBoolean(){
    var willExercise: Boolean = false
    val bigNumber = 1_000_00
    val smallNumber = 2
    println("is big is bigger = ${bigNumber>smallNumber}")

    if (firstOperand() || secondOperand()){
        println("at least one operand is true")
    }

    if (firstOperand() && secondOperand()){
        println("Both operand are true")
    }

    println("Will exercise = ${!willExercise}")
}
private fun demoChar(){
    val  letter:Char ='A'
    val tab='\t'
    val infinity='\u221E'
    println("Letter = $letter")
    println("Tab $tab over")
    println("Infinity $infinity")

    val lineFeed =10.toChar()
    println("Line feed = $lineFeed next char")
}