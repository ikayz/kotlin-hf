import java.security.CodeSigner

/*
Created by IntelliJ IDEA. User: ikayz Date: 14/07/2021 
Day: Wednesday Time: 11:45 am
*/
fun main(args: Array<String>) {
    // Code magnet
    /*var x = 1

    while (x < 3) {
        print(if (x == 1) "Yab" else "Dab")
        print("ba")
        x = x + 1
    }
    if (x == 3) println("Do") */

    var x = 0
    var y = 0

    while (x < 5) {
        // y = x - y output is 42
        // y = y + x output is 410
        // y = y + 3 output is 411
        // if (y > 4) y = y - 1
        // x = x + 2
        // y = y + x output = 57
        if (y < 5) {
            x = x + 1
            if (y < 3) x = x - 1
        }
        y = y + 3
        print("$x$y ")
        x = x + 1
    }
}