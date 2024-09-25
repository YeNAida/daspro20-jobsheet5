import java.util.Scanner;
public class KafeYola20 {
    public static void main(String[] args) {
     Scanner utill = new Scanner(System.in);  
        boolean keanggotaan;
        int jumlahkopi,jumlahteh,jumlahroti;
        double hargakopi= 12000.0,hargateh=7000.0,hargaroti=20000.0,totalharga,nominalbayar;
        float diskon = 10/100f;

        System.out.println("Masukkan keanggotaan ye  ");
        keanggotaan = utill.nextBoolean();
        System.out.println("Masukkan jumlah pembelian kopi: ");
        jumlahkopi = utill.nextInt();
        System.out.println("Masukkan jumlah pembelian teh: ");
        jumlahteh = utill.nextInt();
        System.out.println("Masukkan jumlah pembelian roti: ");
        jumlahroti = utill.nextInt();

        totalharga = (jumlahkopi*hargakopi) + (jumlahteh*hargateh)+(jumlahroti*hargaroti);

        nominalbayar = totalharga - (diskon*totalharga);

        System.out.println("Kegotaan pelanggan "+keanggotaan );
        System.out.println("Item pembelian"+jumlahkopi+ "kopi"+jumlahteh+"teh"+jumlahroti+"roti");
        System.out.println("Nominal bayar:"+nominalbayar);



    }
}
