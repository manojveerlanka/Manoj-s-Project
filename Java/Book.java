

public class Book {
   
  String title="Java Programming ";
     String author="John Doe";
    double price=29.99;
     int pages=300;

  
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: ", price);
        System.out.println("Pages: " + pages);
    }

    
    public static void main(String[] args) {
        
        Book book = new Book();
        book.displayInfo();
    }
}
