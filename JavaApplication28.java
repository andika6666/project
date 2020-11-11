/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

import java.util.Scanner;

/**
 *
 * @author andk
 */
public class JavaApplication28 {

 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int harga;
        int jumlah;
        int diskon;
        int total;
        
        Scanner input = new Scanner(System.in);
        System.out.println("TOKO LAPTOP");
        System.out.println("- - - - - - - ");
        
        System.out.print("Harga Produk : Rp. ");
        harga = input.nextInt();
    
        System.out.print("Jumlah Beli  : ");
        jumlah = input.nextInt();
        total = jumlah* harga;
       
        if (total>=7500000){
            diskon = total*15/100;
            total = total - diskon;
            System.out.print("Anda mendapatkan diskon 15% sehingga total menjadi : Rp." +total);
            
    } else if (total<=5000000) {
        total = total*5/100; 
        System.out.print("Anda mendapatkan diskon 5% sehingga total menjadi : Rp." +total);
    }
    }
}