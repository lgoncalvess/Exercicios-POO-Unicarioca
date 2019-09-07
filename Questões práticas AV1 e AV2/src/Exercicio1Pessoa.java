public class Exercicio1Pessoa {
	private String nomePessoa;
	private int idade;

	public String getNomePessoa() {
		return this.nomePessoa;
	}
	
	public void setNomePessoa(String nome) {
		this.nomePessoa = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Exercicio1Pessoa(String nome, int idade) {
		this.nomePessoa = nome;
		this.idade = idade;
	}

}