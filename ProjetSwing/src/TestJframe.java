import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TexturePaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;

public class TestJframe extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	
	public static float temp(float tempCelsius) 
	{
		float tempFahr;			
			tempFahr =  (float) (tempCelsius* 1.8 + 32);
			return tempFahr;

	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestJframe frame = new TestJframe();
					frame.setVisible(true);
					
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
					
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestJframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCelsius = new JLabel("celsius");
		lblCelsius.setBounds(38, 22, 164, 30);
		contentPane.add(lblCelsius);
		
		JButton btnConvert = new JButton("convert");
		btnConvert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				 String resultat = textField.getText();
				 int result =  Integer.parseInt(resultat);		
					JTextPane txtpnResultatIci = new JTextPane();
					txtpnResultatIci.setBounds(224, 144, 188, 78);
					float aaa = temp(result);
					txtpnResultatIci.setText("Le resultat est ici en farenheit :  " + aaa);
					contentPane.add(txtpnResultatIci);	
				 double conv = result * 1.8 + 32;
				 JOptionPane.showMessageDialog(null, conv);
				 

			
						
						 
						 
				 
				 
			}
		});
		btnConvert.setBounds(38, 108, 128, 30);
		btnConvert.addActionListener(this);
		contentPane.add(btnConvert);
	

		
		JTextPane txtpnResultatIci = new JTextPane();
		txtpnResultatIci.setText("resultat ici");
		txtpnResultatIci.setBounds(38, 167, 140, 60);
		contentPane.add(txtpnResultatIci);
		
		textField = new JTextField();
		textField.setBounds(38, 63, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Vote !");
		btnNewButton.setBounds(284, 197, 113, 30);
		contentPane.add(btnNewButton);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("New radio item");
		rdbtnmntmNewRadioItem.setBounds(264, 26, 133, 26);
		contentPane.add(rdbtnmntmNewRadioItem);
		
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("aaaa");
		 

		
	}
}
