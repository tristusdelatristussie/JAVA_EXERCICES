/*
 * Objectif : D�finir une classe avec un constructeur et cr�er une instance de cette classe
La classe Habitation comprend les attributs : propri�taire du type chaine de caract�res et qui correspond au 
nom du propri�taire, adresse du type chaine de caract�res et qui correspond � l�adresse de l�habitation, 
surface du type double et qui correspond � la surface de l�habitation et qui permet de calculer le montant de l�imp�t. 
Les m�thodes : double Impot() qui permet de calculer le montant de l�imp�t que doit payer le propri�taire de 
l�habitation a raison de 2 eur                                              
Challenge: Ajoutez un GUI ! :-) 
 */
public class exo2 {
	
	public class Habitation{
		
		String proprio;
		String addresse;
		double surface;
		
		
		double impot() {
			
			double imp;
			imp = this.surface * 2;
			
			return imp;
		}
		
	}
	
	
	
	public exo2() {
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		exo2 inst = new exo2();

	}

}
