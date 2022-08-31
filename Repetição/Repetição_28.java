package Repetição;
import java.util.Scanner;
public class Repetição_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	float fTemp = 1;
	float fMenor = 0;
	float fMaior = 0;
	float fSoma = 0;
	int i = 0;
	
	while(fTemp != 0) {
		i++;
		System.out.print("Digite a "+i+"° temperatura(ou 0 pra encerrar):");
		fTemp = input.nextFloat();
		fSoma = (fSoma + fTemp);
		if(i==1) {
			fMenor = fTemp;
			fMaior = fTemp;
		}
		if(fTemp > fMaior) {
			fMaior = fTemp;
		}
		if(fTemp < fMenor) {
			fMenor = fTemp;
		}	
	}
	System.out.println("A menor temperatura é de: "+fMenor+"°C.");	
	System.out.println("A maior temperatura é de: "+fMaior+"°C.");	
	System.out.println("A média das "+i+" temperaturas é de: "+(fSoma/i)+"°C.");	
	
	input.close();
	}

}
