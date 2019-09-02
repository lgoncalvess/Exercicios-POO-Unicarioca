import java.util.Scanner;

public class exercicioHumRepeticao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Double num1,num2,divisor;
		System.out.println("Write the first value: ");
		num1 = entrada.nextDouble();
		do {
			System.out.println("Write the second valid value: ");
			num2 = entrada.nextDouble();
		} while(num2 == 0);
		divisor = num1 / num2;
		System.out.println("divided is : " + divisor);
		
		entrada.close();

	}
}
