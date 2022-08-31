package Repetição;
import java.util.Scanner;
public class Repetição_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Informe um inteiro para seu fatorial: ");
	int iNum = input.nextInt();
	
	for (int i = iNum; i > 1; i--) {
		iNum = (iNum * (i-1));
	}
	System.out.println("Seu fatorial é: "+iNum);
	
	input.close();
	}

}