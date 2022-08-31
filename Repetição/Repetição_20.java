package Repetição;
import java.util.Scanner;
public class Repetição_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	float fSoma = 0;
	
	System.out.print("Insira quantas notas: ");
	int iNotas = input.nextInt();
	
	for (int i = 0;i < iNotas; i++) {
		System.out.print("Insira a "+(i+1)+" nota: ");
		float fNota = input.nextFloat();
		
		fSoma = (fSoma + fNota);
	}
	System.out.println("A média das "+iNotas+" notas é: "+(fSoma/iNotas));
	
	input.close();	
	}

}
