import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.modelmbean.ModelMBean;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Etudiants extends JFrame implements ActionListener {


	

	JTable table;
	
	
	
	JScrollPane scrollPane = new JScrollPane(table);
	
	JPanel panel = new JPanel();
	JLabel labNom = new JLabel("nom");
	JLabel labPrenom = new JLabel("prenom");
	JLabel tel = new JLabel("Telephone");
	JLabel villeLab = new JLabel("ville");
	JButton button = new JButton("Valider");
	JButton buttonSup = new JButton("Supprimer");
	TextField nom = new TextField();
	TextField prenom = new TextField();
	TextField telephone = new TextField();
	TextField ville = new TextField();
	
	public Etudiants() {
		
		button.addActionListener(this);
		buttonSup.addActionListener(this);
		
		table = new JTable(new DefaultTableModel(null, new Object[] {"nom","prenom","tel","ville"}));
		table.setFillsViewportHeight(true);

		panel.setLayout(null);
		panel.setSize(900,600);
		this.setSize(900,600);
		labNom.setBounds(10,10,100,20);
		labPrenom.setBounds(10,50,100,20);
		tel.setBounds(10,90,100,20);
		nom.setBounds(150,10,100,20);
		prenom.setBounds(150,50,100,20);
		telephone.setBounds(150,90,100,20);
		ville.setBounds(150,130,100,20);
		villeLab.setBounds(10,130,100,20);
		table.setBounds(10,200,800,500);
		button.setBounds(500, 10, 80, 20);
		buttonSup.setBounds(500,50,80,20);
		
		
		
		
		panel.add(labNom);
		panel.add(nom);
		panel.add(labPrenom);
		panel.add(prenom);
		panel.add(tel);
		panel.add(ville);
		panel.add(villeLab);
		panel.add(button);
		panel.add(buttonSup);
		panel.add(table);
		this.setContentPane(panel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Etudiants();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		DefaultTableModel model =  (DefaultTableModel)table.getModel();

		model.addRow(new Object[]{ prenom.getText(), nom.getText() , telephone.getText(), ville.getText() });
	}

}