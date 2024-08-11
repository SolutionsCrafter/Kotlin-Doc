package functions

/**
 * Function parameters are written within parentheses ().
 * Each parameter must have a type, and multiple parameters must be separated by commas ,.
 * The return type is written after the function's parentheses (), separated by a colon :.
 * The body of a function is written within curly braces {}.
 * The return keyword is used to exit or return something from a function.
 */

fun main(){
    function1()
    function2("Channa")
    function3("Pizza",20.50)

    function4() //There is no parameter value,therefor default parameter value will assign
    function4("Jack")  //This time parameter value will assign

    println(function5(20,40))
    println(function6(20,40))
}

fun function1(){
    println("Hello!")
}


//Named arguments
fun function2(name:String){
    println("Hello $name!")
}

fun function3(food:String , price:Double){
    println("$food: $price$")   //20.5
    println("$food: ${"%.2f".format(price)}")   //20.50
}


//Default parameter values
fun function4(name:String="user"){
    println("Hello $name!") //Default value for parameter
}


//Return type function
fun function5(num1:Int , num2:Int):Int{
    return num1+num2
}

    //above function5 can be written as:
fun function6(num1:Int , num2:Int) = num1+num2
    //or
//fun function6(num1:Int , num2:Int):Int = num1+num2
