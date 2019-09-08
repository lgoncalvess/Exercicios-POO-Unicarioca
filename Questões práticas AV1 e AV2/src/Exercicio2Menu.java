import java.util.Scanner;

public class Exercicio2Menu {
	
	static Scanner tecla = new Scanner(System.in);
	static Exercicio2Conta[] banco = new Exercicio2Conta[40];
	static int index = 0;
	
	public static void main(String[] args) {
		int option = 0;
		
		do {
			System.out.println("********BANCO********");
			System.out.println("[1] - Cadastrar conta");
			System.out.println("[2] - Excluir conta");
			System.out.println("[3] - Consultar conta");
			System.out.println("[4] - Trasferencia entre contas");
			System.out.println("[5] - Depositar");
			System.out.println("[6] - Sacar");
			System.out.println("[0] - Exit");

			option = tecla.nextInt();
			switch(option) {
				case 1: cadastrar(); break;
				case 2: excluir(); break;
				case 3: consultar(); break;
				case 4: transferencia(); break;
				case 5: depositar(); break;
				case 6: sacar(); break;
			}
			
		}while(option != 0);

	}
	
	public static void cadastrar() {
		System.out.println("********CADASTRAR CONTA*********");
		System.out.println("Numero da conta: ");
		String conta = tecla.next();
		System.out.println("Saldo: ");
		double saldo = tecla.nextDouble();
		
		banco[index++] = new Exercicio2Conta(conta,saldo);
		System.out.println("********Conta cadastrada com sucesso!*********");

	}
	
	public static void excluir() {
		System.out.println("********EXCLUIR CONTA**********");
		System.out.println("Numero da conta: ");
		String conta = tecla.next();
		for(int i = 0; i < banco.length; i++) {
			
			if(banco[i] != null  && banco[i].getConta().contains(conta)) {
				banco[i] = null;
				index -= 1;
				break;
			}
			
		}
	}
	
	public static void consultar() {
		System.out.println("********CONSULTAR CONTA**********");
		System.out.println("Numero da conta: ");
		String conta = tecla.next();
		for(int i = 0; i < banco.length; i++) {
			
			if(banco[i] != null  && banco[i].getConta().contains(conta)) {
				System.out.println("saldo da conta: " + banco[i].getSaldo());
				break;
			}
			
		}
	}
	
	public static void depositar() {
		System.out.println("********DEPOSITAR NA CONTA**********");
		System.out.println("Numero da conta: ");
		String conta = tecla.next();
		for(int i = 0; i < banco.length; i++) {
			
			if(banco[i] != null  && banco[i].getConta().contains(conta)) {
				System.out.println("Valor a ser depositado: ");
				banco[i].setSaldo(banco[i].getSaldo() + tecla.nextDouble());
				break;
			}
			
		}
	}
	
	public static void sacar() {
		System.out.println("********SACAR DA CONTA**********");
		System.out.println("Numero da conta: ");
		String conta = tecla.next();
		for(int i = 0; i < banco.length; i++) {
			
			if(banco[i] != null  && banco[i].getConta().contains(conta)) {
				System.out.println("Valor a ser sacado: ");
				banco[i].setSaldo(banco[i].getSaldo() - tecla.nextDouble());
				break;
			}
			
		}
	}
	
	public static void transferencia() {
		System.out.println("********TRANSFERENCIA*********");
		
		System.out.println("Transferir da conta: ");
		String minhaConta = tecla.next();
		System.out.println("para a conta: ");
		String contaRecebe = tecla.next();
		
		for(int i = 0; i < banco.length; i++) {
			
			if(banco[i] != null  && banco[i].getConta().contains(minhaConta)) {
				for(int j = 0; j < banco.length; j++) {
					if(banco[j] != null  && banco[j].getConta().contains(contaRecebe)) {
						System.out.println("Valor a ser transferido: ");
						double valor = tecla.nextDouble();
						banco[i].setSaldo(banco[i].getSaldo() - valor);
						banco[j].setSaldo(banco[j].getSaldo() + valor);
						System.out.println("Transferencia realizada com sucesso!");
						break;
					}
				}
				break;
			}
			
		}
	}
	

}
