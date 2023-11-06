/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan01;

import java.util.Scanner;

/**
 *
 * @author junaaprys._
 */
public class tugasMatriks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

System.out.print("Masukkan Jumlah Baris: ");
int baris = scan.nextInt();
System.out.print("Masukkan Jumlah Kolom: ");
int Kolom = scan.nextInt(); 
int matrix[][] = new int[baris][Kolom];

for (int index = 0; index < matrix.length; index++) {
     for (int j = 0; j < matrix[index].length; j++) {
         System.out.print("Masukan nilai baris "+index+1+" Kolom "+j+1+": " );
         matrix[index][j] = scan.nextInt();
     }
}

for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
          System.out.print(matrix[i][j] + ", ");
      }
      System.out.println();
} 
 }  
  }