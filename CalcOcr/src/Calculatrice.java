	/*
	 * 
	 * 

un JLabel pour l'affichage ;

un bool�en pour savoir si un op�rateur a �t� s�lectionn� ;

un bool�en pour savoir si nous devons effacer ce qui figure � l'�cran et �crire un nouveau nombre ;

nous allons utiliser une variable de type double pour nos calculs ;

il va nous falloir des classes internes qui impl�menteront l'interface ActionListener ;

et c'est � peu pr�s tout.

Pour all�ger le nombre de classes internes, vous pouvez en cr�er une qui se chargera d'�crire ce qui doit �tre affich� � l'�cran. Utilisez la m�thode getSource() pour savoir sur quel bouton on a cliqu�.

Je ne vais pas tout vous dire, il faut que vous cherchiez par vous-m�mes : la r�flexion est tr�s importante ! En revanche, vous devez savoir que la correction que je vous fournis n'est pas la correction. Il y a plusieurs solutions possibles. Je vous propose seulement l'une d'elles.

Allez, au boulot !


	 */



import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculatrice extends JFrame {
	
	private JPanel container = new JPanel();
	
	
	
	String[] tab_string = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "=", "C", "+", "-", "*", "/"};
	
	JButton[] tab_button = new JButton[tab_string.length];
	
	private JLabel ecran = new JLabel();
	
	private Dimension dim = new Dimension(50,40);
	
	private Dimension dim2 = new Dimension(50,31);
	
	private double chiffre1;
	
	private boolean clicOperateur = false, update = false;
	
	private String operateur ="";
	
	public Calculatrice() {
		
		this.setSize(240,260);
		this.setTitle("calculette");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);
	    
	    initComposant();
	    
	    this.setContentPane(container);
	    this.setVisible(true);
	    
	    
		
	}
	
	
	
	
	
	private void initComposant() {
		
		Font police = new Font("Arial", Font.BOLD, 20);
		ecran = new JLabel("0");
		ecran.setFont(police);
	    ecran.setHorizontalAlignment(JLabel.RIGHT);

		
		
		
		
		
	}
	
	
	
	
	
	
	

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
