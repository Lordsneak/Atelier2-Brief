import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		String nom;
		String prenom;
		int age;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Nom :");
		nom = input.next();
		System.out.println("Enter Prenom :");
		prenom = input.next();
		System.out.println("Enter Age :");
		age = input.nextInt();
		System.out.println("Bonjour" + " " + nom + " " +prenom + " " +",tu as"+ " " + age +" "+ "ans");
		
		

	}

}
