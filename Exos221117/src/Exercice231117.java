import java.util.Scanner;

public class Exercice231117 {

	
	public static int[] rempTab(int n) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le nombre d entiers");
		int nbre = sc.nextInt();
		int tab [] = new int[nbre];
		for(int i=0; i <nbre; i++) {
			System.out.println("Entrez un entier :");
			tab[i] = sc.nextInt();
			System.out.println("Un entier " +tab);
		}
		
		return tab;
		
		
	}
	
	
	public class TabEntiers{
	
		
		
	

	}
	
	
	
	
	static public void lectTab(int a) {
		int res;

		for(int i=0; i < a; i++) {
			System.out.println( tab[i]);
			
		}
		
	}
	
	public static int maxValue( int [] tab) {
		
		int max = tab[0];
		
		for( int i = 0; i < tab.length; i++) {
			
			if(tab[i] > max) {
				
				max = tab[i];
			}
			
		}
		return max;
		
	}
	
	
	public static int minValue(int [] tab) {
		
		int min = tab[0];
		
		for( int i = 0; i < tab.length; i++) {
			
			if(tab[i] < min) {
				
				min = tab[i];
			}
			
		}
		return min;
		
	}
	
	
	static boolean identique1(int [] tab) {
		
		
		int min = minValue(tab);
		int max = maxValue(tab);
		if(min==max) {
			return true;
		}else {
		return false;
		}
	}
	
	
	
	static boolean identique2(int [] tab) {
		
		int a = tab[0];
		
		for(int i = 1; i < tab.length; i++) {
			
			if( ! (a == tab[i])) {
				return false;
			}
			
		}
		return true;
		
		
	}
	
	
	
	public static int compare(int tab [], int e) {
		
		int c = 0;
		for(int i = 0; i < tab.length; i ++) {
			
			if(e == tab[i]) {
				c++;
			}
		}
		
		return c;
		
	}
	
	
	
	
	public static boolean unique(int tab[]) {
		
		return identique1(tab);
		
	}
	
	static int tab0[] = {8,2,8,4,8,2};

	
	public static boolean croissant(int tab[]) {
	
		
		
		for(int i= 0 ; i < tab.length; i ++) {
		
			if(tab[i]>tab[i+1]&& i+1 < tab.length) {
				System.out.println(tab[i]);

				return false;
			}
		}

		return true;
		
	}
	
	
	
	public static void tri(int tab []) {
		
		int var;
		 
		for(int j = 0; j< tab.length; j++) {
		
		
		for(int i = 0; i < tab.length; i ++) {
			
			if(tab[i]<tab[i+1]) {
				
				var = tab[i];
				tab[i] = tab[i+1];
				tab[i+1] = var;
				break;
			}
			
			

		}
		System.out.print(tab[j]);
}
		
	}
	
	
	
	
public static void tri2(int tab []) {
		
		int var;
		int u=0;
		int longueur = tab.length;
		for(int j=0; j < longueur-u-1; j++) {
		
		
		for(int i = 0; i < tab.length; i ++) {
			
			if(tab[i]>tab[i+1]) {
				
				var = tab[i];
				tab[i]=tab[i+1];
				tab[i+1]=tab[i];
				u++;
			}
			
			

		}
		System.out.print(tab[j]);
}
		
	}
	
	
	
	
	public static String word = "lololololo";

	
	public static void word() {
		
	}
	
	public static boolean mot(String mot) {
		
//		if(mot.length()%2==0) {
		
		for(int i = 0; i < mot.length()/2; i++) {
			
			int fin = mot.length()/2;
			
			--fin;
			

			if(mot.charAt(i) == mot.charAt(fin)) {
				System.out.println("C est la meme lettre ");
				break;

		}else {
			System.out.println("Ce n est pas la meme lettre");
			return false;


			
		}
			
		}
//		}
		System.out.println("vrai");
		return true;
		
	}
	
	
	
	public static void main(String[] args) {
		
//		mot(word);
		tri2(tab0);		
		System.out.println();
		// TODO Auto-generated method stub

	}
}
