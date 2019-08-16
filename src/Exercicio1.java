import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		double raio, area;
		Scanner tecla = new Scanner(System.in);
		raio = 0;
		area = 0;
		
		System.out.println("Entre com algum valor: ");
		raio = tecla.nextDouble();
		
		area = 3.14 * Math.sqrt(raio);
		System.out.println("Valor da area" + area);
	}
	
}
