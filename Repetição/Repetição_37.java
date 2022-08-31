package Repetição;
import java.util.Scanner;
public class Repetição_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	int k = 0;
	int iT = 0;
	int iCodm = 0;
	int iCodM = 0;
	float fMaior = -1;
	float fMenor = 11;
	float fMedia = 0;
	char cOp = 'a';
	boolean bStop = false;

	while(!bStop) {
		
		System.out.println("Seja bem-vindo(a) ao nosso corretor de provas! ");		
		System.out.println("Insira um código de aluno(int): ");
		int iCod = input.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			iT++;
			System.out.println("Insira a resposta da "+(i)+ "° questão: ");
			char cResp = input.next().charAt(0);
			
			if(i == 1 && (cResp == 'A' || cResp == 'a' )) {
				k++;
			}else if(i == 2 && (cResp == 'B' || cResp == 'b' )) {
				k++;
			}else if(i == 3 && (cResp == 'C' || cResp == 'c' )) {
				k++;
			}else if(i == 4 && (cResp == 'D' || cResp == 'd' )) {
				k++;
			}else if(i == 5 && (cResp == 'E' || cResp == 'e' )) {
				k++;
			}else if(i == 5 && (cResp == 'E' || cResp == 'e' )) {
				k++;
			}else if(i == 6 && (cResp == 'D' || cResp == 'd' )) {
				k++;
			}else if(i == 7 && (cResp == 'C' || cResp == 'c' )) {
				k++;
			}else if(i == 8 && (cResp == 'B' || cResp == 'b' )) {
				k++;
			}else if(i == 9 && (cResp == 'A' || cResp == 'a' )) {
				k++;
			}else if(cResp == 'E' || cResp == 'e' ) {
				k++;
			}else {
				
			}
			if(i==10) {
				System.out.println("Outro aluno irá utilizar o sistema?(s ou n) ");
				cOp = input.next().charAt(0);
				i=0;
			}
			if(cOp == 'S' || cOp == 's' ) {
				i=0;
			}else {
				System.out.println("Fim dos alunos.");
				bStop = true;
			}
			
			if(iT < fMenor) {
				fMenor = iT;
				iCodm = iCod;
			}
			if(iT > fMaior) {
				fMaior = iT;
				iCodM = iCod;
			}
			fMedia = fMedia+k;
			
		}

		
	}
	
	System.out.println(iT+" Alunos usaram o programa.");
	System.out.println("A média da turma é: "+(fMedia/iT));
	System.out.println("O aluno "+iCodm+" teve o menor acerto: "+fMenor);
	System.out.println("O aluno "+iCodM+" teve o maior acerto: "+fMaior);
	
	input.close();
	}

}
