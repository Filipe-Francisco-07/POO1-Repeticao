package Repetição;
import java.util.Scanner;
public class Repetição_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	//lendo nome	
	System.out.println("Informe seu nome: ");
	String sName = input.nextLine();
	
	int iLength = sName.length();
	int iAge = 200;
	//validando tamanho da string
	while (iLength <= 3) {
		System.out.print("Informe um nome com mais de 3 letras: ");
		sName = input.nextLine();
		iLength = sName.length();
	}
	do {
		System.out.print("Insira sua idade(entre 0 e 150): ");
		iAge = input.nextInt();
	}while (iAge <= 0 || iAge >= 150);
	
	//lendo salário
	System.out.print("Insira seu salário: ");
	float fSal = input.nextFloat();
	//validando salário
	while (fSal <= 0) {
		System.out.print("Insira um salário válido: ");
		fSal = input.nextFloat();
	}
	//lendo sexo
	System.out.print("Informe seu sexo(F ou M): ");
	char cSex = input.next().charAt(0);
	//validando sexo
	while (cSex != 'f' && cSex != 'm' ) {
		System.out.print("Informe seu sexo(F ou M): ");
		cSex = input.next().charAt(0);
	}
	//lendo estado civil
	System.out.print("Informe seu estado civil (s , c , v , d): ");
	char cState = input.next().charAt(0);
	//validando estado civil
	while (cState != 's' && cState != 'c' && cState != 'v' && cState != 'd' ) {
		System.out.print("Informe seu estado civil (s , c , v , d): ");
		cState = input.next().charAt(0);
	}
	System.out.print(sName+ " " + iAge+ " " + fSal+ " " + cSex+ " " + cState );
	
	input.close();
	}

}
