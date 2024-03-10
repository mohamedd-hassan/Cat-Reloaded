class Library {

     private val books: MutableList<Book> = mutableListOf()

    fun addBook(book: Book){
        books.add(book)
    }

    fun removeBook(book: Book){
        books.remove(book)
    }

    fun checkOutBook(patron: Patron, book: Book):Boolean{
        if (book.isAvailable()) {
            patron.checkedOutBooks.add(book)
            return book.checkOut()
        }
        return false
    }

    fun returnBook(patron: Patron, book: Book):Boolean {
        patron.checkedOutBooks.remove(book)
        return book.returnItem()
    }
}