import java.util.*

/*
Created by IntelliJ IDEA. User: ikayz Date: 25/07/2021 
Day: Sunday Time: 12:19 pm
*/
fun main() {
    dayOfWeek()
}

fun dayOfWeek() {
    print("What day is it today? ")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when (day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
    }
}