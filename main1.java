/*This program checks if the entered number is positive, negative, or zero, and further
checks whether it is even or odd using nested if-else statements.
*/

// import java.util.Scanner;

// public class main1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//     if (num > 0) {
//         System.out.println(num + " is a positive number.");
//         if (num%2 == 0) {
//             System.out.println(num + " is an even number.");
//         } else {
//             System.out.println(num + " is an odd number.");
//         }
//     }
//     else if (num < 0) {
//         System.out.println(num + " is a negative number.");
//         if (num%2 == 0) {
//             System.out.println(num + " is an even number.");
//         } else {
//             System.out.println(num + " is an odd number.");
//         }
//     } 
//     else {
//         System.out.println("The number is zero.");
//     }
// }
// }

/*A for-each loop automatically iterates through an array or collection without using an
index. A while loop continues until a condition becomes false and is used when loop
termination depends on external conditions.
*/

// public class main1 {
//     public static void main(String[] args) {
//         int[] num = {10, 20, 30, 40, 50};

//         System.out.println("Using for-each loop:");
//         for (int n : num) {
//             System.out.println(n);
//         }
//         System.out.println("Using while loop:");
//         int i = 0;
//         while (i < num.length) {
//             System.out.println(num[i]);
//             i++;
//         }
//     }
// }

/*The 'this' keyword in Java refers to the current object of a class. It helps differentiate
between instance variables and parameters when they have the same name.
*/

// class Main1 {
//     int id;
//     String name;

//     Main1(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }
//     void display() {
//         System.out.println("ID: " + id + ", Name: " + name);
//     }

//     public static void main(String[] args) {
//         Main1 E1 = new Main1(29, "Kushagra");
//         E1.display();
//     }
// }

/*Static blocks execute once when the class is loaded. Instance blocks execute every time
an object is created before the constructor. Constructors execute after instance blocks for
each object.
*/

// class main1 {
//     static {
//         System.err.println("Static block executed.");
//     }
//     {
//         System.out.println("Instance block executed.");
//     }
//     main1() {
//         System.err.println("Constructor executed.");
//     }

//     public static void main(String[] args) {
//         System.err.println("Main method started.");
//         new main1();
//         new main1();
//     }
// }

/*The static keyword is used to declare variables and methods that belong to the class
rather than any object. Static methods can access only static members directly.
*/

// class main1 {
//     static int count = 0; 
//     int id;
//     String name;

//     public main1(int id, String name) {
//         this.id = id;
//         this.name = name;
//         count++; 
//     }
//     static void displayCount() {
//         System.out.println("Total objects created: " + count);
//     }
    
//     public static void main(String[] args) {
//         main1 obj1 = new main1(1, "Alice");
//         main1 obj2 = new main1(2, "Bob");
//         main1 obj3 = new main1(3, "Charlie");

//         displayCount(); 
//     }
// }

/*The 'super' keyword is used to refer to the immediate parent class object. It is used to
access parent class variables, methods, and constructors.
*/

// class Animal {
//     String type = "Animal";
//     void displayType() {
//         System.out.println("Type: " + type);
//     }
// }
// class Dog extends Animal {
//     String type = "Dog";
//     void show() {
//         System.out.println("Child Type: " + type);
//         System.out.println("Parent Type: " + super.type); 
//     }
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.displayType();
//         d.show();
//     }
// }

/*The Scanner class in Java is used to take user input from the console using System.in.
*/

// import java.util.Scanner;

// public class main1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String name = sc.nextLine();
//         System.out.println("Hello, " + name + "!");
//     }
// }

/*The main() method is declared static so that it can be called by the JVM without creating
an object of the class.
*/

// public class main1 {
//     public static void main(String[] args) {
//         System.out.println("Main method executed.");
//     }
// }

/*This program demonstrates multilevel inheritance where the Dog class inherits from
Mammal, and Mammal inherits from Animal.
*/

// class Animal {
//     void eat() {
//         System.out.println("Animal is eating.");
//     }
// }

// class Mammal extends Animal {
//     void walk() {
//         System.out.println("Mammal is walking.");
//     }
// }

// class Dog extends Mammal {
//     void bark() {
//         System.out.println("Dog is barking.");
//     }
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat(); 
//         d.walk(); 
//         d.bark(); 
//     }
// }

/*This program counts how many times a specific character appears in a char[] array.
*/

// public class main1 {
//     public static void main(String[] args) {
//         char[] arr = {'a', 'b', 'c', 'a', 'd', 'a'};
//         char target = 'a';
//         int count = 0;
//         for (char c : arr) {
//             if (c == target) {
//                 count++;
//             }
//         System.err.println("Character '" + target + "' appears " + count + " times in the array.");
//         }
//     }
// }

/*Constructor overloading allows multiple constructors with different parameters. The this()
keyword can be used to call one constructor from another.
*/

// class Car {
//     String model, color;
//     int year;
    
//     Car() {
//         this("Unknown", "Unpainted", 0); 
//     }
//     Car(String model) {
//         this(model, "Unpainted", 0); 
//     }
//     Car(String model, String color, int year) {
//         this.model = model;
//         this.color = color;
//         this.year = year;
//     }
//     void display() {
//         System.out.println("Model: " + model + ", Color: " + color + ", Year: " + year);
//     }
//     public static void main(String[] args) {
//         Car car1 = new Car();
//         Car car2 = new Car("Toyota");
//         Car car3 = new Car("Honda", "Red", 2020);
        
//         car1.display();
//         car2.display();
//         car3.display();
//     }
// }

/*This program demonstrates method overloading by using different versions of
calculateArea() to find the area of a circle, rectangle, and triangle.
*/

// public class main1 {
//     static final double Pi = 3.14;
//     static double calculateArea(double radius) {
//         return Pi * radius * radius;
//     }
//     static int calculateArea(int length, int width) {
//         return length * width;
//     }
//     static double calculateArea(double base, double height) {
//         return 0.5 * base * height;
//     }
//     public static void main(String[] args) {
//         double circleArea = calculateArea(5.0);
//         int rectangleArea = calculateArea(4, 6);
//         double triangleArea = calculateArea(3.0, 4.0);

//         System.out.println("Area of Circle: " + circleArea);
//         System.out.println("Area of Rectangle: " + rectangleArea);
//         System.out.println("Area of Triangle: " + triangleArea);
//     }
// }

/*This program takes an array input from the user and counts how many elements are even
numbers
*/

// import java.util.Scanner;

// public class main1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements in the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter " + n + " integers:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int evenCount = 0;
//         for (int num : arr) {
//             if (num % 2 == 0) {
//                 evenCount++;
//             }
//         }
//         System.out.println("Number of even elements in the array: " + evenCount);
//     }
// }

/*This program defines a Book class with two constructors: a no-argument constructor and a
parameterized constructor, both demonstrating the use of the 'this' keyword.
*/

// class Book {
//     String title;
//     String author;  
//     String genre;

//     Book() {
//         this("Unknown Title", "Unknown Author", "Unknown Genre");
//         System.err.println("No-argument constructor called."); 
//     }
//     Book(String title, String author, String genre) {
//         this.title = title;
//         this.author = author;
//         this.genre = genre;
//         System.out.println("Parameterized constructor called.");
//     }

//     public static void main(String[] args) {
//         Book book1 = new Book();
//         Book book2 = new Book("1984", "George Orwell", "Dystopian");
//     }
// }

