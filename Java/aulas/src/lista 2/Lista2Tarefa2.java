import java.util.Scanner;

public class Lista2Tarefa2 {
	
	public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
		int c, n, e,horasNormais, salarioBase , salarioTotal, salarioExcedente, valorHoraExtra = 20, valorHoraNormal = 10;
		
		System.out.println("Ol�, digite o c�digo do funcion�rio: ");
		c = ler.nextInt();
		System.out.println("Digite o n�mero de horas trabalhadas por esse funcion�rio no m�s: ");
		n = ler.nextInt();
		
		{
			if  (n <= 50)
		{
			e = 0;
			horasNormais = 50;
			System.out.println("O funcion�rio c�digo \", C, \" n�o teve horas excedentes esse m�s");
		}
		
		else if
			(n > 50);
		{
			e = n-50;
			horasNormais = 50;
			System.out.println("O funcion�rio c�digo "+c+ " teve "+e+ " horas extras trabalhadas");	
			
			}
			}
			{ 
		salarioBase = (horasNormais*valorHoraNormal);
		salarioExcedente = (e*valorHoraExtra);
		salarioTotal = (salarioBase +salarioExcedente);
		
		System.out.println("Valor por hora base: "+ valorHoraNormal);
		System.out.println ("Valor por hora extra: "+ valorHoraExtra);
		System.out.println("Total de horas extras: "+e);
		System.out.println("Total de horas normais: "+horasNormais);
		System.out.println("salario base: "+ salarioBase);
		System.out.println("Valor de hora extra: "+salarioExcedente);
		System.out.println("Sal�rio total:  "+salarioTotal);
				
		}	
	}
}
