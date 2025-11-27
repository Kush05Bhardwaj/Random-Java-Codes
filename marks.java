class MarksOutOfRangeException extends Exception {
    public MarksOutOfRangeException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) throws MarksOutOfRangeException {
        this.name = name;
        setMarks(marks);
    }

    public void setMarks(int marks) throws MarksOutOfRangeException {
        if (marks < 0 || marks > 100) {
            throw new MarksOutOfRangeException("Marks must be between 0 and 100!");
        } else {
            this.marks = marks;
        }
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class marks {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Kushagra", -85);
            s1.display();

            Student s2 = new Student("Rohit", 120);
            s2.display();
        } 
        catch (MarksOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
