package Repetição;
import java.util.Scanner;
public class Repetição_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	int iMaior = 0;
	int iMenor = 0;
	int CMaior = 0;
	int CMenor = 0;
	float fMedia = 0;
	float fMedAci = 0;
	int j = 0;
	
	
	for(int i = 1; i <= 5;i++) {
		System.out.println("Informe o código da "+i+"° cidade: ");
		int iCod = input.nextInt();
		System.out.println("Informe o número de veículos de passeio da "+i+"° cidade: ");
		int iVei = input.nextInt();
		System.out.println("Informe o número de acidentes de trânsito da "+i+"° cidade: ");
		int iAci = input.nextInt();
		fMedia = (fMedia + iVei);
		
		if(i == 1) {
			iMaior = iAci;
			iMenor = iAci;
			CMaior = iCod;
			CMenor = iCod;
		}
		if(iAci > iMaior) {
			iMaior = iAci;	
			CMaior = iCod;
	    }	
		if(iAci < iMenor) {
			iMenor = iAci;	
			CMenor = iCod;
	    }
		
		if(iVei < 2000) {
			fMedAci = (fMedAci + iAci);
			j++;
		}
	}
	System.out.println("O maior índice de acidente é da cidade: "+CMaior+" com "+iMaior+" acidentes.");
	System.out.println("O menor índice de acidente é da cidade: "+CMenor+" com "+iMenor+" acidentes.");
	System.out.println("A média de veículo das 5 cidade é: "+(fMedia/5));
	System.out.println("A média de acidentes em cidades com menos de 2 mil veículos é: "+(fMedAci/j));
	
	input.close();	
	}

}