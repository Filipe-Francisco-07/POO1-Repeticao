package Repetição;
import java.util.Scanner;
public class Repetição_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Informe qual taboada você quer: ");
	int iTab = input.nextInt();
	System.out.print("Informe o início da taboada: ");
	int iBegin = input.nextInt();
	System.out.print("Informe o fim da taboada: ");
	int iEnd = input.nextInt();
	
	if(iBegin > iEnd) {
		System.out.println("Você digitou o início maior que o final,");
		System.out.println("Irei inverter os valores para você.");
		// Trocando o valor das variáveis sem utilizar var auxiliar.
		iBegin = (iBegin + iEnd);
		iEnd = (iBegin - iEnd);
		iBegin = (iBegin - iEnd);
	}
	
	for (int i = iBegin; i <= iEnd ; i++) {
		System.out.println(iTab + " x " + i + " = " + (iTab *i));
	}
	input.close();
	}

}
