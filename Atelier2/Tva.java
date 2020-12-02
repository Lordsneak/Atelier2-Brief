import java.util.Scanner;

public class Tva {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez le prix hors taxes :");
		int pht = input.nextInt();
		System.out.println("Entrez le nombre d’articles :");
		int nb = input.nextInt();
		System.out.println("Entrez le taux de TVA :");
		int ttva = input.nextInt();
		int pttc = nb * pht * (1 + ttva);
		System.out.println("Le prix toutes taxes est : " + "" + pttc);
	}
	

}
