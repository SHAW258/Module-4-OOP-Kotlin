// Question 3: Calculate the area of a rectangle.

class Rectangle(
    val length: Double,
    val breadth: Double
) {
    fun area(): Double = length * breadth
}

fun main() {
    val rectangle = Rectangle(length = 10.0, breadth = 5.0)
    println("Rectangle area: " + rectangle.area())
}
