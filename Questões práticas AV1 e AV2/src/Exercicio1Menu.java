import java.util.Scanner;

public class Exercicio1Menu {
	
	static Scanner tecla = new Scanner(System.in);
	static Exercicio1Pessoa[] lista = new Exercicio1Pessoa[40];
	static int index = 0;
	
	public static void main(String[] args) {
		int option = 0;
		
		do {
			System.out.println("-------********-------");
			System.out.println("---------MENU---------");
			System.out.println("[1]-INSERIR PESSOA");
			System.out.println("[2]-LISTAR PESSOAS");
			System.out.println("[0]-EXIT");
			option = tecla.nextInt();
			switch(option) {
				case 1 :
					inserir();
					break;
				case 2 : 
					listar();
					break;
			}
			
		}while(option != 0);

	}

	public static void inserir() {
		System.out.println("Nome: ");
		String nome = tecla.next();
		System.out.println("Idade: ");
		int idade = tecla.nextInt();
		lista[index++] = new Exercicio1Pessoa(nome,idade);
		System.out.println("**PESSOA INSERIDA COM SUCESSO!**");
	}
	
	public static void listar() {
		System.out.println("**PESSOAS**");
		System.out.println("**CADASTRADAS**");
		for(int i = 0; i < lista.length - 1; i++) {
			if(lista[i] != null) {
				System.out.println("Nome: " + lista[i].getNomePessoa());
				System.out.println("Idade: " + lista[i].getIdade());
			}
		}
	}
}
