package Repetição;
import java.util.Scanner;
public class Repetição_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Insira até que número devo mostrar a sequência fibonacci: ");
	int iNum = input.nextInt();
	
	int iAtual = 1;
	int iAnterior = 1;
	int iSucessor = 1;
	
	while (iAtual < iNum) {
			System.out.println(iAtual);
			iAnterior = iAtual;
			iAtual = iSucessor;
			iSucessor= (iAtual + iAnterior);
	}
	input.close();	
	}

}
