import java.util.Scanner;

public class Lista2Tarefa3 {
	
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		int n1, n2, n3, n4, q1, q2, q3, q4;
		
		System.out.println("Ol� digite o primeiro n�mero: ");
		n1 = ler.nextInt();
		System.out.println("Ol� digite o segundo n�mero: ");
		n2 = ler.nextInt();
		System.out.println("Ol� digite o terceiro n�mero: ");
		n3 = ler.nextInt();
		System.out.println("Ol� digite o quarto n�mero: ");
		n4 = ler.nextInt();
		
		q1 = n1*n1;
		q2 = n2*n2;
		q3 = n3*n3;
		q4 = n4*n4;
		
		if (q3 >=1000)
		{
			System.out.println (" O quadrado do n�mero "+ n3+ " � "+ q3);
		}
		else if 
		(q3 < 1000)
		{
			System.out.println (" O quadrado do n�mero "+ n1+ " � "+ q1);
			System.out.println("  O quadrado do n�mero "+ n2+ " � "+ q2);
			System.out.println (" O quadrado do n�mero "+ n3+ " � "+ q3);
			System.out.println (" O quadrado do n�mero "+ n4+ " � "+ q4);
		}
	}
}