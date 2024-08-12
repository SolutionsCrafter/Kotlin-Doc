package classes

//Create instance

/**
 * To create an object from a class, you declare a class instance using a constructor.
 * By default, Kotlin automatically creates a constructor with the parameters declared in the class header.
 */
class Contact1(var id:Int , var email:String) {
    fun main1(){
        val contact = Contact1(1,"mary@gmail.com")
    }
}
/**
 * Contact is a class.
 * contact is an instance of the Contact class.
 * id and email are properties.
 * id and email are used with the default constructor to create contact.
 */


//Access properties

fun main2(){
    val contact = Contact1(1,"mary@gmail.com")
    println(contact.email)

    contact.id = 2
    contact.email = "michael@gmail.com"
    println(" Id:${contact.id}\n Email:${contact.email}")
}


//Member functions
class Contact2(val id: Int,var email:String){
    fun printId(){
        println(id)
    }
}
fun main3(){
    val contact = Contact2(1,"Channa@gmail.com")
    contact.printId()   //call a member function of class
}


//Data classes
/**
 * Kotlin has data classes which are particularly useful for storing data. Data classes have the same functionality as classes, but they come automatically with
 * additional member functions. These member functions allow you to easily print the instance to readable output, compare instances of a class, copy instances, and
 * more. As these functions are automatically available, you don't have to spend time writing the same boilerplate code for each of your classes.
 */

data class User(val id:Int,val name:String)

/** The most useful predefined member functions of data classes are:
 *      .toString():  Prints a readable string of the class instance and its properties.
 *      .equals() or ==:  Compares instances of a class.
 *      .copy():  Creates a class instance by copying another, potentially with some different properties.
 */

/** See the following sections for examples of how to use each function
 *      Print as string
 *      Compare instances
 *      Copy instance
 */

//print as string
fun main4(){
    val user = User(1,"Alex")
    println(user)   //This is worked because User is data class
}

//Compare instances
fun main5(){
    val user1 = User(1,"Alex")
    val user2 = User(2,"Max")
    val user3 = User(2,"Max")

    println("user1 = user2 is ${user1 == user2}")   //give true or false

    println("user2 = user3 is ${user2 == user3}")
}


//Copy instance
fun main6(){
    val user1 = User(1,"Alex")
    val user2 = User(2,"Max")
    val user3 = User(2,"Max")

    // Creates an exact copy of user
    println(user1.copy())

    // Creates a copy of user with name: "Max"
    println(user2.copy(name = "Mick"))

    // Creates a copy of user with id: 3
    println(user3.copy(id = 3))
}

fun main(){

}
