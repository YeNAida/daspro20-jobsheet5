import java.util.Scanner;

public class PemilihanBilangan20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Masukkan angka: ");
        int angka = sc.nextInt();
        
        String hasil ;
        hasil = angka %2 == 0 ? "Angka bilangan Genap" : "Angka bilangan Ganjil";
        System.out.println("Angka "+ angka +" termasuk" + hasil);

        // if (angka %2 == 0)
        // { 
        //     System.out.println("Angka "+ angka+ " termasuk angka Genap ");
        // }
        // else
        // {
        //     System.out.println("Angka "+ angka +" termasuk angka Ganjil");
        // } 
        sc.close();
      }    
}

