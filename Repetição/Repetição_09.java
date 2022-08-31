package Repetição;
import java.util.Scanner;
public class Repetição_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner input = new Scanner(System.in);
	System.out.print("Informe qual taboada você quer: ");
	int iTab = input.nextInt();
	
	for (int i = 0; i <= 10 ; i++) {
		System.out.println(iTab + " x " + i + " = " + (iTab *i));
	}
	input.close();
	}

}
