import java.util.Scanner;

public class Exercice3 {
	
	
	
	int somme;
	int max = 0, min = 0;
	int n=0, i=0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ex #3 : 
1.	Lire dix valeurs (entiers) 
2.	Trouver et afficher la valeur MAX et la valeur MIN
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int somme;
		int max = 0, min = 0;
		int n=0, i=0;
		
		System.out.println("Entrez une dizaine de valeurs ");
		
		while(i<10) {
			n = sc.nextInt();
if(i==0) {
	min= n;
	max =n;
	
}else if(n<min) {
	min = n;
}else if(n >max) {
	max =n;
}

i++;


		
		
		
		
		
	}
System.out.println(" Max :" + max + " et mini " + min);
}}
