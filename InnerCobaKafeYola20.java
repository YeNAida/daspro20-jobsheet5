import java.util.Scanner;
/**
 * InnerCobaKafeYola20
 */
public class InnerCobaKafeYola20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        char keanggotaan;
        int jumlahkopi, jumlahteh, jumlahroti;
        double hargakopi = 12000.0, hargateh = 7000.0, hargaroti = 20000.0;
        double diskon = 10/100F;
        double akun, totalpembayaran;


        System.out.print(" Status Membership (Y/N) : ");
        keanggotaan = input.next().charAt(0);


        System.out.print("masukkan jumlah pembelian kopi : ");
        jumlahkopi = input.nextInt();


        System.out.print("masukkan jumlah pembelian teh : ");
        jumlahteh = input.nextInt();


        System.out.print("masukkan jumlah pembelian roti : ");
        jumlahroti = input.nextInt();


        akun = (jumlahkopi * hargakopi) + (jumlahteh * hargateh) + (jumlahroti * hargaroti);
        totalpembayaran = 0;
        if (keanggotaan == 'Y' || keanggotaan == 'y') {
            totalpembayaran = akun - (diskon * akun);
        } else {
            totalpembayaran = akun;
        }

        int nominalInt = (int) totalpembayaran;
        double discountPrice = akun - (akun - (akun * diskon));


        System.out.println("-------- STRUK PEMBELIAN ---------");


        System.out.println("keanggotaan pelanggan cafe     : " + keanggotaan);
        System.out.println(
                String.format("Item Pembelian %s Kopi %s Teh %s Roti", jumlahkopi,jumlahroti,jumlahteh));
        System.out.println("nominal bayar Rp  : " + nominalInt);
        if (keanggotaan == 'Y' || keanggotaan == 'y') {
            System.out.println("Anda mendapatkan Potongan Harga sebesar  Rp : " + (int) discountPrice);
        }
    }
}
