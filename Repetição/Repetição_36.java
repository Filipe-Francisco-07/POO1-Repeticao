package Repetição;
import java.util.Scanner;
public class Repetição_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	int i = 0;
	int iVoto = -1;
	int iLag = 0;
	int iGalo = 0;
	int iCavalo = 0;
	int iRato = 0;
	int iNulo = 0;
	int iBranco = 0;	
	
	while(iVoto != 0) {
		i++;
		System.out.println("Seja bem-vindo(a) a nossa votação");
		System.out.println("");
		System.out.println("Para votar digite o número respectivo de cada opção: ");
		System.out.println("");
		System.out.println("1 - Lagarto");
		System.out.println("2 - Galo");
		System.out.println("3 - Cavalo");
		System.out.println("4 - Rato");
		System.out.println("5 - Voto Nulo");
		System.out.println("6 - Voto em Branco");
		System.out.println("0 - Finalizar votação.");
		iVoto = input.nextInt();
		
		while (iVoto < 0 || iVoto > 6) {
			System.out.print("Insira um voto válido (1 até 6): ");
			iVoto = input.nextInt();
		}
		if(iVoto == 1) {
			iLag++;
		}else if(iVoto == 2) {
			iGalo++;
		}else if(iVoto == 3) {
			iCavalo++;
		}else if(iVoto == 4) {
			iRato++;
		}else if(iVoto == 5) {
			iNulo++;
		}else {
			iBranco++;		
		}
		
	}	
	System.out.println(i);
	System.out.println("O candidato 1 - Lagarto obteve "+iLag+" votos.");
	System.out.println("O candidato 2 - Galo obteve "+iGalo+" votos.");
	System.out.println("O candidato 3 - Cavalo obteve "+iCavalo+" votos.");
	System.out.println("O candidato 4 - Rato obteve "+iRato+" votos.");
	System.out.println("Obtivemos "+iNulo+" votos nulos.");
	System.out.println("Obtivemos "+iBranco+" votos brancos.");
	System.out.println("A porcentegem de votos nulos é de : "+((iNulo/i)*100)+"%.");
	System.out.println("A porcentegem de votos em branco é de : "+((iBranco/i)*100)+"%.");
	
	input.close();
	}

}
