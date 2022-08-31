package Repetição;
import java.util.Scanner;
public class Repetição_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.print("Informe quantos votantes irão participar: ");
	int iQuant = input.nextInt();
	
	int j = 0;
	int k = 0;
	int l = 0;
	int iVoto =0;
	
	for(int i = 1;i <= iQuant; i++) {
			System.out.println("Votação...............................................");
			System.out.println("Candidato "+i+"...........................................");	
			System.out.println("Digite o número respectivo do candidato para votar....");
			System.out.println("1 - Bolinha...........................................");
			System.out.println("2 - Mineirinho........................................");
			System.out.println("3 - Serjão Berranteiro................................");
			iVoto = input.nextInt();
		if(iVoto == 1) {
			j++;
		}else if(iVoto ==2){
			k++;
		}else {
			l++;
		}
		
	}	
	System.out.println("O Candidato Bolinha ficou com "+j+" votos.");
	System.out.println("O Candidato Mineirinho ficou com "+k+" votos.");
	System.out.println("O Candidato Serjão Berranteiro ficou com "+l+" votos.");
	
	input.close();
	}

}
