import java.util.ArrayList;
import java.util.Scanner;

public class ExoArray {

	
	
	/*
	 * 
	 * Ex.1
En utilisant la classe ArrayList, cr�ez un programme qui:
1. re�oit 20 valeurs num�riques r�elles de l'utilisateur.
2. calcule le nombre de valeurs qui sont sup�rieures � la moyenne.

	 */
	
	
	
	public class exo1 {
		
		ArrayList<Integer> val = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		public void adding20() {
			
			val.add(sc.nextInt());
			
		}

		
		public void nbresupetinf() {
			
			int min = 0;
			int max = 0;
			int moy = 0;
			int som = 0;
			
			
			for(int i = 0; i < val.size(); i ++) {
				if (val.get(i) == 0) {
					min = val.get(0);
					max = val.get(0);
				}
				else if(val.get(i)<min) {
					min = val.get(i);
				}else if(val.get(i)>max) {
					max = val.get(i);
				}
				
			for(int j = 0; i < val.size(); j++) {
				som += val.get(j);
				moy = som/val.size();
			}
				
			System.out.println("Nbre sup " + max + "Nbre inf " + min + " Moyenne " + moy);
				
				}
			
		}
		
		public void moyenne() {
			
		}
		
	}
	
	
	
	
	
	/*
	 * Ex.2

Ecrire un programme ou l�utilisateur va donner  10 mots et sauvegarder les mots dans une ArrayList.
�         D'abord afficher tous les mots.
�         Puis affichez-les dans l'ordre inverse.
Ecrire une m�thode inverseWord qui inverse l'ordre des �l�ments dans une ArrayList de String.
�         Puis affichez-les avec tous les pluriels (se terminant par "s") en majuscule.
Ecrire une m�thode capitalizePlurals qui accepte une ArrayList de String et remplace chaque mot qui se termine par un "s" avec sa version en majuscule.
 

	 */
	
	
	
	public class exo2 {
		
		
		ArrayList<String> mots = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
			mots.add(sc.next());
			System.out.println(mots.get(i) + " ");
			System.out.println(mots.get(10-i) +" ");
			
		
	}
		
		public ArrayList<String> inverseWord() {
			
			ArrayList<String> motsInver = new ArrayList();
			
			for(int i = 0 ; i < mots.size(); i++) {
				motsInver.add(i, mots.get(mots.size()-i));
				System.out.println(" Voici les mots inverses : " + motsInver.get(i) );
			
			}
			
		}
		
		public void pluriel() {
			
			ArrayList<String >pluriels = new ArrayList();
			String str = "s";
			for(int i = 0 ; i < mots.size(); i++) {
				
				pluriels.add(i, mots.get(i).concat(str));
				System.out.println(pluriels.get(i));
			
			}
			
			
		}
	
	}
	
	/*
	 * Ecrire un programme ou l�utilisateur va donner  10 chiffres et affiche tous les num�ros sous forme de liste (sauvegarder dans une ArrayList), puis:
�         Imprime la moyenne des nombres.
�         Imprime le nombre le plus �lev� et le plus bas.
�         Filtre tous les nombres pairs (divisibles par 2).
	 */
	
	public class Exo3 {
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}