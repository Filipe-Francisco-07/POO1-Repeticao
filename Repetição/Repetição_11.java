package Repetição;
import java.util.Scanner;
public class Repetição_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	int j = 0;
	int k = 0;
	
	for (int i = 1; i <= 10;i++) {
		System.out.print("Digite o "+i+"° número inteiro: ");
		int iNum = input.nextInt();
		if (iNum % 2 == 0) {
			j++;
		}else {
			k++;
	}
	}
	System.out.println("Tivemos "+j+" Números pares e "+k+" números ímpares");
	
	input.close();
	}

}
