import java.util.Scanner; 
public class Solution { 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); 
        
        int costOfOneDozen= sc.nextInt();
        int numberOfDozens = sc.nextInt();
        int discountPercent= sc .nextInt();

        int totalCost = costOfOneDozen * numberOfDozens;
        int discountAmount = (totalCost*discountPercent)/100;
        int finalAmount= totalCost-discountAmount;
        System.out.println(finalAmount);


        sc.close(); 
    } 
}