import java.util.Scanner;

public class URI1040{


	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);

		float valores[] = new float[5];
		valores[0] = teclado.nextFloat();
		valores[1] = teclado.nextFloat();
		valores[2] = teclado.nextFloat();
		valores[3] = teclado.nextFloat();

		valores[4] = (valores[0]*2 + valores[1]*3+ valores[2]*4 + valores[3]*1)/10;

		System.out.printf("Media: %.1f\n",valores[4]);

		if(valores[4] >=7){
			System.out.println("Aluno aprovado.");
		}
		else if(valores[4] >= 5 &&  valores[4] <= 6.9){
			System.out.println("Aluno em exame.");
			valores[0] = teclado.nextFloat();
			System.out.printf("Nota do exame: %.1f\n",valores[0]);
			valores[1] = (valores[0] + valores[4])/2;

			if(valores[1] >=5)
				System.out.println("Aluno aprovado.");
			else
				System.out.println("Aluno reprovado.");

			
			System.out.printf("Media final: %.1f\n",valores[1]);
		}else if(valores[4] <5){
			System.out.println("Aluno reprovado.");
		}

	}

}