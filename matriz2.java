"# matriz2" 

  import java.util.Scanner;
  public class atv1 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A=0, B=0;
        
        int menu=1;

        
        	System.out.println("Qual é a quantidade de colunas nas duas matrizes? ");
			 A = entrada.nextInt();
			 
			 System.out.println("Qual é a quantidade de linhas nas duas matrizes? ");
			 B = entrada.nextInt();
			 
			 int[][] matrizA = new int[A][B];
		        int[][] matrizB = new int[A][B];
		        int[][] matrizSoma = new int[A][B];
		        int[][] matrizSub = new int[A][B];
		        int[][] matrizMult = new int[A][B];
		        while(menu!=0){
            System.out.println("\n\n========= MENU =========");
            System.out.println("Somar as matrizes [1]\nsubtrair as Matrizes [2]\nMultiplicar as Matrizes [3]\nSair [0]\n> ");
            menu = entrada.nextInt();

            if(menu>0 & menu<=3){
                for(int i=0;i< A;i++){
                    for(int n=0;n<B;n++){
                        System.out.println("\n=== Matriz A ===");
                        System.out.println("Coluna ["+(i+1)+"] linha ["+(n+1)+"] valor: ");
                        matrizA[i][n] = entrada.nextInt();
                    }
                }

                for(int i=0;i<A;i++){
                    for(int n=0;n<B;n++){
                        System.out.println("\n=== Matriz B ===");
                        System.out.println("Coluna ["+(i+1)+"] linha ["+(n+1)+"] valor: ");
                        matrizB[i][n] = entrada.nextInt();
                    }
                }

                if(menu==1){
                    for(int i=0;i<A;i++){
                        for(int n=0;n<B;n++){
                            matrizSoma[i][n] = matrizA[i][n] + matrizB[i][n];
                        }
                    }

                    System.out.println("\n\n==== SOMA DAS MATRIZES ====");

                    for(int i=0;i<A;i++){
                        for(int n=0;n<B;n++){
                            System.out.println("Coluna ["+(i+1)+"] linha ["+(n+1)+"] = "+matrizSoma[i][n]);
                        }
                    }
                }

                if(menu==2){
                    for(int i=0;i<A;i++){
                        for(int n=0;n<B;n++){
                            matrizSub[i][n] = matrizA[i][n] - matrizB[i][n];
                        }
                    }
                    System.out.println("\n\n==== SUBTRACAO DAS MATRIZES ====");

                    for(int i=0;i<A;i++){
                        for(int n=0;n<B;n++){
                            System.out.println("Coluna ["+(i+1)+"] linha ["+(n+1)+"] = "+matrizSub[i][n]);
                        }
                    }
                }
                if(menu==3){
                    for(int i=0;i<A;i++){
                        for(int n=0;n<B;n++){
                            matrizMult[i][n] = matrizA[i][n] * matrizB[i][n];
                        }
                    }

                    System.out.println("\n\n==== MULTIPLICACAO DAS MATRIZES ====");

                    for(int i=0;i<A;i++){
                        for(int n=0;n<B;n++){
                            System.out.println("Coluna ["+(i+1)+"] linha ["+(n+1)+"] = "+matrizMult[i][n]);
                        }
                    }
                }
            }
            else if (menu!=0)
            {
                System.out.println("\nOPCAO INVALIDA\n");
            }
        }
    }
}
