package lifsc;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class pratica2 {

	public static void main(String[] args) {
		ArrayList<String> elementos = new ArrayList<String>();
		
		for (int i = 0; i < 10; i++) {
			elementos.add(JOptionPane.showInputDialog("Informe o elemento: " + elementos));
		}
		
		for (int i = 0; i < args.length; i++) {
			JOptionPane.showMessageDialog(null, "Elemento inserido" + elementos);
		}
		
	}

}
