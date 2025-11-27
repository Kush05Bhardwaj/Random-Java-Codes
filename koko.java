// class Shape {
//     public void area() {
//         System.out.println("Display Area : ");
//     }
// }
// class Triangle extends Shape {
//     public void area(int b, int h) {
//         System.out.println(0.5*b*h);
//     }
// }
// class Rectangle extends Shape {
//     public void area(int l, int b) {
//         System.out.println(l*b);
//     }
// }
// class Circle extends Shape {
//     public void area(int r) {
//         System.out.println(3.14*r*r);
//     }
// }
// class koko {
//     public static void main(String[] args) {
//         Shape O1 = new Shape();
//         O1.area(); // print Display Area :
//         Triangle T1 = new Triangle();
//         T1.area(20,30);
//         Rectangle R1 =new Rectangle();
//         R1.area(20,30);
//         Circle C1 = new Circle();
//         C1.area(5);
//     }
// }
// import java.util.Scanner;

// // Base Class
// class Account {
//     String customerName;
//     int accountNumber;
//     String accountType;
//     double balance;

//     Account(String name, int accNo, String type, double bal) {
//         customerName = name;
//         accountNumber = accNo;
//         accountType = type;
//         balance = bal;
//     }

//     // Deposit method
//     void deposit(double amount) {
//         balance += amount;
//         System.out.println("Deposited: " + amount);
//     }

//     // Display balance
//     void displayBalance() {
//         System.out.println("Account Holder: " + customerName);
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Type: " + accountType);
//         System.out.println("Balance: " + balance);
//     }
// }

// // Derived Class → Savings Account
// class SavAcct extends Account {

//     SavAcct(String name, int accNo, double bal) {
//         super(name, accNo, "Savings", bal);
//     }

//     // Compute compound interest and add to balance
//     void computeInterest(double rate, int time) {
//         double interest = balance * Math.pow((1 + rate / 100.0), time) - balance;
//         balance += interest;
//         System.out.println("Interest Added: " + interest);
//     }

//     // Withdraw method
//     void withdraw(double amount) {
//         if (amount > balance) {
//             System.out.println("Insufficient Balance!");
//         } else {
//             balance -= amount;
//             System.out.println("Withdrawn: " + amount);
//         }
//     }
// }

// // Derived Class → Current Account
// class CurrAcct extends Account {
//     final double minBalance = 1000; // Minimum balance requirement
//     final double penalty = 100;     // Penalty if balance < minBalance

//     CurrAcct(String name, int accNo, double bal) {
//         super(name, accNo, "Current", bal);
//     }

//     // Withdraw with penalty check
//     void withdraw(double amount) {
//         if (amount > balance) {
//             System.out.println("Insufficient Balance!");
//         } else {
//             balance -= amount;
//             System.out.println("Withdrawn: " + amount);

//             // Check minimum balance
//             if (balance < minBalance) {
//                 balance -= penalty;
//                 System.out.println("Balance fell below minimum. Penalty imposed: " + penalty);
//             }
//         }
//     }
// }

// // Main Class
// public class koko {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Create a Savings Account
//         SavAcct savings = new SavAcct("Rahul", 1001, 5000);
//         savings.deposit(2000);
//         savings.computeInterest(5, 2); // 5% for 2 years
//         savings.withdraw(3000);
//         savings.displayBalance();

//         System.out.println("-------------------------");

//         // Create a Current Account
//         CurrAcct current = new CurrAcct("Amit", 2001, 1500);
//         current.deposit(500);
//         current.withdraw(1200);
//         current.displayBalance();
//     }
// }


// import java.util.Scanner;
// class Person {
//     String name;
//     int age;

//     void inputDetails(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     void displayDetails() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }
// }

// class Student extends Person {
//     int rollNumber;

//     void inputDetails(String name, int age, int rollNumber) {
//         super.inputDetails(name, age);
//         this.rollNumber = rollNumber;
//     }

//     @Override
//     void displayDetails() {
//         super.displayDetails();
//         System.out.println("Roll Number: " + rollNumber);
//     }
// }

// public class koko {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Create a Student object
//         Student student = new Student();

//         // Input details
//         System.out.print("Enter name: ");
//         String name = sc.nextLine();
//         System.out.print("Enter age: ");
//         int age = sc.nextInt();
//         System.out.print("Enter roll number: ");
//         int rollNumber = sc.nextInt();

//         student.inputDetails(name, age, rollNumber);

//         // Display all details
//         System.out.println("\nStudent Details:");
//         student.displayDetails();
//     }
// }

// class LivingBeing {
//     LivingBeing() {
//         System.out.println("LivingBeing Created");
//     }
// }

// class Animal extends LivingBeing {
//     Animal() {
//         System.out.println("Animal Created");
//     }
// }

// class Dog extends
// Animal {
//     Dog() {
//         System.out.println("Dog Created");
//     }
// }
// public class koko {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//     }
// }

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Student {
    private String studentId;
    private String name;
    private HashMap<String, Character> grades;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.grades = new HashMap<>();
    }

    public void addGrade(String subject, char grade) {
        grades.put(subject, grade);
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int totalPoints = 0;
        for (char grade : grades.values()) {
            switch (grade) {
                case 'A':
                    totalPoints += 4;
                    break;
                case 'B':
                    totalPoints += 3;
                    break;
                case 'C':
                    totalPoints += 2;
                    break;
                case 'D':
                    totalPoints += 1;
                    break;
                case 'E':
                    totalPoints += 0;
                    break;
                default:
                    System.out.println("Invalid Grade: " + grade);
            }
        }
        return (double) totalPoints / grades.size();
    }

    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        for (Map.Entry<String, Character> entry : grades.entrySet()) {
            System.out.println("Subject: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
        System.out.println("GPA: " + calculateGPA());
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}

class Course {
    private final String courseCode;
    private final String courseName;
    private final ArrayList<Student> enrolledStudents;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }
    
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " enrolled in " + courseName);
    }
    
    public void dropStudent(String studentId) {
        for(Student s : enrolledStudents) {
            if(s.getStudentId().equals(studentId)) {
                enrolledStudents.remove(s);
                System.out.println(s.getName() + " dropped from " + courseName);
                return;
            }
        }
    }
    public void displayStudents() {
        System.out.println("\nCourse :" + courseName + " (" + courseCode + ")");
        if(enrolledStudents.isEmpty()) {
            System.out.println("No students enrolled.");
            return;
        } else {
            System.out.println("Enrolled Students:");
            for(Student s : enrolledStudents) {
                System.out.println("- " + s.getName() + " (ID: " + s.getStudentId() + ")");
            }
        }
    }
}




public class koko {
    public static void main(String[] args) {
        // Example usage:
        Student s = new Student("S001", "Alice");
        s.addGrade("Math", 'A');
        s.addGrade("Science", 'B');
        s.addGrade("English", 'C');
        s.displayStudentDetails();
        
        System.out.println("\n" + "=".repeat(30));
        
        Course mathCourse = new Course("MATH101", "Calculus I");
        mathCourse.enrollStudent(s);
        mathCourse.displayStudents();
    }
}




