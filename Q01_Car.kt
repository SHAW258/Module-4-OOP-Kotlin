// Question 1: Create three Car objects and print their details.

class Car(
    val brand: String,
    val model: String,
    val price: Double
)

fun main() {
    val cars = listOf(
        Car("Toyota", "Corolla", 22000.0),
        Car("Honda", "Civic", 25000.0),
        Car("Tesla", "Model 3", 40000.0)
    )

    for (car in cars) {
        println("Brand: " + car.brand + ", Model: " + car.model + ", Price: " + car.price)
    }
}
