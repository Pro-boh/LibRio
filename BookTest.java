public class BookTest {
    public static void main(String[] args) {
        // Using default constructor
        Book book1 = new Book();
        book1.displayDetails(); // Output: Title: Unknown, Author: Unknown, Price: 0.0

        // Using constructor with one parameter
        Book book2 = new Book("Effective Java");
        book2.displayDetails(); // Output: Title: Effective Java, Author: Unknown, Price: 0.0

        // Using constructor with two parameters
        Book book3 = new Book("Effective Java", "Joshua Bloch");
        book3.displayDetails(); // Output: Title: Effective Java, Author: Joshua Bloch, Price: 0.0

        // Using constructor with three parameters
        Book book4 = new Book("Effective Java", "Joshua Bloch", 45.0);
        book4.displayDetails(); // Output: Title: Effective Java, Author: Joshua Bloch, Price: 45.0
    }
}
