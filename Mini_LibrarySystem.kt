// Mini assignment: A Library keeps its book list private and manages it through functions.

data class Book(
    val title: String,
    val author: String
)

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun removeBook(title: String, author: String): Boolean {
        return books.remove(Book(title, author))
    }

    fun showBooks() {
        if (books.isEmpty()) {
            println("The library has no books.")
            return
        }

        for ((index, book) in books.withIndex()) {
            println((index + 1).toString() + ". " + book.title + " by " + book.author)
        }
    }
}

fun main() {
    val library = Library()

    library.addBook(Book("The Hobbit", "J.R.R. Tolkien"))
    library.addBook(Book("1984", "George Orwell"))

    println("Books in the library:")
    library.showBooks()

    println("Removed 1984: " + library.removeBook("1984", "George Orwell"))
    println("Books after removal:")
    library.showBooks()
}
