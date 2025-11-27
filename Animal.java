// class New {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 40;
//         int c = a + b;
//         System.out.printf("the sum of %d and %d is %d \n", a, b, c);

//         int num = 255;
//         System.out.printf("decimal :%d %n", num);
//         System.out.printf("octal : %o %n", num);
//         System.out.printf("hexadecimal  :  %x %n", num);
//         System.out.printf("binary: %b %n", num);

//         System.out.printf("binary (string): %s %n", Integer.toBinaryString(num));

//         System.out.println("\u2665");
//         System.out.println("\u263A");
//         System.out.println("\u03C0");
//         System.out.println("\uD83D\uDE00"); 
//     }
// }

// public class Person {
//     String name;
//     int age;

//     // Constructor 1: Default constructor (no parameters)
//     public Person() {
//         this.name = "Unknown";
//         this.age = 0;
//         System.out.println("Person created with default values.");
//     }

//     // Constructor 2: Constructor with name parameter
//     public Person(String name) {
//         this();
//         this.name = name;
//         System.out.println("Person created with name: " + this.name);
//     }

//     // Constructor 3: Constructor with name and age parameters
//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//         System.out.println("Person created with name: " + this.name + " and age: " + this.age);
//     }

//     public void displayInfo() {
//         System.out.println("Name: " + name + ", Age: " + age);
//     }

//     public static void main(String[] args) {
//         Person person1 = new Person();
//         Person person2 = new Person("Alice");
//         Person person3 = new Person("Bob", 30);

//         System.out.println("\nDisplaying Person Information:");
//         person1.displayInfo();
//         person2.displayInfo();
//         person3.displayInfo();
//     }
// }

class Animal {
    String species;
    int age;

    // No-argument constructor
    public Animal() {
        System.out.println("Animal created (default)");
    }

    // Constructor with species
    public Animal(String species) {
        this.species = species;
        System.out.println("Animal created: " + species);
    }

    // Constructor with species and age
    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
        System.out.println("Animal created: " + species + ", " + age + " years old");
    }
}

class Dog extends Animal {
    String breed;

    // Constructor for Dog calling a specific Animal constructor
    public Dog(String species, int age, String breed) {
        super(species, age); // Calls the Animal(String, int) constructor
        this.breed = breed;
        System.out.println("Dog created: " + breed);
    }

    // Another constructor for Dog, calling a different Animal constructor
    public Dog(String breed) {
        super("Canine"); // Calls the Animal(String) constructor
        this.breed = breed;
        System.out.println("Dog created with breed: " + breed);
    }
}   