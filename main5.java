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

// public class main5 {
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

// import java.util.LinkedList;

// public class main5 {

//     public static void main(String[] args){
        
//         LinkedList<String> l = new LinkedList<String>();

//         l.add("One");
//         l.add("Two");
//         l.add("Three");
//         l.add("Four");
//         l.add("Five");
//         l.add("Geeks");
//         l.add("Geeks");
//         l.add(1, "For");

//         System.out.println("Initial LinkedList " + l);

//         l.set(3, "third");

//         l.contains("Geeks");
//         System.out.println("The List contains 'Two' "
//                            + l.contains("Geeks"));

//         System.out.println("Initial LinkedList " + l);

//         l.remove(6);

//         System.out.println("After the Index Removal " + l);

//         l.remove("Geeks");

//         System.out.println("After the Object Removal "
//                            + l);

        


//         for (String str : l) 
//             System.out.print(str + " "); 
//     }
// }


// import java.util.*;

// class main5{
//     public static void main(String[] args) 
//     {
//         HashSet<Object> hs = new HashSet<>();

//         hs.add(1);
//         hs.add(2);
//         hs.add(1);
//         hs.add("Geek");
//         hs.add("For");
//         hs.add("Geeks");
//         hs.add("A");
//         hs.add("B");
//         hs.add("Z");

//         System.out.println("HashSet : " + hs);

//         hs.contains("Geeks");
//         System.out.println("The List contains 'Two' "
//                            + hs.contains("Geeks"));

//         hs.remove("Geeks");

//         System.out.println("HashSet after removing element : " + hs);

//         System.out.println("B exists in Set : " + hs.remove("B"));


//         System.out.print("Using iterator : ");
//         Iterator<Object> iterator = hs.iterator();
//         while (iterator.hasNext()) {
//             System.out.print(iterator.next() + " , ");
//         }

//         System.out.print("Using enhanced for loop : ");
//         for (Object element : hs)
//             System.out.print(element + " , ");
//     }
// }

import java.util.PriorityQueue;
import java.util.Queue;

public class main5 {

    public static void main(String[] args){
        
        Queue<Integer> pq = new PriorityQueue<>();
        
        pq.add(50);
        pq.add(20);
        pq.add(40);
        pq.add(10);
        pq.add(30);

        System.out.println("Initial Queue: " + pq);

        System.out.println("Peek: " + pq.peek());
        System.out.println("Contains 20: " + pq.contains(20));
        System.out.println("Is Empty: " + pq.isEmpty());

        System.out.println("Poll Method: " + pq.poll());

        System.out.println("Final Queue: " + pq);

        System.out.println("Head using peek(): " + pq.peek());      
        System.out.println("Head using element(): " + pq.element()); 
        
        System.out.println("Queue after accessing head: " + pq);
    }
}
