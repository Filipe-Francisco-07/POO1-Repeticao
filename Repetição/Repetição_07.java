package Repetição;
import java.util.Scanner;
public class Repetição_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Insira um número: ");
	int iNum1 = input.nextInt();
	System.out.print("Insira outro número: ");
	int iNum2 = input.nextInt();
	
	for (int i = (iNum1+1); i < (iNum2); i++) {
		System.out.print(i+" ");
	}
	input.close();	
	}

}
