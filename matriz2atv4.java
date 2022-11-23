import java.util.Scanner;
public class atv4 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[6][6];
        int x, naoEncontrado=0;

        for(int i=0;i<matriz.length;i++){
            for(int n=0;n<matriz.length;n++){
                System.out.println("Coluna ["+(i+1)+"] linha ["+(n+1)+"] valor: ");
                matriz[i][n] = entrada.nextInt();
            }
        }

        System.out.println("\n\nQual é o valor deseja buscar dentro da Matriz: ");
        x = entrada.nextInt();

        for(int i=0;i<matriz.length;i++){
            for(int n=0;n<matriz.length;n++){
                if(x==matriz[i][n]){
                    
                    System.out.println("\nO VALOR ESTA LOCALIZADO NA:\nColuna ["+(i+1)+"] linha ["+(n+1)+"] = "+matriz[i][n]);
                    naoEncontrado=1;
                }
            }
        }
        if(naoEncontrado==0){
            System.out.println("\n\n NÃO ENCONTRADO");
        }
    }
}

