package control_flow

//For condition
fun ifCondition(){
    val num1:Int = 20
    val num2:Int = 10

    if (num1 >= num2){
        println("Higher number: $num1")
    }else{
        println("Higher number: $num2")
    }

    // If true then return 20,If not then print "You wrong"
    println(if(num1 < num2) 20 else "You wrong")



//When condition (same as switch condition)
    val color = "red"

    when(color){
        "green" -> println("Color is green")

        "blue" -> println("Color is blue")

        "red" -> println("Color is red")

        else -> println("Can't find the color") // default statement
    }
}


//For loop

/**
 * In Kotlin, when you use a for loop with a range, the loop automatically iterates over each value in the specified range(++ or --)
 *
 * Ranges
 *  1..4 is equivalent to 1, 2, 3, 4
 *  1..<4 is equivalent to 1, 2, 3
 *  4 downTo 1 is equivalent to 4, 3, 2, 1
 *  1..5 step 2 is equivalent to 1, 3, 5 (step 2 = increment by 2)
 *  These ranges can be used with Char type
 *      'a'..'d' is equivalent to 'a', 'b', 'c', 'd'
 *      'z' downTo 's' step 2 is equivalent to 'z', 'x', 'v', 't'
 */

fun forLoop1(){
    for (number in 1..10){   //initial number=1 and execute until number=10
        println(number)
    }
}


fun forLoop2(){
    for (number in 1..<10){    //initial number=1 and execute until number=9
        println(number)
    }
}


fun forLoop3(){
    for (number in 10 downTo 1){
        println(number)
    }
}


fun forLoop4(){
    for (number in 1..10 step 2){
        println(number)
    }
}

fun forLoop5(){
    val fruits = listOf("mange","apple","orange","banana","papaya")
    for (number in fruits){    //loop that iterates over each element in the fruits list.The loop variable items takes on the value of each element in the list one by one
        println(number)
    }
}


//While loop

/**
 * while can be used in two ways:
 *      To execute a code block while a conditional expression is true. (while)
 *      To execute the code block first and then check the conditional expression. (do-while)
 */

fun whileLoop1(){
    var number = 0
    while (number < 10){
        println(number)
        number++
    }
}

fun whileLoop2(){
    var number = 0
    do {
        println(number)
        number++
    }while (number < 10)
}


fun main(){

}
