import java.util.Scanner;
public class ExercicioHumSeleção {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cod; 
		System.out.println("Digite o código de origem do produto: ");
		cod = entrada.nextInt();
		switch(cod){
		case 1:
			System.out.println("SUL");
			break;
		case 2:
			System.out.println("NORTE");
			break;
		case 3:
			System.out.println("LESTE");
			break;
		case 4:
			System.out.println("OESTE");
			break;
		case 5:
			System.out.println("NORDESTE");
			break;
		case 6:
			System.out.println("NORDESTE");
			break;
		case 7:
			System.out.println("SUDESTE");
			break;
		case 8:
			System.out.println("SUDESTE");
			break;
		case 9:
			System.out.println("SUDESTE");
			break;
		case 10:
			System.out.println("CENTRO-OESTE");
			break;
		case 11:
			System.out.println("NOROESTE");
			break;
		default:
			System.out.println("Importado");
			break;
		}
		entrada.close();
	}

}
