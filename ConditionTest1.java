import java.util.Scanner;

public class ConditionTest1 {

private static Scanner s;

public static void main(String[] args) {

s = new Scanner(System.in);
System.out.println("Enter Status as availabe/not available");
String statusOfTicket = s.nextLine();
System.out.println("Enter a price of ticket");
int priceOfTicket = s.nextInt();
if(statusOfTicket.equals("available")) {
if(priceOfTicket>200) {
System.out.println("Will try next time");
}
else {
System.out.println("Hurry i am going to see movie");
}
}

if(statusOfTicket.equals("not available")){
System.out.println("ohh Ticket is not available");
}

}

}
//correct programm for ticket not available