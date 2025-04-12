public class Audiobook implements BorrowResource {
    private Student borrower;
    private String title; // also known as the bookName
    private String author;

    public Audiobook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void borrow(Student student) {
        this.borrower = student; // Student object borrowed this book
        student.addBorrowed(this);
    }

    @Override
    public void getInfo() {
        System.out.println("This audiobook's name is " + title + " and is authored by " + author);
    }

    @Override
    public void getBorrower() {
        if (borrower != null) { // If it was not borrowed then it will not give this sout statement
            System.out.println(this.title + " was borrowed by " + borrower.getName());
        }
    }
}
