package Repetição;
import java.util.Scanner;
public class Repetição_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Insira um número: ");
	int iNum1 = input.nextInt();
	System.out.print("Insira outro número: ");
	int iNum2 = input.nextInt();
	
	float fSoma =0;
	
	for (int i = (iNum1+1); i < (iNum2); i++) {
		fSoma = (fSoma + i);
	}
	System.out.println("A Soma do números do intervalo é: "+fSoma);
	
	input.close();	
	}

}
