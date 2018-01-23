import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class mainPanel extends JFrame {
	public mainPanel() {
	}

	private CardLayout cardLayout;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Slide frame = new Slide();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	void initImage() {
		String[] filesname = {"C:\\\\Users\\\\a\\\\Desktop\\\\logo_free.png", "C:\\Users\\a\\Desktop\\logo_free.png", "C:\\\\Users\\\\a\\\\Desktop\\\\logo_free.png"};
		for( String s : filesname) {
			
			Icon icon = new ImageIcon("C:\\\\\\\\Users\\\\\\\\a\\\\\\\\Desktop\\\\\\\\" +s);
			JLabel label = new JLabel (icon);
			mainPanel.getContentPane().add(label);
			cardLayout= new CardLayout();
			mainPanel.getContentPane().setLayout(cardLayout);
			
			
		}
	}
	
	public Slider() {
		
		initComponents();
		initImage();
	}
	
	/**
	 * Create the frame.
	 */
	public Slide() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("next");
		btnNewButton.setBounds(281, 211, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		JButton btnNewButton_1 = new JButton("previous");
		btnNewButton_1.setBounds(76, 211, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		String list = {
				"",
				"",
				"",
				"",
				"",

		}		
		
		public void SetImageSize(int i ) {
			
			ImageIcon icon = new ImageIcon(list[i]);
			Image img ) icon.getImage();
		}
		
		JTextPane txtpnDsdsd = new JTextPane();
		txtpnDsdsd.setText("dsdsd");
		txtpnDsdsd.setBounds(41, 11, 57, 20);
		contentPane.add(txtpnDsdsd);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\a\\Desktop\\logo_free.png"));
		lblNewLabel.setBounds(51, 30, 319, 159);
	
		contentPane.add(lblNewLabel);
	}
}
