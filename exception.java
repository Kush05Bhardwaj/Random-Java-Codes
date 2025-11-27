// public class sup {
//     public static void main(String[] args) {
//         try {
//             int[] arr = {1, 2, 3};
//             System.out.println(arr[4]);

//             try {
//                 int result = 10 / 0;
//                 System.out.println(result);
//             } catch (ArithmeticException e) {
//                 System.out.println("Inner Catch: Arithmetic Exception caught - " + e.getMessage());
//             }

//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Outer Catch: Array Index Out of Bounds Exception caught - " + e.getMessage());
//         }

//         System.out.println("Program continues after handling exceptions.");
//     }
// }

public class exception {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); 
            try {
                int result = 10 / 0; // This will throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}