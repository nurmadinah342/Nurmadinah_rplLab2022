import java.util.Scanner;
public class Day34 {
   public static void main(String[] args) {
   int sisi;
   double luas;
   Scanner scan = new Scanner(System.in);
   System.out.println("Menghitung Luas Persegi ");
   System.out.print("Masukan Sisi: ");
   sisi = scan.nextInt();
   luas = (sisi*sisi);
   System.out.println("Luas Segi = " +luas);
    }
}

