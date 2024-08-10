package basic_types

/**
 * Lists:    Lists store items in the order that they are added, and allow for duplicate items.
 * Sets:     Unique unordered collections of items.
 * Maps:     Sets of key-value pairs where keys are unique and map to only one value.
 */


/** Different between array and list
 *      Arrays
 * Fixed Size: Size is set when the array is created and cannot be changed.
 * Mutability: Contents are mutable (elements can be changed), but the size is not.
 * Performance: Offers constant-time access (O(1)) for reading and updating elements.
 * Operations: Basic operations (access, update) are supported; more complex operations require additional steps or conversions.
 * Usage: Suitable for scenarios where the size is known in advance and performance is critical.

 *      Lists
 * Dynamic Size: Can grow or shrink dynamically as elements are added or removed.
 * Mutability: Can be either immutable (e.g., fixed-size lists) or mutable (e.g., ArrayList, LinkedList).
 * Performance: Access time varies by implementation; e.g., ArrayList provides constant-time access (O(1)), while LinkedList is better for insertions and deletions.
 * Operations: Rich set of built-in methods for adding, removing, sorting, and searching elements.
 * Usage: Ideal for scenarios where the size is unknown or changes frequently, and when additional operations are needed.
 */

//List
fun list(){
    /**
     * listOf():  read-only list (List).
     * mutableListOf():  mutable list (MutableList).
     */

    //Read only list
    val list1 = listOf('A','B','C')

    //Mutable list
    var  list2 = mutableListOf(10,20,30)

    //Mutable list with explicit type declaration
    var list3: MutableList<String> = mutableListOf("car","van","bus")


    // Get the first or last item in a list, use .first() and .last() functions

    println("First item: ${list1[0]}")      //using index value
        //Or
    println("First item: ${list2.first()}")    //using function

    println("Last item: ${list2.last()}")


    // Get the number of items in a list, use the .count()

    println("Number of items: ${list3.count()}")


    // Check that an item is in a list, use the in operator

    println("van" in list3)     //give true
    println("plane" in list3)       //give false


    // Add or remove items from a mutable list, use .add() and .remove()

    list2.add(1,15)
    println(list2)

    list2.remove(15)
    println(list2)


    // Confusions

    val shapes1: MutableList<String> = mutableListOf("triangle", "square", "circle")
    /**
     * shapes = mutableListOf("hexagon", "octagon") // Compilation error

     * shapes.add("hexagon") // Allowed
     * shapes.remove("circle") // Allowed
     * shapes[0] = "pentagon" // Allowed
     */

    var shapes2: MutableList<String> = mutableListOf("triangle", "square", "circle")
    /**
     * shapes = mutableListOf("hexagon", "octagon") // Allowed

     * shapes.add("hexagon") // Allowed
     * shapes.remove("circle") // Allowed
     * shapes[0] = "pentagon" // Allowed
     */

    //Summery

    /**
     * val: Fixed after initial assignment. Cannot be reassigned to a different object.
            Object Contents can be modified if the object is mutable (add./remove./name[index]).

     * var: Can be reassigned to a different object after initialized.
            Object Contents can be modified if the object is mutable (add./remove./name[index]).
     */
}

// Set

/**
 * Whereas lists are ordered and allow duplicate items, sets are unordered and only store unique items.
 * To create a read-only set (Set), use the setOf() function.
 * To create a mutable set (MutableSet), use the mutableSetOf().
 */

fun set(){
    val set1 = setOf(10,20,30)
    val set2 = mutableSetOf("red","green","blue")
    val set3: MutableSet<Int> = mutableSetOf(1,2,3)

    //Other functions same as list(count(),first(),last(),in,add(),remove())
}


// Map

/**
 * Maps store items as key-value pairs.
 * You access the value by referencing the key.
 * Every key in a map must be unique.
 * Can have duplicate values in a map.
 * To create a read-only map (Map), use the mapOf() function.
 * To create a mutable map (MutableMap), use the mutableMapOf() function.
 */

fun map(){
    val map1 = mapOf("apple" to 50, "banana" to 30, "orange" to 40)
    println(map1)

    val map2: MutableMap<Int,Int> = mutableMapOf(1 to 1927, 2 to 28920, 3 to 3028)
    val map3: MutableMap<String,Int> = mutableMapOf("Dog" to 11, "Cat" to 22, "Fish" to 33)

    // Indexed access operator
    println("Price of an orange: ${map1["orange"]}")

    // To add or remove items from a mutable map, use .put() and .remove()
    map2.put(4,4874)
    map2.remove(3)
    println(map2)

    map3.put("Bird",44)
    // Remove item and print map3 in a single statement
    println(map3.apply { remove("Dog") })


    /**
     * To check that a key or value is in a map, use the "in" operator.
     * To get the number of items in a map, use the .count()
     * To check if a specific key is already included in a map, use the .containsKey()
     */

    println(map3.containsKey("Cat"))    //give true
    println(map3.containsKey("Elephant"))     //give false

    //Print Keys or Values separately
    println(map3.keys)
    println(map3.values)
    println(map3)

    //"in" operator
    println("Cat" in map3)
    println("Cat" in map3.keys)
    println(22 in map3.values)

}






fun main(){

}