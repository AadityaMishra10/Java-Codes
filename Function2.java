import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Function2 {
private static Scanner sc;

public static void main(String[] args) throws FileNotFoundException {
    File inputFile = new File("C:\\Users\\test.txt");
sc = new  Scanner(inputFile);
String line ="";
while (sc.hasNextLine()) {
line = sc.nextLine();
System.out.println(line);
}
}
}
