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

public class pratica5 extends JFrame {

	private JPanel contentPane;
	private JTextField txtLado1;
	private JTextField txtLado3;
	private JTextField txtLado2;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pratica5 frame = new pratica5();
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
	public pratica5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtLado1 = new JTextField();
		txtLado1.setColumns(10);
		txtLado1.setBounds(88, 100, 95, 40);
		contentPane.add(txtLado1);
		
		txtLado3 = new JTextField();
		txtLado3.setColumns(10);
		txtLado3.setBounds(244, 100, 95, 40);
		contentPane.add(txtLado3);
		
		txtLado2 = new JTextField();
		txtLado2.setColumns(10);
		txtLado2.setBounds(166, 24, 95, 40);
		contentPane.add(txtLado2);
		
		btnNewButton = new JButton("Verificar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(txtLado1.getText());
				double num2 = Double.parseDouble(txtLado2.getText());
				double num3 = Double.parseDouble(txtLado3.getText());
				
				if (num1 == num2 && num2 == num3 && num3 == num1) {
					JOptionPane.showMessageDialog(null, "É um Triangulo Equilátero!");
				}
				
				else if (num1 != num2 && num2 != num3 && num3 != num1) {
					JOptionPane.showMessageDialog(null, "É um Triangulo Escaleno!");
				}

				else {
					JOptionPane.showMessageDialog(null, "É um Triangulo Isósceles!");
				}
			}
		});
		btnNewButton.setBounds(149, 177, 133, 40);
		contentPane.add(btnNewButton);
	}

}
