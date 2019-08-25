import java.util.Scanner;

public class EcercicioHum {

	public static void main(String[] args) {
		final double PI = 3.14;
		Scanner entrada = new Scanner(System.in);
		double raio,area;
		
		System.out.println("Entre com o raio:  ");
		raio = entrada.nextDouble();
		area = (raio * raio) * PI;
		System.out.println("A area do circulo é: " + area);
	}

}
