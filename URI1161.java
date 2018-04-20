package Pacote_padrão;
import java.util.Scanner;

public class URI1161 {

	public static void main(String[] args) {
		
		  Scanner s = new Scanner(System.in);
		  long M, N, soma = 1, somaf = 1;
		  do{
			  
		  
		  M = s.nextInt();
		  N = s.nextInt();
		  for (int i = 1;i <= M; i ++){
			  soma = i * soma ;
		  }
			somaf = soma;  
		 
			  soma = 1;
			  for (int i = 1;i <= N; i ++){
				  soma = i * soma ;
			  }
		
		somaf = somaf + soma;
		System.out.println(somaf);
		soma = 1;
		somaf = 1;
		  
		  }  while(s.hasNext());
		  
			    	
		  }	
		  
	
}

