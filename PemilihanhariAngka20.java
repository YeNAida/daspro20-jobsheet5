import java.util.Scanner;

/**
 * PemilihanhariAngka20
 */
public class PemilihanhariAngka20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayType;
        byte dayNumber;
        System.out.println("Input day Number 1-7");
        System.out.println("Input day number: ");

        dayNumber = sc.nextByte();
        dayType = "";
        if (dayNumber >= 1 && dayNumber <= 5) 
            {dayType = "Weekday";}
        else if (dayNumber >=6 && dayNumber<=7 )
            {dayType = "Weekend";}
        else {
            dayType = "Invalid Number!";
        }
        System.out.println(dayNumber+" is a"+dayType);     
        } 

        
    }
