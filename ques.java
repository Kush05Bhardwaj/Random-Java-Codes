// class Calculater {
//     int add(int a, int b) {
//         return a + b;
//     }

//     double add(double a, double b) {
//         return a + b;
//     }

//     String add(String a, String b) {
//         return a + b;
//     }

//     static int multiply(int a, int b) {
//         return a * b;
//     }

//     final int subtract(int a, int b) {
//         return a - b;
//     }
// }

// public class ques {
//     public static void main(String[] args) {
//         Calculater calc = new Calculater();

//         System.out.println("Integer Addition: " + calc.add(5, 10));
//         System.out.println("Double Addition: " + calc.add(5.5, 10.2));
//         System.out.println("String Additio     n: " + calc.add("Hello, ", "World!"));

//         System.out.println("Multiplication: " + Calculater.multiply(4, 5));

//         System.out.println("Subtraction: " + calc.subtract(10, 4));
//     }
// }


class Vehicle {
    public void move() {
        System.out.println("The vehicle is moving.");
    }

    public final void startEngine() {
        System.out.println("The engine has started.");
    }

    public static void getVehicleType() {
        System.out.println("This is a generic vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car is driving on road.");
    }