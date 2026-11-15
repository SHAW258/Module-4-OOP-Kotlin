// Question 4: Encapsulate the balance and prevent it from becoming negative.

class BankAccount(initialBalance: Double = 0.0) {
    private var balance: Double =
        if (initialBalance.isFinite() && initialBalance >= 0.0) initialBalance else 0.0

    fun deposit(amount: Double): Boolean {
        if (!amount.isFinite() || amount <= 0.0) return false

        balance += amount
        return true
    }

    fun withdraw(amount: Double): Boolean {
        if (!amount.isFinite() || amount <= 0.0 || amount > balance) return false

        balance -= amount
        return true
    }

    fun getBalance(): Double = balance
}

fun main() {
    val account = BankAccount(initialBalance = 1000.0)

    println("Deposit accepted: " + account.deposit(500.0))
    println("Withdrawal accepted: " + account.withdraw(300.0))
    println("Overdraw accepted: " + account.withdraw(2000.0))
    println("Current balance: " + account.getBalance())
}
