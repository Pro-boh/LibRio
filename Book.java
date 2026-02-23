public class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Constructor with one parameter
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Constructor with two parameters
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // Constructor with three parameters
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println(getDetails());
    }

    public String getDetails() {
        return "Title: " + title + ", Author: " + author + ", Price: " + price;
    }
}
