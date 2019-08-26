import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		Double Celsius, Fahrenheit;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o grau em Fahrenheit: ");
		Fahrenheit = entrada.nextDouble();
		Celsius = ((Fahrenheit-32)*5)/9;
		System.out.println("Seu grau em Celsius é: " + Celsius);
	}

}
