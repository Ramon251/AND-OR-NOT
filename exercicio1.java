import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Digite um n�mero:");
		num = leitor.nextInt();
		
		if (num >= 20  && num <= 90)
		System.out.println("Este numero est� entre 20 e 90");
		
		else
		System.out.println("Este n�meor n�o est� entre 20 e 90");

	}

}
