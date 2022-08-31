package Repetição;
import java.util.Scanner;
public class Repetição_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite um inteiro positivo: ");
	String sNum = input.nextLine();
	
	int iTam = sNum.length();
	String sResult = "";
	
	for(int i = iTam;i > 0; i--) {
		sResult += sNum.substring(i -1, i);
	}
	System.out.println("Seu inteiro invertido é: "+sResult);
	
	input.close();
	}

}
