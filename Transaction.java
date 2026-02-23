public class Transaction {
    private Member member;
    private Book book;
    private String transactionType; // Borrow or Return

    public Transaction(Member member, Book book, String transactionType) {
        this.member = member;
        this.book = book;
        this.transactionType = transactionType;
    }

    public String getTransactionDetails() {
        return "Transaction: " + transactionType + ", Member: " + member.getDetails() + ", Book: " + book.getDetails();
    }

    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", 29.99);
        Member member = new Member("John Doe", "M001");
        Transaction transaction = new Transaction(member, book, "Borrow");
        System.out.println(transaction.getTransactionDetails());
    }
}
