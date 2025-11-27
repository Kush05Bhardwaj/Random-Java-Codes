// class Geeks {
//     static void m1() {
//         System.out.println("from m1");
//     }
//     // without static keyword you can not access that element and it will show error

//     static int a = 10;
//     static int b;
//     int c = 5;

//     static {
//         System.out.println("static block initialised ");
//         b = a * 4;
//     }

//     public static void main(String[] args) {
//         m1();
//         Geeks ac = new Geeks();
//         Geeks bc = new Geeks();
//         Geeks cc = new Geeks();
//         ac.a++;
//         bc.a++;
//         ac.c++; // Fixed missing semicolon
//         System.out.println("from main");
//         System.out.println("value of a: " + a);
//         System.out.println("value of b: " + b);
//         System.out.println("value of ac.c: " + ac.c); // Show value of c for ac
//         System.out.println("value of bc.c: " + bc.c); // Show value of c for bc
//         System.out.println("value of cc.c: " + cc.c); // Show value of c for cc
//     }
// }

// Create a program to demonstrate multiple inheritance using interfaces in Java.

// Define two interfaces Printable and Showable with methods print() and show().

// Create a class Document that implements both interfaces and provides definitions for the methods.

// In the main() method, create an object of Document and call both methods.

// interface Printable {
//     void print();
// }

// interface Showable {
//     void show();
// }

// class Document implements Printable, Showable {
//     public void print() {
//         System.out.println("Printing document...");
//     }

//     public void show() {
//         System.out.println("Showing document...");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Document doc = new Document();
//         doc.print();
//         doc.show();
//     }
// }

// 1. Create an interface PersonalDetails that includes:
// A method void getPersonalDetails();

// 2. Create another interface WorkDetails that includes:
// A method void getWorkDetails();

// 3. Create a class Employee that implements both interfaces.
// Implement the methods to print sample employee data:
// Name, Age, Address (for personal details)
// Employee ID, Department, Role (for work details)

// 4. In the main method of a Main class, create an object of Employee and call both methods.

// interface PersonalDetails {
//     void getPersonalDetails();
// }

// interface WorkDetails {
//     void getWorkDetails();
// }

// class Employee implements PersonalDetails, WorkDetails {
//     public void getPersonalDetails() {
//         System.out.println("Personal Details:");
//         System.out.println("Name: John Doe");
//         System.out.println("Age: 30");
//         System.out.println("Address: 123 Main St, Anytown, USA");
//     }

//     public void getWorkDetails() {
//         System.out.println("Work Details:");
//         System.out.println("Employee ID: E123");
//         System.out.println("Department: Sales");
//         System.out.println("Role: Sales Manager");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Employee emp = new Employee();
//         emp.getPersonalDetails();
//         emp.getWorkDetails();
//     }
// }

interface Engine {
    void start();
    void stop();
}

interface Entertainment {
    void playMusic();
    void stopMusic();
}

class Car implements Engine, Entertainment {
    public void start() {
        System.out.println("Car engine started.");
    }

    public void stop() {
        System.out.println("Car engine stopped.");
    }

    public void playMusic() {
        System.out.println("Playing music in the car.");
    }

    public void stopMusic() {
        System.out.println("Music stopped in the car.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.playMusic();
        myCar.stopMusic();
        myCar.stop();
    }
}