import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Add scanner for user input
        int q;
        do {
            DisplayL.Welcome();
            int system1 = scanner.nextInt(); // Read user input
            switch (system1) {
                case 1:
                    System.out.println("Student Information ");
                    StudentL.infoS();
                    break;
                case 2:
                    System.out.println("Staff Information ");
                    StaffL.infoSt();
                    break;
                case 3:
                    System.out.println("Information of books ");
                    LibraryBook2.infoB();
                    break;
                case 4:
                    System.out.println("Checkin a book");
                    CheckinL.checkInBook();
                    break;
                case 5:
                    System.out.println("Checkout a book");
                    CheckoutL.checkOutBook();
                    break;
                default:
                    System.out.println("You entered a wrong number. Check it and try again");
                    break;
            }
            q = DefL.dis();
        } while (q == 1);
        System.out.println("Thank you for using the Library Management System. Goodbye!");
    }
}

class DisplayL {
    static void Welcome() {
        System.out.println("                                        ");
        System.out.println("Welcome to the Library Management System");
        System.out.println("             of XYZ University          ");
        System.out.println("How can we help you today?");
        System.out.println("----------------------------------------");
        System.out.println("1. Student Information ");
        System.out.println("2. Staff Information ");
        System.out.println("3. Information of books ");
        System.out.println("4. Checkin a book ");
        System.out.println("5. Checkout a book ");
        System.out.println();
        System.out.print("Please enter the value: ");
    }
}

class LibraryBook2 {
    static ArrayList<BookInfoL> books = new ArrayList<>();

    static {
        books.add(new BookInfoL(1, "Harry Potter", "J. K. Rowling"));
        books.add(new BookInfoL(2, "Lord of the Rings", "J. R. R. Tolkien"));
        books.add(new BookInfoL(3, "Hobbit", "J. R. R. Tolkien"));
        books.add(new BookInfoL(4, "Narnia", "C. S. Lewis"));
        books.add(new BookInfoL(5, "Percy Jackson", "Rick Riordan"));
    }

    static void infoB() {
        System.out.println("Information of Books");
        for (BookInfoL book : books) {
            System.out.println("Book ID: " + book.bookID);
            System.out.println("Name: " + book.name);
            System.out.println("Author: " + book.author);
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("If you wish to enter details of new books");
        System.out.println("1. YES");
        System.out.println("2. NO");
        int x = scanner.nextInt();
        if (x == 1) {
            System.out.println("How many books you wish to enter?");
            int y = scanner.nextInt();
            for (int a = 0; a < y; a++) {
                System.out.println("Book ID: ");
                int newBookID = scanner.nextInt();
                System.out.println("Name: ");
                String newName = scanner.next();
                System.out.println("Author: ");
                String newAuthor = scanner.next();
                books.add(new BookInfoL(newBookID, newName, newAuthor));
            }
        }
    }
}

class StudentL {
    static ArrayList<StudentInfoL> students = new ArrayList<>();

    static {
        students.add(new StudentInfoL(1, "John", "Diaz"));
        students.add(new StudentInfoL(2, "Harry", "Perera"));
        students.add(new StudentInfoL(3, "Lisa", "Alwis"));
        students.add(new StudentInfoL(4, "Sam", "Lewis"));
        students.add(new StudentInfoL(5, "Percy", "Smith"));
    }

    static void infoS() {
        System.out.println("Student Information");
        for (StudentInfoL student : students) {
            System.out.println("Student ID: " + student.studID);
            System.out.println("First Name: " + student.Fname);
            System.out.println("Last Name: " + student.Lname);
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("If you wish to enter details of new students");
        System.out.println("1. YES");
        System.out.println("2. NO");
        int x = scanner.nextInt();
        if (x == 1) {
            System.out.println("How many student details you wish to enter?");
            int y = scanner.nextInt();
            for (int a = 0; a < y; a++) {
                System.out.println("Student ID: ");
                int newStudID = scanner.nextInt();
                System.out.println("First Name: ");
                String newFname = scanner.next();
                System.out.println("Last Name: ");
                String newLname = scanner.next();
                students.add(new StudentInfoL(newStudID, newFname, newLname));
            }
        }
    }
}

class StaffL {
    static ArrayList<StaffInfoL> staffMembers = new ArrayList<>();

    static {
        staffMembers.add(new StaffInfoL(1, "Sam"));
        staffMembers.add(new StaffInfoL(2, "John"));
        staffMembers.add(new StaffInfoL(3, "Lily"));
        staffMembers.add(new StaffInfoL(4, "Nataliya"));
        staffMembers.add(new StaffInfoL(5, "Rex"));
    }

    static void infoSt() {
        System.out.println("Information of Staff");
        for (StaffInfoL staff : staffMembers) {
            System.out.println("Staff ID: " + staff.staffID);
            System.out.println("Name: " + staff.name);
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("If you wish to enter details of new staff members");
        System.out.println("1. YES");
        System.out.println("2. NO");
        int x = scanner.nextInt();
        if (x == 1) {
            System.out.println("How many staff details you wish to enter?");
            int y = scanner.nextInt();
            for (int a = 0; a < y; a++) {
                System.out.println("Staff ID: ");
                int newStaffID = scanner.nextInt();
                System.out.println("Name: ");
                String newName = scanner.next();
                staffMembers.add(new StaffInfoL(newStaffID, newName));
            }
        }
    }
}

class CheckinL {
    static void checkInBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Book ID to check in: ");
        int bookID = scanner.nextInt();
        // Logic to check in the book
        System.out.println("Book with ID " + bookID + " has been checked in.");
    }
}

class CheckoutL {
    static void checkOutBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Book ID to check out: ");
        int bookID = scanner.nextInt();
        // Logic to check out the book
        System.out.println("Book with ID " + bookID + " has been checked out.");
    }
}

class DefL {
    static int dis() {
        Scanner scanner = new Scanner(System.in); // Add scanner for user input
        System.out.println("Do you want to continue?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int p = scanner.nextInt();
        if (p == 1) {
            DisplayL.Welcome();
        }
        return p;
    }
}

class BookInfoL {
    int bookID;
    String name;
    String author;

    BookInfoL(int bookID, String name, String author) {
        this.bookID = bookID;
        this.name = name;
        this.author = author;
    }
}

class StudentInfoL {
    int studID;
    String Fname;
    String Lname;

    StudentInfoL(int studID, String Fname, String Lname) {
        this.studID = studID;
        this.Fname = Fname;
        this.Lname = Lname;
    }
}

class StaffInfoL {
    int staffID;
    String name;

    StaffInfoL(int staffID, String name) {
        this.staffID = staffID;
        this.name = name;
    }
}
