package String

fun main(){
    val greeting: String = "Hello there"
    val owe = 50

    val janet = "I owe Janet \$$owe dollars"
    println(janet)

    val infinity = "The infinity symbol is \u221E"
    println(infinity)

    println("[$greeting] is ${greeting.length} characters long")

    var bad = greeting.get(2)
    val letter = greeting[1]

    val compare1 = "beta"
    val compare2 = "alpha"
    println("${compare1.compareTo(compare2)}")

    val sub = greeting.subSequence(6,9)
    println("Sub = $sub")

    for (single in greeting){
        print("$single ")
    }

    //row string
    val myString = """
        Kotlin is fun
        Kotlin is pragmatic
    """
    println("$myString")
}