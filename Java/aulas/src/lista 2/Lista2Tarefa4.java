import java.util.Scanner;

public class Lista2Tarefa4 {
	
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		
		int numero, numero2;
		System.out.println("Ol� digite um n�mero inteiro:");
		numero = ler.nextInt();
		numero2 = (numero%2);
		if (numero2 <= 0) {
			System.out.println("O n�mero � par");
		}
		else if (numero2 > 0){
			System.out.println("O n�mero � impar");
		}
	}
}