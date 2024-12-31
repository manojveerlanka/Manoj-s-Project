public class Book1 {

    public static void main(String[] args) {

        Book b=new Book();
        b.title="all is good";
        b.pages=35;
        b.price=50.66f;
        b.author="manoj";

        b.displayInfo();
    }
    
}


class Book{

    String title;
    String author;
    float price;
    int pages;

    void displayInfo(){

System.out.println("BookTitle: "+this.title +" "+ "Author: "+this.author +" "+ "Price: "+this.price +" "+ "pages:"+this.pages);

    }
}