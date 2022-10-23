
import java.util.Scanner;


public class Day7 {

    public static void main(String[] args) {
//        double nilai = 85.6;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai = ");
        double nilai = sc.nextDouble();
        
        if (nilai > 86 && nilai <= 100) {
            System.out.println("A");
        } else if (nilai > 76 && nilai <= 85) {
            System.out.println("B");
        } else if (nilai > 67 && nilai <= 75) {
            System.out.println("C");
        } else if (nilai > 56 && nilai <= 65) {
            System.out.println("D");
        } else if (nilai > 0 && nilai <= 55) {
            System.out.println("E");
        } else if (nilai > 100) {
            System.out.println("Nilai tdk di temukan");
        }
    }
}
