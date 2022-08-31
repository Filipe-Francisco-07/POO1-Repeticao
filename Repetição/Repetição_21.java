package Repetição;
import java.util.Scanner;
public class Repetição_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	float fSoma = 0;
	
	System.out.print("Insira quantas pessoas estão na turma: ");
	int iQuant = input.nextInt();
	
	for (int i = 0;i < iQuant; i++) {
		System.out.print("Insira a "+(i+1)+" idade: ");
		float fAge = input.nextFloat();
		
		fSoma = (fSoma + fAge);
	}
	if ((fSoma/iQuant) > 0 && ((fSoma/iQuant) <= 25)) {
	System.out.println("A média de idade das "+iQuant+" pessoas é: "+(fSoma/iQuant));
	System.out.println("Sua turma é jovem.");
	} else if ((fSoma/iQuant) > 26 && ((fSoma/iQuant) <= 60)){
		System.out.println("A média de idade das "+iQuant+" pessoas é: "+(fSoma/iQuant));
		System.out.println("Sua turma é adulta.");
	} else {
		System.out.println("A média de idade das "+iQuant+" pessoas é: "+(fSoma/iQuant));
		System.out.println("Sua turma é idosa.");
	}
	input.close();	
	}

}
