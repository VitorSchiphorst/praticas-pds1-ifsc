package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.FuncionarioDAO;
import modelo.Funcionario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;

public class JanelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtCPF;
	private JTextField txtNome;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroPessoa frame = new JanelaCadastroPessoa();
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
	public JanelaCadastroPessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.BOLD, 20));
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setBackground(new Color(255, 255, 255));
		lblNome.setBounds(65, 61, 61, 30);
		contentPane.add(lblNome);
		
		txtCPF = new JTextField();
		txtCPF.setBackground(new Color(128, 128, 128));
		txtCPF.setBounds(136, 100, 180, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBackground(new Color(128, 128, 128));
		txtNome.setBounds(136, 69, 180, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Arial", Font.BOLD, 20));
		lblCPF.setForeground(new Color(255, 255, 255));
		lblCPF.setBounds(75, 95, 46, 25);
		contentPane.add(lblCPF);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 18));
		btnSubmit.setForeground(new Color(48, 48, 48));
		btnSubmit.setBackground(new Color(128, 128, 128));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf = txtCPF.getText();
				char[] senha = txtSenha.getPassword();
				
				if(nome.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum Nome foi preenchido!!!");
				}
				
				if(cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum CPF foi preenchido!!!");
				}
				
				Funcionario func = new Funcionario();
				func.setNome(nome);
				func.setCpf(Long.valueOf(cpf));
				
				FuncionarioDAO banquinhoDeDados = FuncionarioDAO.getInstancia();
				banquinhoDeDados.inserir(func);
			}
		});
		btnSubmit.setBounds(166, 174, 120, 30);
		contentPane.add(btnSubmit);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Arial", Font.BOLD, 20));
		lblSenha.setBounds(60, 130, 66, 25);
		contentPane.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBackground(new Color(128, 128, 128));
		txtSenha.setBounds(136, 131, 180, 20);
		contentPane.add(txtSenha);
	}
}