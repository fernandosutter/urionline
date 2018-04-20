import java.io.IOException;
import java.util.Scanner; 

public class URI1805 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
		long A, B, soma = 0;
		
		A = s.nextInt();
		B = s.nextInt();
		
		for (long i = A; i <= B; i ++ ) {
			soma = soma + i;
			
		}
		System.out.println(soma);
 
    }
 
}