package VetoresEMatrizes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		 int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		 
		 
	     System.out.print("Vetor: ");
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print(vetor[i] + " ");
	        }
	        System.out.println();

	        System.out.print("Digite o número que você deseja encontrar: ");
	        int numero = sc.nextInt();
	        
	        boolean encontrado = false;
	        int posicao = 0;
	        
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] == numero) {
	                encontrado = true;
	                posicao = i;
	                break;
	            }
	        }
	        
	        if (encontrado) {
	            System.out.printf("O número %d está localizado na posição: %d", numero, posicao);
	        } else {
	            System.out.printf("O número %d não foi encontrado!", numero);
	            
	       sc.close();
	        
	        }
	    }
	}
		
	
		