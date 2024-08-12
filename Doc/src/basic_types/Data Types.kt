package basic_types

fun main() {

    // val: Declare  immutable variables as read-only(constant)
    // var: Declare mutable variables
    val name = "Channa"
    val age = 10
    var number = 5.6

    number = 8.5


    println("Hello World!")

    println(number)

    print("Hello ")
    println(name)

    println("Hello $name")
    println("My number is ${number+20}")

    val myName = "My name is $name"
    println(myName)

    val myAge = "My age is ${age+14}"
    println(myAge)


    // +=, -=, *=, /=, %=

    var count = 10
    count += 5
    println(count)


    /**
     *     Integers:    Byte, Short, Int, Long
     *     Unsigned integers:   UByte, UShort, UInt, ULong
     *     Floating-point numbers:   Float, Double
     *     Booleans:    Boolean
     *     Characters:   Char
     *     Strings:   String
     */

    var value1: Int = 10
    var value2: UByte = 10u
    var value3: Float = 20.52f
    var value4: Boolean = true
    var value5: Char = 'C'
    var value6: String = "Channa"

    /**
     * val x: Int = 10:
     *      Explicit Type Declaration: You explicitly declare the type of x as Int.
     *      Type Safety: This ensures that x will always be of type Int, and the compiler will enforce this type. If you try to assign a non-Int value to x, you'll get a compile-time error.
     *
     * val x = 10:
     *       Type Inference: Kotlin infers the type of x from the assigned value. In this case, x is inferred to be of type Int because 10 is an integer.
     *       Less Verbose: This is more concise and can make your code cleaner when the type can be easily inferred.
     */

//Null safety

    var myColor1: String = "red" //This cannot be null

    var myCoor2: String? = "red" //This can be null


//Number conversions to other types:
    /**
     * toByte(): Byte
     * toShort(): Short
     * toInt(): Int
     * toLong(): Long
     * toFloat(): Float
     * toDouble(): Double
     */

    /** Can do:
     *      Between Numeric Types: Int,Double,Float....
     *      Numeric types to String: (Int,Double,Float) to String.
     *      String(numeric values) to numeric types. Eg: "12345" to Int
     */

    /** Cannot do:
     *      String(not numeric value) to Numeric types. Eg: "Hello" to Int
     */
    println("\n   Number conversions")

    val aString:String = "12345"
    val aInt:Int = 200
    val aDouble:Double = 10.27

    val x:Int = aDouble.toInt()
    println(x)

    val y:Float = aInt.toFloat()
    println(y)

    val z:String = aInt.toString()
    println(z)

    val n:Double = aString.toDouble()
    println(n)

//Characters

    /**
     *  \t – tab
     *   \b – backspace
     *  \n – new line (LF)
     *  \r – carriage return (CR)
     *  \' – single quotation mark
     *  \" – double quotation mark
     *  \\ – backslash
     *  \$ – dollar sign
     */

    println("\nHello!\t....\n200\$\n\"Characters\'\t\\")


}