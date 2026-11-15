// Question 5: Use getter and setter functions to validate an employee's salary.

class Employee(initialSalary: Double = 0.0) {
    private var salary: Double =
        if (initialSalary.isFinite() && initialSalary >= 0.0) initialSalary else 0.0

    fun setSalary(newSalary: Double): Boolean {
        if (!newSalary.isFinite() || newSalary < 0.0) return false

        salary = newSalary
        return true
    }

    fun getSalary(): Double = salary
}

fun main() {
    val employee = Employee()

    println("Valid salary accepted: " + employee.setSalary(35000.0))
    println("Invalid salary accepted: " + employee.setSalary(-500.0))
    println("Employee salary: " + employee.getSalary())
}
