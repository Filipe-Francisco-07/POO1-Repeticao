package Repetição;
import java.util.Scanner;
public class Repetição_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.print("Insira seu código de cliente: ");
	int iCod = input.nextInt();
	
	int i = 0;
	int iCod_G = 0;
	int iCod_M = 0;
	int iCod_A = 0;
	int iCod_B = 0;
	float fGordo = 0;
	float fMagro = 0;
	float fBaixo = 0;
	float fAlto = 0;
	float fMedP = 0;
	float fMedA = 0;
	
	while(iCod != 0) {
		i++;
		System.out.println("Informe sua altura: ");
		float fWeight = input.nextFloat();
		System.out.println("Informe seu peso: ");
		float fHeight = input.nextFloat();
		
		fMedA = (fMedA + fWeight);
		fMedP = (fMedP + fHeight);
		
		if(i == 1) {
			fGordo = fHeight;
			iCod_G = iCod;
			fMagro = fHeight;
			iCod_M = iCod;
			fAlto = fWeight;
			iCod_A = iCod;
			fBaixo = fWeight;
			iCod_B = iCod;
		}
		if(fWeight > fAlto) {
			fAlto = fWeight;
			iCod_A = iCod;
		}
		if(fWeight < fBaixo) {
			fBaixo = fWeight;
			iCod_B = iCod;
		}
		if(fHeight > fGordo) {
			fGordo = fHeight;
			iCod_G = iCod;
		}
		if(fHeight < fMagro) {
			fMagro = fHeight;
			iCod_M = iCod;
		}
		System.out.print("Insira seu código de cliente: ");
		iCod = input.nextInt();
	}
	System.out.println("O cliente mais alto de código: "+iCod_A+" tem "+fAlto+" de altura.");
	System.out.println("O cliente mais baixo de código: "+iCod_B+" tem "+fBaixo+" de altura.");
	System.out.println("O cliente mais gordo de código: "+iCod_G+" tem "+fGordo+" de peso.");
	System.out.println("O cliente mais magro de código: "+iCod_M+" tem "+fMagro+" de peso.");
	System.out.println("A média de altura das "+i+" pessoas é: "+(fMedA/i)+" M.");
	System.out.println("A média de peso das "+i+" pessoas é: "+(fMedP/i)+" KG.");
	
	input.close();	
	}

}
