import java.util.Scanner;

public class Max2 {

	static public int max2(int x, int y) {
			
			int max;
			if(x > y) {
				return max = x;
			}else {
				return max = y;
			}
			
			
			
		}

		

	 static public int max3(int z, int y, int x) {
			
			int res = max2(x,y);
			int ret = max2(res,z);
			return ret;
			
			
			
		}
		
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Entrez deux entiers");
			System.out.print("x = ");
			int x = sc.nextInt();
			System.out.print("y = ");
			int y = sc.nextInt();
			System.out.print("y = ");
			int z = sc.nextInt();
			
			final int resu = max2(x,y);
			System.out.println("Le maximum de x et y vaut ");
			
		}

	
}
