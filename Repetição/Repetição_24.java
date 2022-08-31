package Repetição;
import java.util.Scanner;
public class Repetição_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Informe quantos CDs você tem:");
	int iQtd = input.nextInt();
	
	float fSoma = 0;
	
	for (int i = 1; i <= iQtd;i++) {
		System.out.print("Informe o valor do "+i+"° CD: ");
		float fValue = input.nextFloat();
		fSoma = (fSoma+fValue);
		
	}
	System.out.println("Você investiu um total de "+fSoma+" R$ em sua coleção.");
	System.out.println("A média de custo de cada CD é: "+(fSoma/iQtd)+" R$.");
	
	input.close();
	}	

}