package Repetição;
import java.util.Scanner;
public class Repetição_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	int iQtd = 0;
	double dValue = 0;
	
	while(iQtd < 1 || iQtd > 50) {
		System.out.print("Informe quantos itens o cliente está levando: ");
		iQtd = input.nextInt();
	}
	
	for(int i = 0; i < iQtd; i++) {
		dValue = ((iQtd*1.99)-0.01);
	}
	System.out.println("O Valor da compra é de: "+dValue+" R$.");
	
	input.close();
	}

}