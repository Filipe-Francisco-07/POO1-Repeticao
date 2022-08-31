package Repetição;
import java.util.Scanner;
public class Repetição_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Digite o número base: ");
	float fBase = input.nextFloat();
	System.out.print("Digite o expoente: ");
	float fExp = input.nextFloat();
	
	float fSoma = 1;
	
	for (int i = 1; i <= fExp; i++) {
		
		fSoma = (fSoma * fBase);
	}	
	System.out.println("O resultado da potência é: "+fSoma);
	
	input.close();
	}

}