import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
     int salario;
     
     System.out.println("Qual o seu salário?");
     salario = leitor.nextInt();
     
     if( salario >= 0 && salario <= 1000)
    	 System.out.println("Recebeu aumento de 15% "+ (salario+(salario/100*15)));
     
     if( salario > 1000 && salario <= 2500)
    	 System.out.println("Recebeu aumento de 7% "+ (salario+(salario/100*7)));
     
     if( salario > 2500)
    	 System.out.println("não haverá aumento "+ salario);
     
	}

}
