package Repetição;
public class Repetição_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double dA = 80000;
	double dB = 200000;
	int i = 0;
	
	while (dA < dB) {
		i++;
		dA = (dA + (dA*0.03));
		dB = (dB + (dB*0.015));
		
	}
	if (dA == dB) {
		System.out.println("Foram necessários " + i + " anos para a população A se igualar a B.");
	} else {
		System.out.println("Foram necessários " + i + " anos para a população A superar a B.");
	}
	
	
	}

}
