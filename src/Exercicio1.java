import java.util.Scanner;

public class Exercicio1 {
	static final double PI = 3.14;
	
	public static void main(String[] args) {
		double raio, area;
		Scanner tecla = new Scanner(System.in);
		raio = 0;
		area = 0;
		
		System.out.println("Entre com algum valor: ");
		raio = tecla.nextDouble();
		
		area = calcularArea(raio);
		System.out.println("Valor da area é : " + area);
	}
	
	public static double calcularArea(double raio) {
		return Math.PI * Math.sqrt(raio);
	}
	
}
