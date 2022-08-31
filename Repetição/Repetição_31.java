package Repetição;
import java.util.Scanner;
public class Repetição_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	int iCodB = 0;
	int iCodA = 0;
	float fBaixo = 0;
	float fAlto = 0;
	
	
	for(int i = 1; i <= 10;i++) {
		System.out.print("Insira o número do "+i+"° aluno: ");
		int iCod = input.nextInt();
		System.out.print("Insira a altura (em cm) do "+i+"° aluno: ");
		float fAlt = input.nextFloat();
		
		if(i==1) {
			iCodA = iCod;
			iCodB = iCod;
			fAlto = fAlt;
			fBaixo = fAlt;
		}
		if(fAlt > fAlto) {
			fAlto = fAlt;
			iCodA = iCod;
		}
		if(fAlt < fBaixo) {
			fBaixo = fAlt;
			iCodB = iCod;
		}
	}
	System.out.println("O aluno "+iCodA+" é o mais alto com "+fAlto+" cm de altura.");
	System.out.println("O aluno "+iCodB+" é o mais baixo com "+fBaixo+" cm de altura.");
	
	input.close();	
	}

}
