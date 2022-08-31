package Repetição;
import java.util.Scanner;
public class Repetição_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);	
	
	int j = 0;
	
	System.out.print("Insira um número(int): ");
	int iNum = input.nextInt();
	
	for (int i = 1; i <= iNum; i++) {
		if (iNum % i == 0) {
			j++;
		}
	}
	if(j == 2) {
		System.out.println("O número "+iNum+" é primo.");
	} else {
		System.out.println("O número "+iNum+" não é primo.");
	}
	
	input.close();
	}

}
