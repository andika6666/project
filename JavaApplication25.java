/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.util.Scanner;

/**
 *
 * @author andk
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
       
        Scanner keyboard = new Scanner(System.in);
        String[] tujuan = {"jakarta", };
        int harga1, harga2, harga3, harga4, harga5, harga6,jumlah, totalharga, totalpembayaran, kembalian;
        String jawaban, jawaban2;
        
        harga1 = 15000;
        harga2 = 20000;
        harga3 = 13000;
        harga4 = 16000;
        harga5 = 14000;
        harga6 = 17000;
        
        System.out.println("---Selamat Datang Di PT KAI Indonesia---");
        System.out.println("--pilih Tujuan Anda--");
        System.out.println("-Daftar Tujuan-");
        for (String tujuan1 : tujuan) {
            System.out.println(tujuan1);
        }
        System.out.println("<<< isikan nama tujuan >>>");
        System.out.print("Tujuan Yang Dipilih : ");
        jawaban = keyboard.nextLine();
        if (jawaban.equalsIgnoreCase("jakarta")){
            System.out.println("Jenis Kelas Kereta :");
            System.out.println("Eksekutif : Rp."+harga2);
            System.out.println("Ekonomi : Rp."+harga1);
            System.out.println("---------------------------");
            System.out.println("<<< isikan jenis kelas >>>");
            System.out.print("Jenis Kelas Yang Dipilih : ");
            jawaban2 = keyboard.nextLine();
            if (jawaban2.equalsIgnoreCase("Eksekutif")){
                System.out.print("Jumlah tiket : ");
                jumlah = keyboard.nextInt();
                System.out.println("---------------------------");
                totalharga = harga2*jumlah;
                System.out.println("Total Harga :"+totalharga);
                System.out.print("Nominal Pembayaran : Rp.");
                totalpembayaran = keyboard.nextInt();
                kembalian = totalpembayaran-totalharga;
                System.out.println("Kembalian : "+kembalian);
                System.out.println("---------------------------");
                System.out.println("--Terimakasih--");
                System.out.println("---Selamat Menikmati Perjalanan Anda---");
            }else if(jawaban2.equalsIgnoreCase("Ekonomi")){
                System.out.print("Jumlah tiket : ");
                jumlah = keyboard.nextInt();
                System.out.println("---------------------------");
                totalharga = harga1*jumlah;
                System.out.println("Total Harga :"+totalharga);
                System.out.print("Nominal Pembayaran : Rp.");
                totalpembayaran = keyboard.nextInt();
                kembalian = totalpembayaran-totalharga;
                System.out.println("Kembalian : "+kembalian);
                System.out.println("---------------------------");
                System.out.println("--Terimakasih--");
                System.out.println("---Selamat Menikmati Perjalanan Anda---");
            }else{
                System.out.println("...Pilihan Anda Tidak Tersedia...");
                
            }
        } 
        
       
            }
}
