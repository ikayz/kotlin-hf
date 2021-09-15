/*
Created by IntelliJ IDEA. User: ikayz Date: 31/08/2021 
Day: Tuesday Time: 10:34 pm
*/
// Kotlin from Pluralsight

fun main(args: Array<String>) {
    var q: Question? = Question()
    q = Question()
    q.Answer = "42"

    q.display()

    println("The answer to the question \"${q.Question}\" is \"${q.Answer}\"")

    val message = if (q.Answer == q.CorrectAnswer) {
        println("You were correct")
    } else {
        println("Try again?")
    }

    println(message)
}

class Question {
    var Answer:String? = null
    var CorrectAnswer = "42"
    val Question: String = "What is the answer to life, the universe and everything?"

    fun display() {
        println("You said $Answer")
    }
}
