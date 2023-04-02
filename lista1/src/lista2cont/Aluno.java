package lista2cont;

public class Aluno extends Pessoa {
	private Long matricula;

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "Nome: " + super.getNome() +" Siape: "+
		this.getMatricula()+" Data nascimento: "+super.getNascimento()+
		" CPF: "+ super.getCpf();
	}
}
