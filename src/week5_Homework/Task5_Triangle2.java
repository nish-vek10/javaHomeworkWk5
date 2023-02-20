package week5_Homework;

public class Task5_Triangle2 {

    //Main method
    public static void main(String[] args) {
        //i for rows and j for columns
        //row denotes the number of rows to be printed
        int i, j, row = 6; //declare local variables
        for (i=0; i<row; i++) //outer loop for rows
        {
            for (j=row-i; j>1; j--) //inner loop work for space
            {
                System.out.print(" "); //prints space for centre alignment
            }
            for (j=0; j<=i; j++) //inner loop for columns
            {
                System.out.print("* "); //prints the star '*'
            }
            System.out.println(); //skips to a new line
        }
    }
}


/* Alternative approach:
        System.out.println("     *     ");
        System.out.println("    * *    ");
        System.out.println("   * * *   ");
        System.out.println("  * * * *  ");
        System.out.println(" * * * * * ");
        System.out.println("* * * * * *");
 */
