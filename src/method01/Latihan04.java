
package method01;

import java.util.Scanner;

public class Latihan04 {
    public static void hitung(int a, int b)
    {
        System.out.println("Hasil:" + (a / b) + "km/jam");
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jarak : ");
        int bil1 = input.nextInt();
        
        System.out.print("masukkan waktu : ");
        int bil2 = input.nextInt();
        
        hitung(bil1, bil2);    
    }
    
}
