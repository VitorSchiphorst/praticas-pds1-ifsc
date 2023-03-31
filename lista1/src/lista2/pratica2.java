package lista2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class pratica2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaior;
	private JTextField txtMenor;
	private JTextField txtCadastrar;
	private ArrayList<Double> Nums;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pratica2 frame = new pratica2();
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
	public pratica2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtMaior = new JTextField();
		txtMaior.setEditable(false);
		txtMaior.setBounds(34, 29, 144, 76);
		contentPane.add(txtMaior);
		txtMaior.setColumns(10);
		
		txtMenor = new JTextField();
		txtMenor.setEditable(false);
		txtMenor.setColumns(10);
		txtMenor.setBounds(226, 29, 144, 76);
		contentPane.add(txtMenor);
		
		txtCadastrar = new JTextField();
		txtCadastrar.setBounds(148, 149, 112, 32);
		contentPane.add(txtCadastrar);
		txtCadastrar.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(58, 192, 112, 32);
		contentPane.add(btnCadastrar);
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.setBounds(226, 192, 112, 32);
		contentPane.add(btnExibir);
		
		JLabel lblMaior = new JLabel("Maior");
		lblMaior.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaior.setBounds(34, 11, 144, 14);
		contentPane.add(lblMaior);
		
		JLabel lblMenor = new JLabel("Menor");
		lblMenor.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenor.setBounds(226, 11, 144, 14);
		contentPane.add(lblMenor);
		
		JLabel lblCadastrar = new JLabel("Cadastrar");
		lblCadastrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrar.setBounds(148, 132, 112, 14);
		contentPane.add(lblCadastrar);
		
		Nums = new ArrayList <Double>();
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double numX = Double.parseDouble(txtCadastrar.getText());
				Nums.add(numX);
			}
		});
		
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double maiorNum = Double.MIN_VALUE;
				Double menorNum = Double.MAX_VALUE;
				
				for (int i = 0; i < Nums.size(); i++) {
					
					if(Nums.get(i) > maiorNum) {
						maiorNum = Nums.get(i);
					}
					
					if(Nums.get(i) < menorNum) {
						menorNum = Nums.get(i);
					}
				}
				
				txtMaior.setText(maiorNum.toString());
				txtMenor.setText(menorNum.toString());	
			}
		});
	}
}
