/*
Created by IntelliJ IDEA. User: ikayz Date: 25/07/2021 
Day: Sunday Time: 12:19 pm
*/
import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")
    feedTheFish()
}

fun feedTheFish() {
    val day = "Tuesday"
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}