package Repetição;
import java.util.Scanner;
public class Repetição_35 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int iCod = 1;
		int iQuant;
		double dDog = 0;
		double dBauS = 0;
		double dBauO = 0;
		double dBurguer = 0;
		double dCheese = 0;
		double dRefri = 0;
		double dSoma = 0;

		while(iCod != 0) {
			System.out.println("        Tabela de produtos        ");
			System.out.println("");
			System.out.println("Especificação     Código   Preço  ");
			System.out.println("");
			System.out.println("Cachorro Quente   100      R$ 1,20");
			System.out.println("Bauru Simples     101      R$ 1,30");
			System.out.println("Bauru com ovo     102      R$ 1,50");
			System.out.println("Hambúrguer        103      R$ 1,20");
			System.out.println("Cheeseburguer     104      R$ 1,30");
			System.out.println("Refrigerante      105      R$ 1,00");
			System.out.println("");
			System.out.println("Para iniciar a compra digite o código do produto desejado: ");
			iCod = input.nextInt();

			if(iCod == 100) {
				System.out.println("Informe quantas unidades de Cachorro Quente: ");
				iQuant = input.nextInt();
				dDog = (iQuant*1.20);
			}else if(iCod == 101) {
				System.out.println("Informe quantas unidades de Bauru Simples: ");
				iQuant = input.nextInt();
				dBauS = (iQuant*1.30);
			}else if(iCod == 102) {
				System.out.println("Informe quantas unidades de Bauru com Ovo: ");
				iQuant = input.nextInt();
				dBauO = (iQuant*1.50);
			}else if(iCod == 103) {
				System.out.println("Informe quantas unidades de Hamburguer: ");
				iQuant = input.nextInt();
				dBurguer = (iQuant*1.20);
			}else if(iCod == 104) {
				System.out.println("Informe quantas unidades de Cheeseburguer: ");
				iQuant = input.nextInt();
				dCheese = (iQuant*1.30);
			}else if(iCod == 105) {
				System.out.println("Informe quantas unidades de Coquinha Gelada: ");
				iQuant = input.nextInt();
				dRefri = (iQuant* 1.00);
			}else if(iCod == 0) {
				System.out.println("Compra encerrada. ");

			}else {
				System.out.println("Informe um valor válido. ");
				System.out.println("");
			}
			dSoma = (dSoma + dRefri + dCheese + dBurguer + dBauO + dBauS + dDog);
				
			}
		
			if(dDog > 0) {
				System.out.println("Seu custo com Cachorro Quente é: "+dDog+" R$.");
			}
			if(dBauS > 0) {
				System.out.println("Seu custo com Bauru Simples é: "+dBauS+" R$.");
			}
			if(dBauO > 0) {
				System.out.println("Seu custo com Bauru com Ovo é: "+dBauO+" R$.");
			}
			if(dBurguer > 0) {
				System.out.println("Seu custo com Hambúrguer é: "+dBurguer+" R$.");
			}
			if(dCheese > 0) {
				System.out.println("Seu custo com Cheeseburguer é: "+dCheese+" R$.");
			}
			if(dRefri > 0) {
				System.out.println("Seu custo com Coquinha gelada é: "+dRefri+" R$.");
			}
			System.out.println("Seu custo total final é: "+dSoma+" R$.");
		
		
	input.close();
	}

}
