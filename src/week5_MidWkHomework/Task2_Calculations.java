package week5_MidWkHomework;

public class Task2_Calculations {
    public static void main(String[] args) { //Main Method
        double ans = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)); //declare variables
        System.out.println("Expected Output: " ); //printing the specified text
        System.out.println(String.format("%.15f", ans)); //setting the precision to 15 decimal places
    }
}