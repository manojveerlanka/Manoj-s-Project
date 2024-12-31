

public class InhertA10 {

    public static void main(String[] args) {
        Book book = new Book("Nightingale", 2009, "Unknown");

        book.displayInfo();
        Magazine magazine = new Magazine("500", "Book of Kings", 2010);
        magazine.displayInfo();
    }

}

class LibraryItem {
    protected String title;
    protected int yearPublished;

    public LibraryItem(String t, int yrPub) {
        this.title = t;
        this.yearPublished = yrPub;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + "  YearPublished: " + yearPublished);
    }
}

class Book extends LibraryItem {
    private String author;

    public Book(String t, int yearPub, String auth) {
        super(t, yearPub);
        this.author = auth;

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
    }
}

class Magazine extends LibraryItem {
    String issueNumber;

    public Magazine(String issNum, String t, int yrPub) {
        super(t, yrPub);
        this.issueNumber = issNum;

    }

    @Override
    public void displayInfo() {
        System.out.println(
                "Title: " + super.title + "  YearPublished: " + super.yearPublished + "Issue Num: " + issueNumber);
    }

}