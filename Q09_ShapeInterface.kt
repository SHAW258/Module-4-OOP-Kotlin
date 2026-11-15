// Question 9: Circle and Rectangle implement the Shape interface.

import kotlin.math.PI

interface Shape {
    fun area(): Double
}

class Circle(val radius: Double) : Shape {
    override fun area(): Double = PI * radius * radius
}

class Rectangle(
    val length: Double,
    val breadth: Double
) : Shape {
    override fun area(): Double = length * breadth
}

fun main() {
    val circle = Circle(radius = 3.0)
    val rectangle = Rectangle(length = 4.0, breadth = 5.0)

    println("Circle area: " + circle.area())
    println("Rectangle area: " + rectangle.area())
}
