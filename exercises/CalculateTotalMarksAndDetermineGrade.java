import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input marks for 5 subjects
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        // Calculate total
        int total = m1 + m2 + m3 + m4 + m5;

        // Display total
        System.out.println("Total Marks: " + total);

        // Determine grade
        if (total >= 450) {
            System.out.println("Grade: A");
        } 
        else if (total >= 400) {
            System.out.println("Grade: B");
        } 
        else if (total >= 350) {
            System.out.println("Grade: C");
        } 
        else if (total >= 300) {
            System.out.println("Grade: D");
        } 
        else {
            System.out.println("Grade: F");

        sc.close();
    

    }
    }  

}