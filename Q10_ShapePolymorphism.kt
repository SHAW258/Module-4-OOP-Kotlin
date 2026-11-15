// Question 10: Override area() in Shape subclasses and call it polymorphically.

import kotlin.math.PI

abstract class Shape {
    abstract fun area(): Double
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double = PI * radius * radius
}

class Rectangle(
    val length: Double,
    val breadth: Double
) : Shape() {
    override fun area(): Double = length * breadth
}

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(radius = 3.0),
        Rectangle(length = 4.0, breadth = 5.0)
    )

    for (shape in shapes) {
        println("Area: " + shape.area())
    }
}
