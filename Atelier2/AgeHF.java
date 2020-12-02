import java.util.Scanner;

public class AgeHF {

	public static void main(String[] args) {
		String genre;
		String homme = null , femme = null;
		int age;
		
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Age :");
		age = input.nextInt();
		System.out.println("homme / femme");
		genre = input.next();
		
		if(age < 18 || genre == homme) {
			System.out.println("Vous eter homme et  mineur ");
		}else if (age >= 18 || genre == homme) {
			System.out.println("Vous eter homme et  majeur");
		}else if (age < 18 || genre == femme) {
			System.out.println("Vous eter femme et  mineur ");
		}else if (age >= 18 || genre == femme) {
			System.out.println("Vous eter femme et  majeur ");
		}

		
		

	}

}
