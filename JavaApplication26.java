/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.util.Scanner;

/**
 *
 * @author andk
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        String namaSiswa;
        int noAbsen, nilaiUlangan, jumlahBenar, totalNilai, point;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Nama Siswa : ");
        namaSiswa = input.nextLine();
        
        System.out.print("No. Absen : ");
        noAbsen = input.nextInt();
        
        System.out.print("Point per nomor : ");
        point = input.nextInt();
        
        System.out.print("Jumlah benar : ");
        jumlahBenar = input.nextInt();
        
        totalNilai = point* jumlahBenar;
        System.out.println("Nilai Ulangan : " +totalNilai);
        
        if(totalNilai < 75){
            System.out.println("Nilai tidak memenuhi KKM, maka anda akan mengikuti REMEDIAL");
        
        }
        else if (totalNilai >= 75){
            System.out.print("Selamat nilai memenuhi KKM, maka anda tidak mengikuti REMEDIAL");
        }
        
    }
    
    }
    
 
