package Repetição;
import java.util.Scanner;
public class Repetição_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);{
	
	System.out.println("Informe o valor de sua dívida: ");
	double dValue = input.nextFloat();
	
	int i = 0;
	double dResult = 0;
	double dJuro = 0;
	
	for(i = 1;i <= 12;i++) {
		
	    if(i==0) {
	    	dResult =(dValue+dJuro);
	    	System.out.println("Valor:      Juros:      Parcelas:      Valor da parcela:"+dResult);
	    }else if(i==3) {
	    	dJuro = (dValue * 0.10);
	    	dResult =(dValue+dJuro);
	    }else if (i==6) {
	    	dJuro = (dValue * 0.15);
	    	dResult =(dValue+dJuro);
	    }else if(i==9) {
	    	dJuro = (dValue * 0.20);
	    	dResult =(dValue+dJuro);
	    }else if(i >= 12) {
	    	dJuro = (dValue * 0.25);
	    	dResult =(dValue+dJuro);
	    }
	    System.out.println("Valor: "+dValue+" Juros: "+dJuro+" Parcelas: "+(i) + " Valor da parcela:"+dResult);
	}
	}
	input.close();
	
	}
}
