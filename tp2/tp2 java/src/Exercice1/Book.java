package Exercice1;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String t, String a, int p) {
        this.title = t;
        this.author = a;
        this.price = p;
    }

     public String getTitle() {
        return this.title;
     }
     public String getAuthor() {
        return this.author;
     }
     public int getPrice() {
        return this.price;
     }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void printInformation() {
        System.out.printf("le titre du livre est : %s. il à été écrit par %s. ce livre coute %d euros",getTitle(),getAuthor(),getPrice());
    }

    public static void main(String[] args) {
        Book myBook = new Book("edgard le bot","lukas",25);
        myBook.printInformation();
    }
}
