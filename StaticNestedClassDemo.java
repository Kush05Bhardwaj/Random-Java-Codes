// // public class Test { 

// //     static int arr[] = {10, 2, 6, 7, 5, 3, 8, 9, 1, 4};
// //     static int sum(){
// //         int sum = 0;
// //         int i;

// //         for (i = 0; i < arr.length; i++) {
// //             sum += arr[i];
// //         }
// //         return sum; 
// //     }
// //     static int max() {
// //         int max = arr[0];
// //         for (int i = 1; i < arr.length; i++) {
// //             if (arr[i] > max) {
// //                 max = arr[i];
// //             }
// //         }
// //         return max;
// //     }

// //     static int min() {
// //         int min = arr[0];
// //         for (int i = 1; i < arr.length; i++) {
// //             if (arr[i] < min) {
// //                 min = arr[i];
// //             }
// //         }
// //         return min;
// //     }

// //     public static void main(String[] args) {
// //         System.out.println("The sum of the array elements is: " + sum());
// //         System.out.println("The maximum element in the array is: " + max());
// //         System.out.println("The minimum element in the array is: " + min());
// //     }
// // }

// class Constructor {
//     int id;
//     String name;

//     // 1. Default Constructor
//     Constructor() {
//         id = 0;
//         name = "Unknown";
//         System.out.println("Default Constructor called");
//     }

//     // 2. Parameterized Constructor
//     Constructor(int id, String name) {
//         this.id = id;
//         this.name = name;
//         System.out.println("Parameterized Constructor called");
//     }

//     // 3. Copy Constructor
//     Constructor(Constructor obj) {
//         this.id = obj.id;
//         this.name = obj.name;
//         System.out.println("Copy Constructor called");
//     }

//     void display() {
//         System.out.println("ID: " + id + ", Name: " + name);
//     }

//     public static void main(String[] args) {
//         // Using Default Constructor
//         Constructor c1 = new Constructor();
//         c1.display();

//         // Using Parameterized Constructor
//         Constructor c2 = new Constructor(101, "Kushagra");
//         c2.display();

//         // Using Copy Constructor
//         Constructor c3 = new Constructor(c2);
//         c3.display();
//     }
// }

// Java program to demonstrate accessing
// a static nested class

// outer class
class OuterClass {
    // static member
    static int outer_x = 10;

    // instance(non-static) member
    int outer_y = 20;

    // private member
    private static int outer_private = 30;

    // static nested class
    static class StaticNestedClass {
        void display()
        {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);

            // can access private static member of
            // outer class
            System.out.println("outer_private = "
                               + outer_private);

            // The following statement will give compilation
            // error as static nested class cannot directly
            // access non-static members
            // System.out.println("outer_y = " + outer_y);
          
              // Therefore create object of the outer class 
              // to access the non-static member
              OuterClass out = new OuterClass();
              System.out.println("outer_y = " + out.outer_y);
          
          
        }
    }
}

// Driver class
public class StaticNestedClassDemo {
    public static void main(String[] args)
    {
        // accessing a static nested class
        OuterClass.StaticNestedClass nestedObject
            = new OuterClass.StaticNestedClass();

        nestedObject.display();
    }
}