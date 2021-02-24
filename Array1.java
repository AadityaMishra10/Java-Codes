import java.util.Scanner;
public class Array1 {
    private static Scanner s;

    public static void main(String[] args) {
        s = new Scanner(System.in);
        System.out.println("Enter number of element");
        int n=s.nextInt();
        int a[]= new int [n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]==1)
            {
                c++;
            }
            else
            {
                System.out.println(0);
            }
        }
        System.out.println(c);

    }
}
//Number of 1 in consecutive row.

