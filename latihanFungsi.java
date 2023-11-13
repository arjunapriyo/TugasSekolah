/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan01;
import java.util.Scanner;
/**
 *
 * @author junaaprys._
 */
public class latihanFungsi {
    static void tampilNama(int id){
        String namaPelanggan[]={"ali","budi","dani","edi","umar"};
                System.out.println("namaPelanggan[id-1]");
    }
    
    static void hingTarif(int jumlahPakai){
        int harga=0;
        if(jumlahPakai >0 && jumlahPakai<10){
        jumlahPakai=10;
        harga=jumlahPakai*2000;
    }
        else if(jumlahPakai >11 && jumlahPakai<=20){
        harga=jumlahPakai*3000;
     }
          else if(jumlahPakai >21 && jumlahPakai<=30){
        harga=jumlahPakai*4000;
     }
          else if(jumlahPakai >31){
        harga=jumlahPakai*5000;
     }
        System.out.println(harga); 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean status = true;
        
        do{
            System.out.println("Masukan ID Pelanggan : ");
            int namaPelanggan = input.nextInt();
            System.out.println("ID Pelanggan : " + namaPelanggan);
            System.out.println("Nama Pelanggan : ");
            tampilNamaPelanggan(namaPelanggan);
            
            
            System.out.println("Masukan Banyak Pemakaian Air : ");
            int jumlahPakai = input.nextInt();
            System.out.println("Jumlah tarif");
            hitungTarif(jumlahPakai);
            
            System.out.println("Ingin Coba Lagi ? Y/N");
            String ulang = input.next();
            if (ulang.equalsIgnoreCase("n")){
                status = false;
            } else {
                status =  true;
            }
            } while (status);
        input.close();
    }
}
