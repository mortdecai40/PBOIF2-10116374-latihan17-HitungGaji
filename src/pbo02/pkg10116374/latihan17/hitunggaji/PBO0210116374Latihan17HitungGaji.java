package pbo02.pkg10116374.latihan17.hitunggaji;
import java.util.Scanner;


/** @author
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk melakukan Proses perhitungan gaji
 *
 */

public class PBO0210116374Latihan17HitungGaji {
     public static double hitungTunjangan(double gaji_pokok, String status){
        double tunjangan;
        
         if("Menikah".equals(status)){
            tunjangan = gaji_pokok * 0.35;
        }else{
            tunjangan = 0;
        }
        return tunjangan;
    }
  
    public static double total(double gaji_pokok, String status){
        double total = gaji_pokok + hitungTunjangan(gaji_pokok, status);
        return total;
    }
    
    public static void output(double gaji_pokok, String status, double tunjangan){
        System.out.println("==============Hasil Perhitungan Gaji Anda==============");
        System.out.println("Gaji Pokok     : " + gaji_pokok);
        System.out.println("Tunjangan      : " + hitungTunjangan(gaji_pokok, status));
        System.out.println("Total          : " + total(gaji_pokok, status));
       
    }

    public static void main(String[] args) {
        // TODO code application logic here
        double gaji_pokok;
        double tunjangan = 0;
        String status;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan?  : Rp. ");
        gaji_pokok = input.nextInt();
        System.out.print("Status Anda? (Menikah/Belum)      : ");
        status = input.next();
        
        output(gaji_pokok, status, tunjangan);
       
    }
    
}
