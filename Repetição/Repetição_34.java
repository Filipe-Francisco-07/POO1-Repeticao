package Repetição;
import java.util.Scanner;
public class Repetição_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);	
		
	float fNum;
	int i = 0;
	int iCount_0_25 = 0;
	int iCount_26_50 = 0;
	int iCount_51_75 = 0;
	int iCount_76_100 = 0;
	
	do {
		i++;
		System.out.print("Informe o "+i+"° número: ");
		fNum = input.nextFloat();
		
		if(fNum >= 0 && fNum <= 25) {
			iCount_0_25++;
		}else if(fNum > 25 && fNum <= 50) {
			iCount_26_50++;
		}else if(fNum > 50 && fNum <= 75) {
			iCount_51_75++;
		}else if(fNum > 75 && fNum <= 100) {
			iCount_76_100++;
		}else {
			System.out.println("Número inválido. ");
			i--;
		}
	}while(fNum >= 0);
	
	System.out.println("Você digitou "+i+" números , dentre eles");
	System.out.println(iCount_0_25+" estão entre 0 e 25,");
	System.out.println(iCount_26_50+" estão entre 26 e 50,");
	System.out.println(iCount_51_75+" estão entre 51 e 75 e");
	System.out.println(iCount_76_100+" estão entre 76 e 100.");
	
	input.close();
	}

}
