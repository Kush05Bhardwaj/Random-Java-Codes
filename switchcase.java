// class A {
//     int i = 10;
//     {
//         System.out.println("The value of i in a - " + i);
//     }
//     public void display(){
//         System.out.println("Class A");
//     }
//     public A() {
//         System.out.println("Constructor of A");
//     }
//     static {
//         System.out.println("Static block in A");
//     }
//     {
//         System.out.println("Instance block in A");
//     }
// }

// class B extends A {
//     int i = 20;
//     {
//         System.out.println("The value of i in b - " + i);
//     }
//     public void display(){
//         System.out.println("Class B");
//     }
//     public B() {
//         System.out.println("Constructor of B");
//     }
//     static {
//         System.out.println("Static block in B");
//     }
//     {
//         System.out.println("Instance block in B");
//     }
// }

// class C extends B {
//     int i = 30;
//     {
//         System.out.println("The value of i in c - " + i);
//     }
//     public void display(){
//         System.out.println("Class C");
//     }
//     public C() {
//         System.out.println("Constructor of C");
//     }
//     static {
//         System.out.println("Static block in C");
//     }
//     {
//         System.out.println("Instance block in C");
//     }
// }


// public class gc {
//     static {
//         System.out.println("Static block in main class");
//     }
//     public static void main(String[] args) {
//         C obj = new C();
//         obj.display();
        
//     }
// }

public class switchcase {
    public static void main(String[] args) {
        int k;
        for (k = 1; k < 6; k++) {
            System.out.println("k: " + k);
        }
        switch (k) {
            case 1:
                System.out.println(k);
                
            case 2:
                System.out.println(k);
                
            case 3:
                System.out.println(k);
                
            case 4:
                System.out.println(k);
                
            case 5:
                System.out.println(k);
                
            default:
                System.out.println("default");
        }
        //     case 1:
        //         System.out.println(k);
        //         break;
        //     case 2:
        //         System.out.println(k);
        //         break;
        //     case 3:
        //         System.out.println(k);
        //         break;
        //     case 4:
        //         System.out.println(k);
        //         break;
        //     case 5:
        //         System.out.println(k);
        //         break;
        //     default:
        //         System.out.println("default");
        // }
    //         case 1:
    //             System.out.println(k);
                
    //         case 2:
    //             System.out.println(k);
    //             continue;
    //         case 3:
    //             System.out.println(k);
                
    //         case 4:
    //             System.out.println(k);
    //             break;
    //         case 5:
    //             System.out.println(k);
                
    //         default:
    //             System.out.println("default");
    //     }
    // }
}
}