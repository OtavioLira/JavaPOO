package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI_ONG_Votacao {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_ONG_Votacao window = new GUI_ONG_Votacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_ONG_Votacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite a Idade da Pessoa");
		lblNewLabel.setBounds(10, 11, 202, 14);
		frame.getContentPane().add(lblNewLabel);
	}

}
