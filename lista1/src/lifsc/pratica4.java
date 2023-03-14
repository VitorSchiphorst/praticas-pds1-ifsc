package lifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class pratica4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pratica4 frame = new pratica4();
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
	public pratica4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(62, 43, 130, 62);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(243, 43, 130, 62);
		contentPane.add(txtNum2);	
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(txtNum1.getText());
				double num2 = Double.parseDouble(txtNum2.getText());
				
				double multi = num1 * num2;
				JOptionPane.showMessageDialog(null, "Resultado = " + multi);
			}
		});
		btnMultiplicar.setBounds(243, 135, 130, 23);
		contentPane.add(btnMultiplicar);
		
		JButton btnSub = new JButton("Subtrair");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(txtNum1.getText());
				double num2 = Double.parseDouble(txtNum2.getText());
				
				Double sub = num1 - num2;
				JOptionPane.showMessageDialog(null, "Resultado = " + sub);
			}
		});
		btnSub.setBounds(62, 135, 130, 23);
		contentPane.add(btnSub);
		
		JButton btnSomar = new JButton("Somar");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(txtNum1.getText());
				double num2 = Double.parseDouble(txtNum2.getText());
				
				Double somar = num1 + num2;
				JOptionPane.showMessageDialog(null, "Resultado = " + somar);
			}
		});
		btnSomar.setBounds(62, 169, 130, 23);
		contentPane.add(btnSomar);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(txtNum1.getText());
				double num2 = Double.parseDouble(txtNum2.getText());
				
				Double divi = num1 / num2;
				JOptionPane.showMessageDialog(null, "Resultado = " + divi);
			}
		});
		btnDividir.setBounds(243, 169, 130, 23);
		contentPane.add(btnDividir);
		
		JLabel lblNewLabel = new JLabel("Número 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(62, 18, 130, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNmero = new JLabel("Número 2");
		lblNmero.setHorizontalAlignment(SwingConstants.CENTER);
		lblNmero.setBounds(243, 18, 130, 14);
		contentPane.add(lblNmero);
	}
}
