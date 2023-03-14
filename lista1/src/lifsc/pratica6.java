package lifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pratica6 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtNome;
	private JLabel lblNota1;
	private JLabel lblNota2;
	private JLabel lblNota3;
	private JLabel lblNome;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pratica6 frame = new pratica6();
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
	public pratica6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(56, 119, 104, 45);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(170, 119, 104, 45);
		contentPane.add(txtNota2);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(281, 119, 104, 45);
		contentPane.add(txtNota3);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(171, 31, 104, 45);
		contentPane.add(txtNome);
		
		lblNota1 = new JLabel("1º Nota");
		lblNota1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota1.setBounds(56, 94, 104, 14);
		contentPane.add(lblNota1);
		
		lblNota2 = new JLabel("2º Nota");
		lblNota2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota2.setBounds(170, 94, 104, 14);
		contentPane.add(lblNota2);
		
		lblNota3 = new JLabel("3º Nota");
		lblNota3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota3.setBounds(281, 94, 104, 14);
		contentPane.add(lblNota3);
		
		lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(170, 11, 104, 14);
		contentPane.add(lblNome);

		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				double n1 = Double.parseDouble(txtNota1.getText());
				double n2 = Double.parseDouble(txtNota2.getText());
				double n3 = Double.parseDouble(txtNota3.getText());
				
				double mf = (n1 + n2 +n3)/ 3;
				
				JOptionPane.showMessageDialog(null, "A Média Final do " + nome + " é " + mf);
			}
		});
		btnCalcular.setBounds(154, 190, 129, 45);
		contentPane.add(btnCalcular);
	}

}
