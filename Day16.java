import java.util.Scanner;
public class Day16 {
    public static void main(String[] args) {
        System.out.print("Masukkan Nilai : ");
        Scanner userInput = new Scanner(System.in);
        double d1 = userInput.nextDouble();
        System.out.print("Ceiling  =" + Math.ceil(d1));
        double d2 = userInput.nextDouble();
        System.out.print("Floor  =" + Math.floor(d2));        
 }
    
}


