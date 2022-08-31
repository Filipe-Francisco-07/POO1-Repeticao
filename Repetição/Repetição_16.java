package Repetição;
import java.util.Scanner;
public class Repetição_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.print("Quantos números deseja inserir? ");
	int iQuant = input.nextInt();
	
	int iMenor = 0;
	int iMaior = 0;
	float fSoma = 0;
	
	for (int i = 0; i < iQuant;i++) {
		System.out.print("Insira o "+(i+1)+" número: ");
		int iN = input.nextInt();
		if (i == 0) {
			iMenor = iN;
			iMaior = iN;
		}
		if (iN < iMenor) {
			iMenor = iN;
		}
		if (iN > iMaior) {
			iMaior = iN;
		}
		fSoma = (fSoma + iN);
	}
	System.out.println("O menor número é: "+iMenor+", o maior é: "+iMaior+", e a soma é: "+fSoma);
	
	input.close();	
	}

}
