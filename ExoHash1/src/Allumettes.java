import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

public class Allumettes {

    static int all = 20;

    static int js = 0;
    static int jo = 0;

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();






    public static int jeu() {
        while (all >= 2) {

            System.out.println("Entrez le nbre d allumettes");
            js = sc.nextInt();

            if(js>3 && all >1) {
                System.out.println("Vous devez prendre entre une et 3 allumettes");
                System.out.println("Allumettes restantes " + all);
                jeu();
            }
            all = all - js;
            
            if(all == 1) {
                System.out.println("Vous avez gagné et l ordinateur a perdu");
                break;
            }
            
            if(all==3) {
            	jo = 2;
                System.out.println("Nbre allumettes de l ordinateur " + jo);
                System.out.println("Vous avez perdu et l ordinateur a gagné");
                break;

            }
            if(all==2) {
            	jo = 1;
                System.out.println("Nbre allumettes de l ordinateur " + jo);
                System.out.println("Vous avez perdu et l ordinateur a gagné");
                break;
            	
            }

            System.out.println("Allumettes restantes " + all);
            jo = rand.nextInt(3 - 1 + 1) + 1;
            all = all - jo;
            System.out.println("Nbre allumettes de l ordinateur " + jo);
            
            if(all == 1) {
                System.out.println("Vous avez perdu et l ordinateur a gagné");
                break;
            }
            if(all>=0) {
            System.out.println("Allumettes restantes " + all);
            }


        }
        return all;
    }





    public static void main( String [] args){
        jeu();    }
}
