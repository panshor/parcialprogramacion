package parcial;

import java.util.Scanner;
import java.util.Random;
public class Parcial {


    public static void main(String[] args) {
        
        int ran = 0;
        Scanner leer = new Scanner(System.in);
        System.out.print("Digite cuantos numeros de 3 a 5 cifras quiere generar: ");
        int n = 0;
        int min = 100;
        int max = 99999;
        int random = 0;
        n=leer.nextInt();
        random = (int)(Math.random() * (max - min +1))+min;
        int ult = 0;
        int inv = 0;

            
        
        
        for (int  i= 1; i <=n; i++){
        random = (int)(Math.random() * (max - min +1))+min;
        System.out.print(random+", ");
            while(random>0){
                ult = random % 10;
                inv = inv * 10 + ult;
                random /= 10;
                

                
        }
                            if(inv % 3 == 0){
                    System.out.println("El número es camaleón");
                }else{
                    System.out.println("El númeo no es camaleón");
                }
            

        }
            
        }
        
    
    
}
