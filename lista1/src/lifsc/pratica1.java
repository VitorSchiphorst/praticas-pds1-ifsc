package lifsc;

import javax.swing.JOptionPane;

public class pratica1 {

	public static void main(String[] args) {
		
		Double precoLitro = Double.valueOf(JOptionPane.showInputDialog("Informe o Preço do Litro:"));
		Integer quantidadeLitros = Integer.valueOf(JOptionPane.showInputDialog("Informe a quantidade de Litros:"));
		
		Double pagamento = totalPagamento(precoLitro, quantidadeLitros);
		
		JOptionPane.showMessageDialog(null, "O preço total pago será de R$"+ pagamento);
	}
		
	private static Double totalPagamento(Double precoLitro, Integer quantidadeLitros) {
		
		Double pagar = precoLitro * quantidadeLitros;
		
		return pagar;
	}
}