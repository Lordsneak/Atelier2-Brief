import java.util.Scanner;

public class Brief1 {

		
		
	public static void main(String[] args) {
		String nom; // variable de nom
		String prenom; // variable de prenom
		int hours; // variable de heure

		Scanner input = new Scanner(System.in); // Cree nouveau scanner pour insert input
		System.out.println("Bonjour, Press Entre Pour continue !"); // println pour affichage message
		
		System.out.println("Quel votre nom : ");
		nom = input.next(); // insert data via scanner variable
		System.out.println("Quel votre Prenom : ");
		prenom = input.next();
		System.out.println("Bienvenue " + nom + " "+ prenom );
		System.out.println("Entre le nombre Heure travail: ");
		hours = input.nextInt();
		
		if(hours < 40 ) { // utilisation condition
			System.out.println("Entre Le tarif par heure: ");
			int tarif = input.nextInt();
			double extratarif = hours*tarif;
			System.out.println(nom +" "+ prenom + " " + "votre indemnisation est " + extratarif + " MAD ");
		                 }
		
		else if (hours > 40 && hours <= 60 ) {
			System.out.println("Entre Le tarif par heure: ");
			int tarif2 = input.nextInt();//  
			int tarif3 = 40*tarif2;
			double extratarif2 = tarif3 + (tarif2 +  0.5*tarif2)*(hours-40);
			System.out.println(nom +" "+ prenom + " " + "votre indemnisation est " + extratarif2 + " MAD ");
		}
		else if(hours > 60) {
			System.out.println("informations erronés!");
		}
			
		
		input.close();
	}

}
