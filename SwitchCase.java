import java.util.Scanner;
public class SwitchCase {
    
    private static Scanner s;

    public static void main(String[] args) {
        s = new Scanner (System.in);
            System.out.println("please enter a/b/c/d");
            char ch = s.next().charAt(0);
            
            switch(ch) {
            case 'a': System.out.println(ch);break;
            case 'b': System.out.println(ch);break;
            case 'c': System.out.println(ch);break;
            case 'd': System.out.println(ch);break;
            default : System.out.println("please enter a/b/c/d");
            }
            
            
    }
}
