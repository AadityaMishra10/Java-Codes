import java.util.Scanner;
public class function1 {
    private static Scanner sc;

    public static void main(String[] args) {
    sc = new Scanner (System.in);
       System.out.println("Enter temperature in celsius");
        int C=sc.nextInt();
        float F;
        F=((9*C)/5)+32;
        System.out.println(" "+ F);
        

    }
}
