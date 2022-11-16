/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipeData;
import java.util.Scanner;

public class day31 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  double a,phi,r,t,V;
  a=0.3;
  phi=3.14;
  Scanner input=new Scanner(System.in);
  System.out.print("Masukkan jari-jari = ");
  r=input.nextInt();
  System.out.print("Masukkan tinggi = ");
  t=input.nextInt();
  V=a*phi*r*r*t;
  System.out.print("Volume kerucut = "+V);
  input.close();
 }

}
