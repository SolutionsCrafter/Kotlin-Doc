package control_flow

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


fun forLoop(){
    for (number in 1..5){
        println(number)
    }
}

fun main(){
    forLoop()
}
