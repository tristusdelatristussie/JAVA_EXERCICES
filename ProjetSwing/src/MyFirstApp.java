import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MyFirstApp extends JPanel {

	 /**
	 * Create the panel.
	 */
	
	public float temp(float tempCelsius) 
	{
		float tempFahr;			
			tempFahr =  (float) (tempCelsius* 1.8 + 32);
			return tempFahr;

	}
	public MyFirstApp() {
		
		

		


		
		JButton btnNewButton = new JButton("convert");
		btnNewButton.setBounds(49, 113, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				temp(23);
						
			}
		});
		setLayout(null);
		add(btnNewButton);
		
		JTextPane txtpnThisIsMy = new JTextPane();
		txtpnThisIsMy.setBounds(176, 34, 240, 23);
		txtpnThisIsMy.setText("Celsius");
		
		add(txtpnThisIsMy);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("/"));
		lblNewLabel.setBounds(49, 66, 46, 14);
		add(lblNewLabel);
		
		JTextPane txtpnFarenhneit = new JTextPane();
		txtpnFarenhneit.setBounds(176, 93, 240, 23);
		txtpnFarenhneit.setText("104 Farenhneit");
		add(txtpnFarenhneit);
		
		Label label = new Label("Celsius");
		label.setBounds(176, 58, 246, 22);
		add(label);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(26, 34, 140, 48);
		add(textArea);

	}
}
