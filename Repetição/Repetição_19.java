package Repetição;
import java.util.Scanner;
public class Repetição_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);	
	
	System.out.println("Insira o número para verificar se é primo: ");
	int iNum = input.nextInt();
	
	int k = 0;
	
	for (int i = 1; i <= iNum; i++) {
		k=0;
		for(int j = 1; j <= i;j++) {
		
			if(i==2) {
				System.out.println(i+" é primo.");
			}
			if (j >= 2 && i % j == 0) {
				k++;
			}
			if(k==2) {
				System.out.println(i+" é primo");
				k=0;
			}
			
		}
		
	}
	input.close();
	}

}