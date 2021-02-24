import java.util.Scanner;

public class Divisibleby3and5{
    
    private static Scanner s;

    public static void main(String[] args) {
        
        System.out.println("Enter number");
        s = new Scanner (System.in);
        int x=s.nextInt();
        if(x%3==0 & x%5==0)
        {
            System.out.println("Divisible by 3");
        }
        else if(x%5==0)
        {
            System.out.println("Divisible by 5");
        }
        else if(x%3==0)
        {
            System.out.println("Divisible by both 3 and 5");
        }
        else
        {
            System.out.println("Not divisible by 3 or 5");
        }
    }
}
