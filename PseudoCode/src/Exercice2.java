import java.util.Scanner;

public class Exercice2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Ex #2 (2 manières différents à faire) : 
1.	Lire vingt-cinq valeurs (entiers) 
2.	Calculer et Afficher La moyenne




 */		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int Moyenne;
		
		System.out.println("Entrez 25 valeurs entieres");
		for(int i = 0; i< 25; i++) {
			int s = sc.nextInt();
			 sum1 += s;

		}
		
	Moyenne = sum1/25;
	System.out.println("Voici la moyenne :" + Moyenne);
			
		
		
		
	}

}
