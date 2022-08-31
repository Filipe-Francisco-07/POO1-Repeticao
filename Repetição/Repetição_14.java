package Repetição;
import java.util.Scanner;
public class Repetição_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.println("Insira n: " );
	int n = input.nextInt();
	
	int i = 1;
	int j = 1;
	
	while  (i < n){
		if (i ==1) {
			System.out.println(i+" / "+j);
		}
		i++;
		j = j+2;
		System.out.println(i+" / "+j);

	}
	input.close();	
	}

}
