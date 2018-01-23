import java.util.Arrays;
import java.util.Scanner;

public class ChallengePendu {
	
	
	public static void partie(String mot) {
		
		
		boolean vu[] = new boolean[mot.length()];
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez une lettre : ");
		
		char let = sc.nextLine().charAt(0);
		
		
		char[] mot1 = motVersTab(mot);

		
		
		metAJour(mot1, vu, let);
		
		
		
		affiche(mot1, vu);
		
		
		
		
	}
	
	
    static void affiche(char[] mot, boolean[] vu) {
        
        for (int i=0; i<=mot.length; i++) {
            if (vu[i]==true) {
                
                // affiche la lettre
                System.out.print(mot[i]);}
                
                // affiche "?"
                else {
                    System.out.print("?");}
        }
    }
	
	
	static char[] motVersTab(String s) {
		int i;
		int c = s.length();
		char [] tab = new char[c];
		
		for(i=0; i<s.length(); i++) {
			tab[i]= s.charAt(i);
		}
		System.out.println(Arrays.toString(tab));
		return tab;
	}

	
	public static void partie2(String mot) {
		
		int c = mot.length();
		
		Scanner sc = new Scanner(System.in);
		
		char let = sc.nextLine().charAt(0);
		
//		boolean verif []  = new boolean[mot.length()];
//		
//		
//		
//		for(int i = 0; i < c; i++) {
//			verif[i] = false;
//			
//			if(let==mot.charAt(i)) {
//				
//				verif[i] = true;
//				System.out.print(" " + mot.charAt(i));
//			}else {
//				verif[i] = false;
//				System.out.print(" " + "?");
//			}
//			 
//		}
		
		
	}

	
public static boolean[] metAJour(char[] mot, boolean[] vu, char c) {
        
        for (int i = 0; i < mot.length; i++) {
        	
            if (mot[i]== c ) {
                vu[i]= true;
            }
            else { 
            	vu[i] = false;
            	 }
        }
        return vu;

        }
        
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String m = "coucou";
//		partie(m);

		motVersTab(m);
	}

}
