import java.util.Random;
public class atv2 {
	public static void main(String[] args) 
    {
        Random ran=new Random();
        
        int matriz[][]=new int[5][5],repeticao=0;
        String repetidos="";
        
        for(int i =0;i<5;i++) 
        {
            for(int n =0;n<5;n++) 
            {
                matriz[i][n]=ran.nextInt(10);
                
            }
        }
        for(int i=0;i<5;i++) 
        {
            for(int n=0;n<5;n++) 
            {
                
                for(int l2=i+1;l2<5;l2++) 
                {
                    for(int c2=n+1;c2<5;c2++) 
                    {
                        if(matriz[i][n]==matriz[l2][c2]) 
                        {
                            repetidos+=matriz[i][n]+" na casa "+i+":"+n+" e "+matriz[i][n]+" na casa "+l2+":"+c2+"\n" ;
                            
                        }
                    }
                }
                        
            }
        }
        System.out.println("Os números se repetem: \n"+repetidos);
    }
}

