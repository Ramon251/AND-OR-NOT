import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		int valor1, valor2, valor3;  

		System.out.println("Qual o primeiro valor?");
		valor1 = leitor.nextInt();
		
		System.out.println("Qual o segundo valor?");
		valor2 = leitor.nextInt();
		
		System.out.println("Qual o terceiro valor?");
		valor3 = leitor.nextInt();
		
		if(valor1 == valor2 && valor1 == valor3) {
			System.out.println("triangulo equilatero");
			
		}else if (valor1 == valor2 || valor1== valor3 || valor2 == valor3) {
			System.out.println("triangulo isósceles");
			
		}else if (valor1!= valor2 && valor2 != valor3) {
		}System.out.println("triangulo escaleno");
	}

}
