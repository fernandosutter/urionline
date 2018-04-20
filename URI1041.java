import java.util.Scanner;

public class URI1041{
	
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		float x,y;

		x = teclado.nextFloat();
		y = teclado.nextFloat();


		if(y == 0){
			System.out.println( (x == 0) ? "Origem" : "Eixo X");
		}
		else if(x == 0){
			System.out.println("Eixo Y");
		}
		else if( x < 0){
				System.out.println( (y < 0) ? "Q3" : "Q2");
		}
		else if( x > 0){
				System.out.println((y < 0) ? "Q4" : "Q1");
		}
		
	}

}