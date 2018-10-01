

/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Gaji Karyawan
 */

import java.util.Scanner;


public class IF310117110Latihan17ProgramTunjangan {

    public static void main(String[] args) {



        
        float Gaji;
        float tunjangan;
        float totalGaji;
        Scanner scan = new Scanner(System.in);

        String Status;
        
        System.out.println("=============Program Tunjangan================");
        System.out.print("Berapa gaji pokok anda perbulan? :Rp. ");
        Gaji = scan.nextInt();
        
        System.out.print("Status anda? (Menikah/Belum) : ");
        Status = scan.next();
        
        if(Status.equalsIgnoreCase("Menikah")){
         //Proses tunjangan
        tunjangan = (float) (Gaji * 0.35);
        totalGaji = tunjangan + Gaji;
        }else{
            tunjangan = 0 ;
            totalGaji = Gaji;
        }

        
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("--------Hasil Perhitungan Gaji Anda--------------");
        System.out.println("Gaji Pokok\t: " +Gaji);
        System.out.println("Tunjangan\t: " +tunjangan);
        System.out.println("Total Gaji\t: " +totalGaji);
        System.out.println("Developed by: Fauzi Sunarya");
        
       
        
        
       
        




    }
    
}

        
       
     
