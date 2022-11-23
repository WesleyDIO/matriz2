import java.util.Scanner;
public class atv5 {
  public static void main (String [] args) {
	  Scanner entrada = new Scanner (System.in);
	  
	  int matriz [][] = new int [4][4];
	  
	  for(int i=0;i<matriz.length;i++) {
		  for(int n=0;n<matriz.length;n++) {
			  System.out.println("Coluna "+(i+1)+" Linha "+(n+1)+ " valor: ");
			  matriz [i][n]= entrada.nextInt();
		  }
	  }
	   System.out.println("Elementos da diagonal principal");
	   for(int i=0;i<matriz.length;i++) {
		   for(int n=0;n<matriz.length;n++) {
			   if(i==n) {
				   System.out.println("Coluna "+(i+1)+" linha "+(n+1)+" = "+matriz[i][n]);
			   }
		   }
	   } 
	    System.out.println("Todos os elementos (exeto da diagonal principal)");
	    for(int i=0;i<matriz.length;i++) {
	    	for(int n=0;n<matriz.length;n++) {
	    		if(i!=n) {
	    			System.out.println("Coluna "+(i+1)+" linha "+(n+1)+" = "+matriz[i][n]);
	    		}
	    }
	    }
  }
}
