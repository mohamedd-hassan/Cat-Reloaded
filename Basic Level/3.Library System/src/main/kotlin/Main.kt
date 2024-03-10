fun main() {
    val library = Library()
    var patrons = mutableListOf(
        Patron("Mohamed"),
        Patron("7amasa"),
        Patron("Goku")
    )

    val books = mutableListOf(
        Book("Norse Mythology", "Neil Gaiman", 2017),
        Book("The Witcher: The Last Wish", " Andrzej Sapkowski", 1993),
        Book("Operating System Concepts", "Abraham Silberschatz", 2021),
        Book("Mythos", "Stephen Fry", 2017),
        Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979),
    )

    books.forEachIndexed { _, book ->
        library.addBook(book)
    }


    //Check Out a book to Patron Mohamed
    library.checkOutBook(patrons[0], books[0])
    println("Patron: ${patrons[0].name}, checked out: \n ${patrons[0].checkedOutBooks} \n")

    //Test Checking Out an already checked out book by a different Patron
    library.checkOutBook(patrons[1], books[0])
    println("Patron: ${patrons[1].name}, checked out: \n ${patrons[1].checkedOutBooks} \n")

    //Test Returning a book
    library.returnBook(patrons[0],books[0])

    //Test Checking out a returned book
    library.checkOutBook(patrons[1], books[0])
    println("Patron: ${patrons[1].name}, checked out: \n ${patrons[1].checkedOutBooks} \n")

}