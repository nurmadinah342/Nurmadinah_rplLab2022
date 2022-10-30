
//import required classes and packages   
import java.util.Scanner;

public class Day14 {

    //main method starts   
    public static void main(String args[]) {
        //declare and initialize balance, withdraw, and deposit  
        int balance = 100000, withdraw, deposit;

        //create scanner class object to get choice of user  
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Mesin Anjungan Tunai Mandiri");
            System.out.println("No.1 untuk Penarikan");
            System.out.println("No.2 untuk Deposit");
            System.out.println("No.3 untuk Cek Saldo");
            System.out.println("No.4 Keluar");
            System.out.print("Pilih operasi yang ingin Anda lakukan:");

            //get choice from user  
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Masukkan uang yang akan ditarik:");

                    //get the withdrawl money from user  
                    withdraw = sc.nextInt();

                    //check whether the balance is greater than or equal to the withdrawal amount  
                    if (balance >= withdraw) {
                        //remove the withdrawl amount from the total balance  
                        balance = balance - withdraw;
                        System.out.println("Silakan kumpulkan uang Anda");
                    } else {
                        //show custom error message   
                        System.out.println("Saldo Tidak Cukup");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Masukkan uang yang akan disetorkan:");

                    //get deposite amount from te user  
                    deposit = sc.nextInt();

                    //add the deposit amount to the total balanace  
                    balance = balance + deposit;
                    System.out.println("Uang Anda telah berhasil didepsi");
                    System.out.println("");
                    break;

                case 3:
                    //displaying the total balance of the user  
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;

                case 4:
                    //exit from the menu  
                    System.exit(0);
            }
        }
    }
}
