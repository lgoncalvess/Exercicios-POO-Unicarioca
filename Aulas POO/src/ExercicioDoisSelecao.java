import java.util.Scanner; 
public class ExercicioDoisSelecao {

	public static void main(String[] args) {
		double n1,n2,n3,media;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a nota 1: ");
		n1 = entrada.nextDouble();
		System.out.println("Digite a nota 2: ");
		n2 = entrada.nextDouble();
		System.out.println("Digite a nota 3 (CASO NÃO TENHA FEITO DIGITE -1) : ");
		n3 = entrada.nextDouble();
		if(n3 == -1) {
			media = (n1 + n2) / 2;
		}else {
			if(n3 > n1) {
				media = (n3 + n2) / 2;
			}else if(n3 > n2) {
				media = (n1 + n3) / 2;
			}else {
				media = (n1 + n2) / 2;
			}
		}
		if(media >= 6) System.out.println("APROVADO!");
		if(media < 3) System.out.println("REPROVADO!");
		if(media >= 3 && media < 6) System.out.println("EXAME!");
		entrada.close();
	}

}
