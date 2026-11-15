// Question 11: Dog and Cat override makeSound(); calls dispatch by actual object type.

open class Animal(val name: String) {
    open fun makeSound() {
        println(name + " makes a sound.")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println(name + " says: Woof!")
    }
}

class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println(name + " says: Meow!")
    }
}

fun main() {
    val animals: List<Animal> = listOf(
        Dog("Buddy"),
        Cat("Mittens")
    )

    for (animal in animals) {
        animal.makeSound()
    }
}
