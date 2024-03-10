  data class Book(
    val title: String,
    val author: String,
    val publicationYear: Int,
    private var isCheckedOut: Boolean = false
): LibraryItem {
      override fun checkOut(): Boolean {
          isCheckedOut = true
          return isCheckedOut
      }

      override fun returnItem(): Boolean {
          isCheckedOut = false
          return isCheckedOut
      }

      override fun isAvailable(): Boolean = !isCheckedOut

  }