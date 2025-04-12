public class TestProgram {
    public static void main(String[] args) {
        Student stud1 = new Student("Adriel");

        Book book = new Book("Clean Code", "Robert C. Martin");
        Audiobook audiobook = new Audiobook("The Pragmatic Programmer", "Andrew Hunt");
        Journal journal = new Journal("AI Monthly", "Dr. Ada Lovelace");

        System.out.println("Student's name is " + stud1.getName());

        book.borrow(stud1);
        audiobook.borrow(stud1);
        journal.borrow(stud1);

        System.out.println();
        
        stud1.listBorrowedResources();

        System.out.println();

        journal.getBorrower();
    }
}
