/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipeData;

import java.util.Scanner;
public class day33{

 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  int a,b,n,total;
  total=0;
  Scanner keyboard=new Scanner(System.in);
  System.out.print("Masukkan n=");
  n=keyboard.nextInt();
  for(a=1;a<=n;a++){
   System.out.print("Bilangan ke"+a+"=");
   b=keyboard.nextInt();
   total=total+b;
  }
  System.out.println("Total bilangan inputan="+total);
  keyboard.close();
 }

}
