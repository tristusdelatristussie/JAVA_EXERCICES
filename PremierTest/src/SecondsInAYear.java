import java.util.Scanner;

public class SecondsInAYear {
	
	static Scanner bisextile = new Scanner(System.in);
	static int anneeB = 366;
	static int anneeN = 365;
	static String rep;
	
	
	public static int seconds() {
		System.out.println("Est on dans une annee bisextile ? ");
		rep = bisextile.nextLine();
		if( rep.contains("oui")) {
			return anneeB*24*60*60;
		}else if( rep.contains("non")) {
			return anneeN*24*60*60;
		}else{
			seconds();
		}
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res = seconds();
		System.out.println("Vous avez " + res + " secondes dans votre annee");
		
		
	}

}
