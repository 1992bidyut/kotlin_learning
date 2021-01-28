package DataType

fun main(){
    var count: Int = 0 //(var)mutable variable that can be changed
    val number: Int= 42 //(val)Immutable variable that can not be changed

    val otherNumber =43

    val myLong: Long = 30000000L
    val myBute: Byte = 127
    val myShort: Short = 32767

    val myDouble: Double = 98.3
    val  myFloat: Float = 2.5F
    val alsoDouble: Double = 105.5

    val asInt = alsoDouble.toInt()
    val asFloat =myLong.toFloat()

    val maxInt =2_147_648
}