package Repetição;
import java.util.Scanner;
public class Repetição_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	float fSoma = 0;
	float fValue = 1;
	int i = 0;
	boolean bSim = false;
	
	System.out.println("Seja Bem-vindo(a) cliente!");
	System.out.println("Ao informar 0 a compra será finalizada.");
	
	while(fValue != 0 || bSim == false) {
		i++;
		System.out.print("Insira o valor do "+i+"° produto: ");
		fValue = input.nextFloat();
		fSoma = (fSoma + fValue);
		
	if(fValue == 0) {
		System.out.println("O Valor da compra é: "+fSoma+" R$. Insira o valor que irá pagar: ");
		float fPago = input.nextFloat();
		float fTroco = (fPago - fSoma);
		System.out.println("Seu troco é: "+fTroco+" R$.");
		
		System.out.println("Tem mais clientes?(S ou N): ");
		char cOption = input.next().charAt(0);
		if(cOption == 'S' || cOption == 's') {
			bSim = false;
			i = 0;
		} else {
			bSim = true;
			System.out.println("Fim. :) ");
	}
	}
	
	}
	input.close();	
	}

}
