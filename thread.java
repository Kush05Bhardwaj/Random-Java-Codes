// // Java program to demonstrate thread states 
// // using a ticket booking scenario
// class TicketBooking implements Runnable {
//     @Override
//     public void run() {
        
//         try {
            
//             // Timed waiting
//             Thread.sleep(200); 
//         } catch (InterruptedException e) {
//             System.err.println(e);
//         }

//         System.out.println("State of bookingThread while mainThread is waiting: " +
//                 TicketSystem.mainThread.getState());

//         try {
            
//             // Another timed waiting
//             Thread.sleep(100); 
//         } catch (InterruptedException e) {
//             System.err.println(e);
//         }
//     }
// }

// class TicketSystem implements Runnable {
//     public static Thread mainThread;

//     @Override
//     public void run() {
//         TicketBooking booking = new TicketBooking();
//         Thread bookingThread = new Thread(booking);

//         System.out.println("State after creating bookingThread: " + bookingThread.getState());

//         bookingThread.start();
//         System.out.println("State after starting bookingThread: " + bookingThread.getState());

//         try {
//             Thread.sleep(100);
//         } catch (InterruptedException e) {
//             System.err.println(e);
//         }

//         System.out.println("State after sleeping bookingThread: " + bookingThread.getState());

//         try {
            
//             // Moves mainThread to waiting state
//             bookingThread.join(); 
//         } catch (InterruptedException e) {
//             System.err.println(e);
//         }

//         System.out.println("State after bookingThread finishes: " + bookingThread.getState());
//     }
// }

// public class thread {
//     public static TicketSystem ticketSystem;

//     public static void main(String[] args) {
//         ticketSystem = new TicketSystem();
//         TicketSystem.mainThread = new Thread(ticketSystem);

//         System.out.println("State after creating mainThread: " + TicketSystem.mainThread.getState());

//         TicketSystem.mainThread.start();
//         System.out.println("State after starting mainThread: " + TicketSystem.mainThread.getState());
//     }
// }

import java.util.*;  
public class thread {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        
        // Add elements
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        list.add("Go");

        System.out.println("Initial Programming Languages:");
        for (String lang : list) {
            System.out.println(lang);
        }
        System.out.println("Initial size: " + list.size());
        System.out.println();

        // Access elements
        System.out.println("Accessing element at index 1: " + list.get(1));
        System.out.println();

        // Remove elements
        System.out.println("Removing 'C++' from the list...");
        list.remove("C++");
        System.out.println("After removal:");
        for (String lang : list) {
            System.out.println(lang);
        }
        System.out.println("Size after removal: " + list.size());
        System.out.println();

        // Modify elements
        System.out.println("Modifying element at index 2 to 'Kotlin'...");
        list.set(2, "Kotlin");
        System.out.println("After modification:");
        for (String lang : list) {
            System.out.println(lang);
        }
        System.out.println();

        // Sorting elements
        System.out.println("Sorting the list alphabetically...");
        Collections.sort(list);
        System.out.println("After sorting:");
        for (String lang : list) {
            System.out.println(lang);
        }
        System.out.println();

        // Contain elements
        System.out.println("Checking if list contains 'Java': " + list.contains("Java"));
        System.out.println("Checking if list contains 'C++': " + list.contains("C++"));
        System.out.println("Checking if list contains 'Ruby': " + list.contains("Ruby"));
        System.out.println();

        // Get elements
        System.out.println("Getting elements at different indices:");
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Last element (index " + (list.size()-1) + "): " + list.get(list.size()-1));
        System.out.println();

        // Size check
        System.out.println("Final size of the list: " + list.size());
    }
}