import java.util.Scanner;

public class exercio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
     float n1, n2, n3, n4;
     float media;
     System.out.println("Digite sua primeira nota:");
     n1 = leitor.nextFloat();
     
     System.out.println("Digite sua segunda nota:");
     n2 = leitor.nextFloat();
     
     System.out.println("Digite sua terceira nota:");
     n3 = leitor.nextFloat();
     
     System.out.println("Digite sua quarta nota:");
     n4 = leitor.nextFloat();
     
     media = (n1 + n2 + n3 + n4)/4 ;
     System.out.println(media);
     
     if(media > 7) {
     System.out.println("Aprovado");
     
     }else if(media >= 3.5 && media <= 7) {
    	 System.out.println("Recuperação");
     
     } else if(media < 3.5) {
    	 System.out.println("Reprovado");
     
	}
	}
}
