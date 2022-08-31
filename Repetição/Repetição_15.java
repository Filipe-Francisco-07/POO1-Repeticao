package Repetição;
public class Repetição_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int iN1 = 38;	
	int iN2 = 39;	
	int iN3 = 0;
	float fResult = 0;
	float fSoma = 0;
		
	while(iN1 > 1) {
		iN1--;
		iN2--;
		iN3++;
		fResult = ((iN1*iN2)/iN3);
		fSoma = (fSoma + fResult);
		System.out.println(iN1+" x "+iN2+" / "+iN3+" = " + fResult);
	}
	System.out.println("A soma final é: "+fSoma);
	}

}
