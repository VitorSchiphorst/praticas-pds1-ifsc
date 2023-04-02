package lista2cont;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class pratica3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtExibirAluno;
	private JTextField txtExibirProf;
	private JLabel lblDados;
	private JLabel lblNewLabel_2;
	private JTextField txtNome;
	private JTextField txtNascimento;
	private JTextField txtCpf;
	private JLabel lblEscolha;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtMatricula;
	private JTextField txtSiape;
	private JButton btnCadastrarProf;
	private JButton btnCadastrarAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pratica3 frame = new pratica3();
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
	public pratica3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 57, 107, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Data de Nascimento:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 89, 107, 14);
		contentPane.add(lblNewLabel_1);
		
		
		txtExibirAluno = new JTextField();
		txtExibirAluno.setEnabled(false);
		txtExibirAluno.setEditable(false);
		txtExibirAluno.setColumns(10);
		txtExibirAluno.setBounds(25, 242, 208, 81);
		contentPane.add(txtExibirAluno);
		
		txtExibirProf = new JTextField();
		txtExibirProf.setEditable(false);
		txtExibirProf.setEnabled(false);
		txtExibirProf.setColumns(10);
		txtExibirProf.setBounds(299, 242, 208, 81);
		contentPane.add(txtExibirProf);
		
		lblDados = new JLabel("Dados");
		lblDados.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblDados.setHorizontalAlignment(SwingConstants.CENTER);
		lblDados.setBounds(127, 27, 107, 14);
		contentPane.add(lblDados);
		
		lblNewLabel_2 = new JLabel("CPF:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 120, 107, 14);
		contentPane.add(lblNewLabel_2);
		
		txtNome = new JTextField();
		txtNome.setBounds(126, 54, 128, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtNascimento = new JTextField();
		txtNascimento.setColumns(10);
		txtNascimento.setBounds(127, 86, 127, 20);
		contentPane.add(txtNascimento);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(127, 117, 127, 20);
		contentPane.add(txtCpf);
		
		lblEscolha = new JLabel("Escolha");
		lblEscolha.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscolha.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblEscolha.setBounds(356, 29, 107, 14);
		contentPane.add(lblEscolha);
		
		lblNewLabel_3 = new JLabel("Matricula:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(319, 57, 53, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Siape:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(319, 89, 53, 14);
		contentPane.add(lblNewLabel_4);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(378, 54, 128, 20);
		contentPane.add(txtMatricula);
		
		txtSiape = new JTextField();
		txtSiape.setColumns(10);
		txtSiape.setBounds(378, 86, 128, 20);
		contentPane.add(txtSiape);
		
		ArrayList <String> Alunos = new ArrayList <String>();
		ArrayList <String> Professores = new ArrayList <String>();
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date dataFormatada;
		
		btnCadastrarProf = new JButton("Cadastrar Professor");
		btnCadastrarProf.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCadastrarProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        Professor prof = new Professor();
		
				prof.setSiape(Long.parseLong(txtSiape.getText()));
				prof.setNome(txtNome.getText());
				prof.setNascimento(txtNascimento.getText());
				prof.setCpf(Long.parseLong(txtCpf.getText()));
				
				Professores.add(prof.toString());
				txtNome.setText(null);
				txtNascimento.setText(null);
				txtMatricula.setText(null);
				txtSiape.setText(null);
				txtCpf.setText(null);
			}
		});
		btnCadastrarProf.setBounds(179, 163, 177, 23);
		contentPane.add(btnCadastrarProf);
		
		btnCadastrarAluno = new JButton("Cadastrar Aluno");
		btnCadastrarAluno.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCadastrarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aluno aluno = new Aluno();
				
				aluno.setMatricula(Long.parseLong(txtMatricula.getText()));
				aluno.setNome(txtNome.getText());
				aluno.setNascimento(txtNascimento.getText());
				aluno.setCpf(Long.parseLong(txtCpf.getText()));
				
				Alunos.add(aluno.toString());
				txtNome.setText(null);
				txtNascimento.setText(null);
				txtMatricula.setText(null);
				txtSiape.setText(null);
				txtCpf.setText(null);
			}
		});
		btnCadastrarAluno.setBounds(179, 197, 177, 23);
		contentPane.add(btnCadastrarAluno);
		
		JButton btnProfessor = new JButton("Exibir Professor");
		btnProfessor.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtExibirProf.setText(""+Professores);
			}
		});
		btnProfessor.setBounds(319, 334, 169, 23);
		contentPane.add(btnProfessor);
		
		JButton btnAluno = new JButton("Exibir Aluno");
		btnAluno.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtExibirAluno.setText(""+Alunos);
			}
		});
		btnAluno.setBounds(46, 334, 169, 23);
		contentPane.add(btnAluno);
	}

}

