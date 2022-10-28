
package method01;
import java.util.Scanner;
public class Latihan05 {
    public static void hitung(int a, int b, int c )
    {
        if(a>b && a>c) {
            System.out.print("Bilangan Terbesar :" + a);
        }
        else if(b>a && b>c){
            System.out.print("Bilangan Terbesar :" + b);
        }
       else if(c>a && c>b) {
            System.out.print("Bilangan Terbesar :" + c);
       }
    }
        public static void main (String[] args)
        {
            Scanner input = new Scanner (System.in);
            
            System.out.println ("Masukan bilangan I:");
            int bil1 = input.nextInt();
            
            System.out.println ("Masukan bilangan II:");
            int bil2 = input.nextInt();
            
            System.out.println ("Masukan bilangan III:");
            int bil3 = input.nextInt();
        
            hitung(bil1, bil2, bil3);
        }

            
            
            
            
            
            
            
            
            
    
       
        
        
   
    }
    
    
}
