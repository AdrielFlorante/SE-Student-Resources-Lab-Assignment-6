public interface BorrowResource {
    void borrow(Student student); // Must pass student object to borrow a resource
    void getInfo();
    void getBorrower();
}
