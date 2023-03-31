package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class pratica1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCadastro;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pratica1 frame = new pratica1();
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
	public pratica1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCadastro = new JTextField();
		txtCadastro.setBounds(34, 41, 156, 58);
		contentPane.add(txtCadastro);
		txtCadastro.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setColumns(10);
		txtResultado.setBounds(243, 41, 161, 192);
		contentPane.add(txtResultado);
		
		ArrayList <Double> nums = new ArrayList<Double>();
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cadastro = Double.valueOf(txtCadastro.getText());
				
				if (cadastro % 2 == 0) {
					nums.add(cadastro);
				}
			}
		});
		btnCadastrar.setBounds(44, 124, 132, 49);
		contentPane.add(btnCadastrar);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastro.setBounds(34, 16, 156, 14);
		contentPane.add(lblCadastro);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(248, 16, 156, 14);
		contentPane.add(lblResultado);
		
		JButton btnExibir = new JButton("EXIBIR");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for (int i = 0; i < nums.size(); i++) {
					txtResultado.setText(nums.toString());
				}
			}
		});
		btnExibir.setBounds(44, 184, 132, 49);
		contentPane.add(btnExibir);
	}
}
