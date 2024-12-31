



class Library {
      int totalBooks ; // Shared across all Library objects
    String bookName;           // Unique to each book (object)

    Library(String bookName) {
        this.bookName = bookName;
        totalBooks++; // Increment totalBooks for every new book added
    }

    void displayBook() {
        System.out.println("Book Name: " + bookName);
    }

       void displayTotalBooks() {
        System.out.println("Total Books: " + totalBooks);
    }
}

public class Static {
    public static void main(String[] args) {
        Library book1 = new Library("Java Programming");
        Library book2 = new Library("Python Programming");
     
       

        book1.displayBook(); // Outputs: Book Name: Java Programming
        book2.displayBook(); // Outputs: Book Name: Python Programming

      

        
        

    }
}
