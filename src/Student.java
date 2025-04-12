import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<BorrowResource> borrowedRes;
    private String name;

    public Student(String name) {
        this.name = name; // Student has a name
        this.borrowedRes = new ArrayList<>();
    }

    public String getName() {
        return name; // Return student's name
    }

    public void addBorrowed(BorrowResource resource) {
        borrowedRes.add(resource);
    }

    public void listBorrowedResources() {
        System.out.println(name + " has borrowed:");
        for (BorrowResource res : borrowedRes) {
            res.getInfo();
        }
    }
}
