package Repetição;
import java.util.Scanner;
public class Repetição_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	float fNota = 12;
	
	while (fNota < 0 || fNota > 10){
		System.out.println("Informe uma nota entre 0 e 10: ");
		fNota = input.nextFloat();
	}
	System.out.println("sua nota é: "+fNota);
	
	
	input.close();	
		
	}

}
