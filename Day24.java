
public class Day24 {
  public static void main(String[] args) {
        
  double n1 = 7.5, n2 = 9, n3 = 4.8;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " Bilangan terbesar.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " Bilangan terbesar.");

        else
            System.out.println(n3 + " Bilangan terbesar.");
    }
}
