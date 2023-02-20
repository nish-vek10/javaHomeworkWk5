package week5_MidWkHomework;

public class Task4_Marksheets {
    //Main method
    public static void main(String[] args) {
        tenth(); //call method
        twelfth(); //call method
    }

    //declare static method
    static void tenth() {
        //declare all local variables
        int maths = 93, eng = 85 ,fre = 89, bio = 73, phy = 87, chem = 90, it = 97, geo = 86, his = 75;
        char c = '%';

        //print out the marks
        System.out.println("MARKS FOR MY 10th STANDARD:");
        System.out.print("Mathematics > " + maths + c + "; ");
        System.out.print("English > " + eng + c + "; ");
        System.out.print("French > " + fre + c + "; ");
        System.out.println(""); //skips to a new line
        System.out.print("Biology > " + bio + c + "; ");
        System.out.print("Physics > " + phy + c + "; ");
        System.out.print("Chemistry > " + chem + c + "; ");
        System.out.println(""); //skips to a new line
        System.out.print("Information Technology (IT) > " + it + c + "; ");
        System.out.print("Geography > " + geo + c + "; ");
        System.out.print("History > " + his + c + "; ");
        System.out.println("\n"); //skips an extra line
    }

    //declare static method
    static void twelfth() {
        //declare all variables
        int maths = 85, chem = 82, phy = 81;
        char c = '%';

        //print out the marks
        System.out.println("MARKS FOR MY 12th STANDARD:");
        System.out.print("Mathematics > " + maths + c + "; ");
        System.out.print("Chemistry > " + chem + c + "; ");
        System.out.print("Physics > " + phy + c + "; ");
    }
}
