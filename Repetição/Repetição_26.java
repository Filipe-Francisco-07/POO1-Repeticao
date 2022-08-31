package Repetição;
import java.util.Scanner;
public class Repetição_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.print("Informe o preço do pão: ");
	float fValue = input.nextFloat();
	
	System.out.println("Panificadora Alfa..........");
	System.out.println("Tabela de Preços...........");
	
	for(int i = 1; i <= 50; i++) {
		System.out.println("Quantidade de pães: "+i+" Preço: "+(fValue*i)+" R$.");

	}
	input.close();
	}

}