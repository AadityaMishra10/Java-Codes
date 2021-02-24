import java.util.Scanner;

//leap year and 3 and 5 divisible programm.
public class leapyear{
    private static Scanner s;

    public static void main(String[] args) {
        System.out.println("Enter Year");
        s = new Scanner(System.in);
        int x=s.nextInt();
        if(x%400==0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not leap year");
        }

    }
    
}