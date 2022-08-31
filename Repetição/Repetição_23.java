package Repetição;
import java.util.Scanner;
public class Repetição_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.print("Informe o número de turmas: ");
	int iTurma = input.nextInt();
	
	int iQtd = 0;
	float fSoma = 0;
	
	for(int i = 1;i <= iTurma;i++) {
		do { 
		System.out.println("Informe o número de alunos da turma "+i+" : ");
		iQtd = input.nextInt();
		fSoma = (fSoma+iQtd);
	}while (iQtd < 1 || iQtd > 40);
	}
	System.out.println("A média de alunos por sala é: "+(fSoma/iTurma));
	
	input.close();
	}
}
