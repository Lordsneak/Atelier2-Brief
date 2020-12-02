
public class BoucleIntroBoucle {

	public static void main(String[] args) {
		int i;
		for (i=1 ; i<11 ; i++) {
			System.out.println(i);
			if(i==10) { 
			break;	
			}
			for(int n=101 ; n>92 ; n--) {
				System.out.println(n-i);
				break;
			}
		}
	}

}
