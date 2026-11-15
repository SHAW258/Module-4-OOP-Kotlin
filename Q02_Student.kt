// Question 2: Student class with an introduce() function.

class Student(
    val name: String,
    val rollNumber: Int
) {
    fun introduce() {
        println("My name is " + name + " and my roll number is " + rollNumber + ".")
    }
}

fun main() {
    val student = Student("Anita", 12)
    student.introduce()
}
