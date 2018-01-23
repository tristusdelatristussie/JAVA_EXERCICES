
public class Exercice2 {

	
	
	
	
	
	public static void triangle2(int m) {
		int n = m*2;
		char tab[] = new char [n];
		
		
		char a = '*';
		


		for(int i = 0; i < tab.length/2; i++) {
			

			
			
			tab [ n/2 + i  ] = a;
			tab [n/2 -i ] = a;
			
			
			System.out.println(tab);
			}
		
		
		
		}
		
		
		

		

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle2(25);

	}

}
