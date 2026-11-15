// Question 7: Teacher and Student inherit common details from Person.

open class Person(
    val name: String,
    val age: Int
) {
    open fun introduce() {
        println("Name: " + name + ", Age: " + age)
    }
}

class Teacher(
    name: String,
    age: Int,
    private val subject: String
) : Person(name, age) {
    override fun introduce() {
        super.introduce()
        println("Subject: " + subject)
    }
}

class Student(
    name: String,
    age: Int,
    private val rollNumber: Int
) : Person(name, age) {
    override fun introduce() {
        super.introduce()
        println("Roll number: " + rollNumber)
    }
}

fun main() {
    val teacher = Teacher("Mr. Rao", 40, "Kotlin")
    val student = Student("Maya", 19, 7)

    teacher.introduce()
    student.introduce()
}
