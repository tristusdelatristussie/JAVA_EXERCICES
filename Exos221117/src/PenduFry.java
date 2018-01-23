import java.util.*;

public class day05_challenge {
    
    static void partie(String mot) {    

       boolean vu[] = new boolean[mot.length()];
       Scanner sc = new Scanner(System.in);
       char[] mot1 = motVersTab(mot);

       while(partieFinie(vu)==false) {
           System.out.println("Entrez une lettre : ");
           char let = sc.nextLine().charAt(0);

           metAJour(mot1, vu, let);
           affiche(mot1, vu);
            partieFinie(vu);
            
            // System.out.println(Arrays.toString(mot1));
       }
       
       System.out.print("Vide la bouteille !");
   }
    
    
    // Fonction compare de Erwan
    
    /*
    static void question4() {
    	
    	int in1;
    	int in2;
    	int[] tob = new int[8];
    	
    	do {
    	System.out.println("saisir 2 indices entre 0 et 7");
    	Scanner sc = new Scanner(System.in);
    	in1 = sc.nextInt();
    	sc.nextLine();
    	in2 = sc.nextInt();
    	
    	}while(in1 > 7 || in2 >7);
    	
    	if(in1<in2) {
    		for(int i=0;i<in1;i++) {
    		tob[i] = tab[i];
    		}
    		tob[in1]=tab[in2];
    		for(int i=in1+1;i<in2;i++) {
    			tob[i]=tab[i];
    		}
    		tob[in2]=tab[in1];
    		for(int i=in2+1;i<tab.length;i++) {
    			tob[i]=tab[i];
    		}
    	}else {
    			for(int i=0;i<in2;i++) {
    				tob[i] = tab[i];
    				}
    				tob[in2]=tab[in1];
    			for(int i=in2+1;i<in1;i++) {
    					tob[i]=tab[i];
    				}
    				tob[in1]=tab[in2];
    			for(int i=in1+1;i<tab.length;i++) {
    					tob[i]=tab[i];	
    			}
    	}
    	for(int i =0;i<tob.length;i++) {
    		System.out.println(tob[i]);
    	}

   static char[] motVersTab(String s) {

       int c = s.length();
       char [] tab = new char[c];
       
       for(int i=0; i<c; i++) {
           tab[i]=s.charAt(i);
       }
       return tab;
   }
    */
   
   static void affiche(char[] mot, boolean[] vu) {
       
       
           
       for (int i=0; i< mot.length; i++) {
           if (vu[i]==true) {              
               System.out.print(mot[i]);
           } else {
               System.out.print("?");
           }
       }
       
       System.out.println("");
   }
   
   static boolean[] metAJour(char[] mot, boolean[] vu, char c) {
                       
      for (int i = 0; i < mot.length; i++) {
          if (mot[i]==c) {
              vu[i]= true;
          }  
      }
     
      return vu;            
   }
   
   static boolean partieFinie(boolean vu[]) {
                   
      for (int i =0; i < vu.length-1; i++) {
          if (vu[i]==false) {
              return false;
          }
      }
      return true;
   }
    
    public static void main(String[] args) {
        System.out.println("Bienvenue dans l'antre de la morrrt, jeune padawan !");
        System.out.println(" __________\n|    ___   |\n|   |   |  |\n|   *   |  |\n|  -|-  |  |\n|  / \\  |  |\n| ______|_ |\n|__________|");
        
        /* System.out.println("\n|    ___   |");
        System.out.println("\n|   |   |  |");
        System.out.println("\n|   *   |  |");
        System.out.println("\n|  -|-  |  |");
        System.out.println("\n|  / \\  |  |");
        System.out.println("\n| ______|_ |");
        System.out.println("\n___________"); */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Rentre un mot à jouer :");
        String mot = sc.nextLine();
        
        for (int i = 0; i < 30; i++) {
            System.out.println("");
        }
        
        System.out.println("A toi de jouer. Tu perds, tu bois !");
        
        partie(mot);
        
    }
}