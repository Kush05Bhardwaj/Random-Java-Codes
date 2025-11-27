import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringSortingArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();
        
        // Input strings
        System.out.println("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            stringList.add(str);
        }
        
        // Display original list
        System.out.println("\nOriginal List:");
        System.out.println(stringList);
        
        // Sort in ascending order
        Collections.sort(stringList);
        System.out.println("\nSorted in Ascending Order:");
        System.out.println(stringList);
        
        // Sort in descending order
        Collections.sort(stringList, Collections.reverseOrder());
        System.out.println("\nSorted in Descending Order:");
        System.out.println(stringList);
        
        scanner.close();
    }
}
