package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class GUI_ONG_Doacao {

	private JFrame frame;
	private JTextField InputDoacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_ONG_Doacao window = new GUI_ONG_Doacao();
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
	public GUI_ONG_Doacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 250, 145);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		InputDoacao = new JTextField();
		InputDoacao.setText("");
		InputDoacao.setBounds(10, 36, 86, 20);
		frame.getContentPane().add(InputDoacao);
		InputDoacao.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Digite o valor das doações");
		lblNewLabel.setBounds(10, 11, 190, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor do investimento:");
		lblNewLabel_1.setBounds(10, 65, 133, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblInvestimento = new JLabel("");
		lblInvestimento.setHorizontalAlignment(SwingConstants.LEFT);
		lblInvestimento.setBounds(146, 65, 78, 14);
		frame.getContentPane().add(lblInvestimento);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valor = Integer.parseInt(InputDoacao.getText());
				System.out.println(valor);
				if (valor >= 1000){
					valor = valor * 0.15;
				} else {
					valor = valor * 0.05;
				}
				lblInvestimento.setText(Double.toString(valor));
			}
		});
		btnNewButton.setBounds(111, 35, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
