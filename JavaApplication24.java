/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author andk
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner input = new Scanner (System.in);
        String nama, jenisKelamin, agama, alamat;
        int nis;
        System.out.print("Nama    : ");
        nama = input.nextLine();
        
        System.out.print("Jenis Kelamin  : ");
        jenisKelamin = input.nextLine();
        
        System.out.print("Agama    : ");
        agama = input.nextLine();
        
        System.out.print("Alamat   : ");
        alamat = input.nextLine();
        
        System.out.print("Masukkan NIS: ");
        nis = input.nextInt();
        
        System.out.println(" ");
        System.out.println("         KARTU PELAJAR        ");   
        System.out.println("       SMK TELKOM MALANG      ");
        System.out.println("Jl. Danau Ranau, Sawojajar, Kedungkandang\n" + "Malang 65139");
        System.out.println("- - - - - - - - - -");
        System.out.println("Nama: "+nama);
        System.out.println("NIS: "+nis );
        System.out.println("Jenis kelamin "+jenisKelamin);
        System.out.println("agama "+agama);
        System.out.println("alamat "+alamat);
     
        
        
        
        
        
        
        
                
    }
    
}
    
    

