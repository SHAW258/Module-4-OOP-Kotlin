// Question 6: Dog inherits eat() and sleep() from Animal and adds bark().

open class Animal {
    fun eat() {
        println("The animal is eating.")
    }

    fun sleep() {
        println("The animal is sleeping.")
    }
}

class Dog : Animal() {
    fun bark() {
        println("The dog is barking.")
    }
}

fun main() {
    val dog = Dog()
    dog.eat()
    dog.sleep()
    dog.bark()
}
