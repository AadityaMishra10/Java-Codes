import java.util.Scanner;
public class greatestnumelsezero{
    private static Scanner sc;

    public static void main(String[] args) {
sc = new Scanner(System.in);
System.out.println("Enter the size of array");
int n = sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the array");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{

int max = a[i];
for(int j=i+1;j<n;j++)
{
if(a[j] > max )
{
max = a[j];
}

}
if(max != a[i])
{
System.out.print(max+" ");
}
else
{
System.out.print
("0 ");
}

}


}
}
