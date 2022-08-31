package Repetição;
import java.util.Scanner;
public class Repetição_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.println("Realizar cadastro...");
	System.out.print("Insira um nome de usuário: ");
	String sUser = input.nextLine();
	System.out.print("Insira uma senha: ");
	String sPass = input.nextLine();
	
	while(sUser.equalsIgnoreCase(sPass)) {
		System.out.print("Insira uma senha diferente do nome de usuário: ");
		sPass = input.nextLine();
	}
	System.out.println("Confirmando dados... ");
	System.out.println("Usuário: "+sUser);
	System.out.println("Senha: "+sPass);
	
	input.close();
	}

}
