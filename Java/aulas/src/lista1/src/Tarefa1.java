import java.util.Scanner;

public class Tarefa1 {
	
	public static void main (String [] args) {
		
		Scanner ler = new Scanner(System.in) ;
		int anos, meses, dias,idade;
		System.out.println("Ol�, digite quantos anos voc� tem?(Somente os anos)");
		anos = ler.nextInt();
		System.out.println("Ol�, digite quantos meses em idade voc� tem?");
		meses = ler.nextInt();
		System.out.println("Ol�, digite quantos dias de idade voc� tem?");
		dias = ler.nextInt();
		
		idade = (anos*365)+(meses*30)+dias;
		System.out.println("Ol�, sua idade total em dias �: "+ idade+" dias :D");
		
	}

}
