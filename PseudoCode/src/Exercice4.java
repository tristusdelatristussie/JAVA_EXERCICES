import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ex #4  : 
1.	Lire la distance (en Km) qui a �t� parcourue une voiture
2.	Lire les litres de gaz consomm�s pour la distance
3.	Calculer et Afficher la consommation moyenne L / 100 Km (litres
pour 100 kilom�tres).

		 */
		
		
		Scanner sc = new Scanner(System.in);

		int d = 0;
		int v = 0;
		int res;
		
		d = sc.nextInt();
		v = sc.nextInt();
		
		res = 100*(v/d);
		System.out.println("Voici le res : " + res);
		
		
		
		

		
	}

}
