import java.util.Scanner;

public class Bonjour {
	public static void main (String[] args) {
	Scanner s1 = new Scanner(System.in);
	
	System.out.println("Quel est votre prénom ?");
	String x = s1.next();
	
	System.out.println("Bonjour," + " " + x);
	}
}
