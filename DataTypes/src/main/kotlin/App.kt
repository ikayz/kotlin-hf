/*
Created by IntelliJ IDEA. User: ikayz Date: 21/07/2021 
Day: Wednesday Time: 9:40 am
*/
fun main(args: Array<String>) {
    // Byte
    var byte: Byte = 1

    // Short
    var short: Short = 12

    // Int
    var int: Int = 123

    // Long
    var long: Long = 1234L

    // String
    var string: String = "This is a string of characters"

    // Character
    var char: Char = 'C'

    // Boolean
    var bool = true

    println("Byte: $byte")
    println("Short: $short")
    println("Int: $int")
    println("Long: $long")
    println("String: $string")
    println("Char: $char")
    println("Boolean: $bool")

    // Converting to a different type
    var double: Double = int.toDouble();

    var doubleLong: Long = double.toLong()

    println("Int converted to double: $double")
    println("Double converted to Long: $doubleLong")
}