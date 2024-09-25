import java.util.Scanner;

/**
 * PemilihanSwicth20
 */
public class PemilihanSwicth20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1,angka2,hasil = 0;
        char operator;

        System.out.println("Masukkan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.println("Masukkan angka 2: ");
        angka2 = sc.nextDouble();
        System.out.println("Masukkan Operator(+/-/x/:)");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka2 - angka1;
                break;
            case 'x':
                hasil = angka1*angka2;
                break;
            case ':':
                hasil = angka2/angka1;
                break;
        }
        if  (operator=='-'||operator=='+'||operator=='*'||operator==':');
        else 
        System.out.println("Masukkan operator yang benar dan coba ulangi kembali!");
        // System.out.println(angka1+ operator +angka2+ "=" + hasil);
        System.out.println(angka1+" "+operator+" "+angka2+" "+ hasil);
    }
}
