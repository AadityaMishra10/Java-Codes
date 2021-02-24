import java.util.Scanner;
public class Closestnumber {
    private static Scanner sc;

    public static void main(String[] args) {
System.out.println("Enter the size of array \n");


sc = new Scanner(System.in);
int n = sc.nextInt();
int []arr = new int[n];

for(int i=0 ;i< n;i++)
{
arr[i] = sc.nextInt();
}

for(int i =0 ; i < n ; i++)
{
int max = 0 ;
for(int j = i+1; j < n ; j++)
{
if(arr[j] > arr[i])
{
max = arr[j];
break;
}
}
System.out.print(max);
}
}

}