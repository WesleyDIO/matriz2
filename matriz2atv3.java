import java.util.Scanner;
public class atv3 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for(int i=0;i<matriz.length;i++){
            for(int n=0;n<matriz.length;n++){
                System.out.println("Coluna ["+(i+1)+"] linha ["+(n+1)+"] valor: ");
                matriz[i][n] = entrada.nextInt();
            }
        }
        System.out.println("============================================");
        for(int i=0;i<matriz.length;i++){
            for(int n=0;n<matriz.length;n++){
                if(matriz[i][n]<0){
                    matriz[i][n] = 0;
                }
                System.out.println("Coluna ["+(i+1)+"] linha ["+(n+1)+"] = "+matriz[i][n]);
            }
        }

        System.out.println("\n==============================\n\nLINHAS SUBSTITUIDAS:");
        for(int i=0;i<matriz.length;i++){
            for(int n=0;n<matriz.length;n++){
                if(matriz[i][n]==0){
                    System.out.println("Coluna ["+(i+1)+"] linha ["+(n+1)+"]");
                }
            }
        }
    }
}

