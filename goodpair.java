import java.util.Scanner;
public class goodpair {
    private static Scanner s;

    public static void main(String[] args) {
        s = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n= s.nextInt();
        int count=0;
        int a[]= new int [n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
           a[i]= s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]==a[j] && i<j)
            {
              count++;
            }
            else{
                System.out.println("0 ");
            }
        }
    }
    System.out.println(count);
    }
}
