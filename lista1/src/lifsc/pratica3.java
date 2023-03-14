package lifsc;

import javax.swing.JOptionPane;

public class pratica3 {
	public static void main(String[] args) {
		Double nota1 = Double.valueOf(JOptionPane.showInputDialog("Informe a nota: "));
		Double nota2 = Double.valueOf(JOptionPane.showInputDialog("Informe a nota: "));
		Double nota3 = Double.valueOf(JOptionPane.showInputDialog("Informe a nota: "));
		
		Double MF = (nota1 + nota2 + nota3)/3;
		
		if (MF >= 6) {
			JOptionPane.showMessageDialog(null,"Você foi Aprovado(a)!!");
		}
		
		if (MF >= 4 && MF <= 6) {
			JOptionPane.showMessageDialog(null,"Você ficou de Recuperação!!");
		}
		
		if (MF <= 4) {
			JOptionPane.showMessageDialog(null,"Você foi Reprovado(a)!!");
		}
		
	}
}
