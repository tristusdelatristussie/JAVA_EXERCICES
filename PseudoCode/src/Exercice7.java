import java.util.Scanner;

public class Exercice7 extends Toto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * DÉBUT
 i = 1, A = 1
 LIRE i
 TANTQUE i =< 64 FAIRE
 LIRE A
 B <- A * 10^-7
 A <- A*2
 i <- i + 1
 FINTANTQUE
 ÉCRIRE Le consultant a pris
A grains de riz correspondant à
B tonnes."
FIN
		 */
		
		int i = 1;
		int a = 1;
		int b = 0;
		
		Scanner sc = new Scanner(System.in);
		
		i = sc.nextInt();
		while(i <=64) {
			a = sc.nextInt();
			b = a * 10^-7;
			a = a *2;
			i++;
			
			

		}
		
		System.out.println("Le consultant a pris en grains de riz " + a + " faisant en tonnes " + b);
		
		

	}

}
