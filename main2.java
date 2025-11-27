// class InvalidAgeException extends Exception {
//     public InvalidAgeException(String m) {
//         super(m);  
//     }
// }

// public class main2 {
//     public static void validate(int age) 
//       throws InvalidAgeException {
//         if (age < 18) {
//             throw new InvalidAgeException("Age must be 18 or above.");
//         }
//         System.out.println("Valid age: " + age);
//     }

//     public static void main(String[] args) {
//         try {
//             validate(12);
//         } catch (InvalidAgeException e) {
//             System.out.println("Caught Exception: " + e.getMessage());
//         }
//     }
// }

// class DivideByZeroException extends RuntimeException {
//     public DivideByZeroException(String m) {
//         super(m);
//     } 
// }

// public class main2 {
//     public static void divide(int a, int b) {
//         if (b == 0) {
//             throw new DivideByZeroException("Division by zero is not allowed.");
//         }
//         System.out.println("Result: " + (a / b));
//     }

//     public static void main(String[] args) {
//         try {
//             divide(10, 0);
//         } catch (DivideByZeroException e) {
//             System.out.println("Caught Exception: " + e.getMessage());
//         }
//     }
// }

// class main2 {
//     static void fun() throws IllegalAccessException {
//         System.out.println("main2.fun()");
//         throw new IllegalAccessException("demo");
//     }
//     public static void main(String args[]) {
//         try {
//             fun();
//         } catch (IllegalAccessException e) {
//             System.out.println("Caught " + e);
//         }
//     }
// }

// class CookingTask extends Thread {
//     private String task;

//     CookingTask(String task) {
//         this.task = task;
//     }

//     public void run() {
//         System.out.println(task + " is being prepared by " +
//             Thread.currentThread().getName());
//     }
// }

// public class main2 {
//     public static void main(String[] args) {
//         Thread t1 = new CookingTask("Pasta");
//         Thread t2 = new CookingTask("Salad");
//         Thread t3 = new CookingTask("Dessert");
//         Thread t4 = new CookingTask("Rice");

//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();
//     }
// }


// 1. Print Numbers Using Two Threads

// Problem:
// Create two threads:

// Thread 1 prints even numbers from 1 to 10

// Thread 2 prints odd numbers from 1 to 10

// make 2 threads even or odd
// Hint: Use Thread class or implement Runnable.

// class EvenThread extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             if (i % 2 == 0) {
//                 System.out.println("Even Thread: " + i);
//             }
//         }
//     }
// }

// class OddThread extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             if (i % 2 != 0) {
//                 System.out.println("Odd Thread: " + i);
//             }
//         }
//     }
// }

// public class main2 {
//     public static void main(String[] args) {
//         EvenThread even = new EvenThread();
//         OddThread odd = new OddThread();

//         even.start();
//         odd.start();
//     }
// }

// public class main2 {

//     static class EvenThread extends Thread {
//         public void run() {
//             for (int i = 1; i <= 5; i++) {
//                 System.out.println(Thread.currentThread().getName() + " - printing name " + i);
//             }

//             for (int i = 1; i <= 10; i++) {
//                 if (i % 2 == 0) {
//                     System.out.println(Thread.currentThread().getName() + " - Even Number: " + i);
//                 }
//             }
//         }
//     }

//     static class OddThread extends Thread {
//         public void run() {
//             for (int i = 1; i <= 5; i++) {
//                 System.out.println(Thread.currentThread().getName() + " - printing name " + i);
//             }

//             for (int i = 1; i <= 10; i++) {
//                 if (i % 2 != 0) {
//                     System.out.println(Thread.currentThread().getName() + " - Odd Number: " + i);
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         EvenThread even = new EvenThread();
//         OddThread odd = new OddThread();

//         even.setName("EvenThread");
//         odd.setName("OddThread");

//         even.start();
//         odd.start();
//     }
// }


// process = A program under running condition
// Multithreading from GFGs

class EvenThread extends Thread {
    public void run() {

        for (int i = 2; i <= 10; i+=2) {
            System.out.println("Even: " + i + " " + Thread.currentThread().getName() + " with priority "
            + Thread.currentThread().getPriority());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("Odd: " + i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class main2 {
    public static void main(String[] args) {
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();
        t1.setName("EvenThread");
        t2.setName("OddThread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}




