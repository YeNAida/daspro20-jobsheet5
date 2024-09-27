import java.util.Scanner;
public class Pemilihanusia20 {
    public static void main(String[] args) {
        Scanner utill = new Scanner(System.in);
        
        int usia;
        
        usia = Scanner.nextInt();

        System.out.println("\t\t\tKATEGORI USIA\t\t\t");
        System.out.println("Masukkan usia: ");
        if (usia <=0 && usia >= 12){
            System.out.println("Kategori usia: Anak");
        }
        else if (usia <=13 && usia >= 19){
            System.out.println("Kategori usia: Remaja");
        }
        else if (usia <=20 && usia >= 64){
            System.out.println("Kategori usia: Dewasa");
        }
        else if (usia <= 65){
            System.out.println("Kategori usia: Lansia");
        }
        else {
            System.out.println("Usia tidak ada dalam Kategori manapun! coba masukkan usia yang benar!");
        }

        
        

    }
    utill.close;
}
