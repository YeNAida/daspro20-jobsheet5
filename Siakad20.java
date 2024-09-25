import java.util.Scanner;

/**
 * Siakad20
 */
public class Siakad20{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nama,nim;
        char kelas;
        byte absen;
        double nilaikuis,nilaitugas,nilaiujian,nilaiakhir;
        // Data diri mahasiswa
        System.out.println("--------------DATA DIRI MAHASISWA---------------");
        System.out.print("Masukkan Nama\t\t: ");
        nama = sc.nextLine();
        System.out.print("Masukkan Nim\t\t: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas\t\t: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen\t: ");
        absen = sc.nextByte();

        // nilai mahasiswa
        System.out.println("----------------Nilai Mhasiswa-----------------");
        System.out.print("Masukkan nilai kuis\t: ");
        nilaikuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas\t: ");
        nilaitugas = sc.nextDouble();
        System.out.print("masukkan nilai ujian\t: ");
        nilaiujian = sc.nextDouble();
        

        
        
        System.out.println("---------------------Maka----------------------\n");
        nilaiakhir = (nilaikuis+nilaitugas+nilaiujian)/3;
        System.out.println("Mahasiswa dengan nama "+nama+" NIM = "+nim+ " kelas = " +kelas+ " No.absen = "+absen);       
        System.out.println("Nilai akhir\t\t:" +nilaiakhir);
        
        String nilaihuruf,kualifikasi;
        double nilaisetara;
      
        if (80 < nilaiakhir && nilaiakhir <= 100) {
            nilaihuruf = "A";
            nilaisetara = 4.0;
            kualifikasi = "Sangat Baik";
        } else if (73 < nilaiakhir && nilaiakhir <= 80) {
            nilaihuruf = "B+";
            nilaisetara = 3.5;
            kualifikasi = "Lebih dari Baik";
        } else if (65 < nilaiakhir && nilaiakhir <= 73) {
            nilaihuruf = "B";
            nilaisetara = 3.0;
            kualifikasi = "Baik";
        } else if (60 < nilaiakhir && nilaiakhir <= 65) {
            nilaihuruf = "C+";
            nilaisetara = 2.5;
            kualifikasi = "Lebih dari Cukup";
        } else if (50 < nilaiakhir && nilaiakhir <= 60) {
            nilaihuruf = "C";
            nilaisetara = 2.0;
            kualifikasi = "Cukup";
        }else if (39 < nilaiakhir && nilaiakhir <= 50) {
            nilaihuruf = "D";
            nilaisetara = 1.0;
            kualifikasi = "Kurang";
        } else {
            nilaihuruf = "E";
            nilaisetara = 0.0;
            kualifikasi = "Gagal";
        }
        System.out.println("Nilai Huruf\t\t: "+nilaihuruf);
        System.out.println("Nilai Setara\t\t: "+nilaisetara);
        System.out.println("Kualifikasi\t\t: "+kualifikasi);
     
       
}}
//     switch ((nilaiangka >=80? 1: nilaiangka >=73?2 :nilaiangka >=65?3:
        //     nilaiangka >=60?5:nilaiangka>=50?6:nilaiangka>=39?7:8)){
        //         case 1 :
        //             nilaihuruf="A";
        //             nilaisetara= 4;
        //             kualifikasi = "Sangat baik";
        //             break;
        //         case 2 :
        //             nilaihuruf= "B+";
        //             nilaisetara= 3.5;
        //             kualifikasi="Lebih dari baik";    
        //         break;
        //         case 3: 
        //             nilaihuruf="B";
        //             nilaisetara= 3;
        //             kualifikasi="Baik";
        //         break;
        //         case 4:
        //             nilaihuruf="C+";
        //             nilaisetara=2.5;
        //             kualifikasi="Lebih dari cukup";
        //         break;
        //         case 5:
        //             nilaihuruf="C";
        //             nilaisetara=2;
        //             kualifikasi="cukup";
        //         case 6:
        //             nilaihuruf ="D";
        //             nilaisetara=1;
        //             kualifikasi="Kurang";
        //             break;
        //         case 7:
        //             nilaihuruf="E";
        //             nilaisetara=0;
        //             kualifikasi="Gagal";
        //             break;    
        //     }
        //     System.out.println("Nilai huruf: "+ nilaihuruf +"");
    //     System.out.println("Nilai Setara: "+nilaisetara+"");
    //     System.out.println("Kualifikasi"+kualifikasi+"");
    // }}
    
    
    

      

        
        

        
    
