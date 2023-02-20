package week5_Homework;

public class Task4_Triangle1 {

    //Main method
    public static void main(String[] args) {
        //i for rows and j for columns
        //row denotes the number of rows to be printed
        int i, j, rows=6; //declare local variables
        char c = '*'; //declare '*' as a character
        for(i=0; i<rows; i++) //outer loop for rows
        {
            for(j=0; j<=i; j++) //inner loop for columns
            {
                System.out.print(c); //prints *
            }
            System.out.println(); //skips to a new line
        }
    }
}

/* Alternative approach:
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        System.out.println("******");
 */