
package pbo10119012latihan17pbo;


import java.util.Scanner;

/**
 *
 * @author damai
 * NAMA    : DAMAI SAPUTRA LAOLI
 * KELAS   : IF-1
 * NIM     : 10119012
 */
public class PBO10119012Latihan17pbo {

   
    public static void main(String[] args) {
       double gaji_pokok, tunjangan, totalgaji;

        System.out.print("===========Program Tunjangan===========\n");
        System.out.print("Berapa Gaji pokok anda perbulan : ");
        Scanner scanner = new Scanner(System.in);
        gaji_pokok = scanner.nextInt();
        System.out.print("Status anda? (Menikah/Belum) : ");
        String status = scanner.next();
        tunjangan = (status.equals("menikah") || status.equals("Menikah"))?0.35*gaji_pokok:0;
        totalgaji = gaji_pokok + tunjangan;
        System.out.printf("Gaji Pokok \t\t: Rp %.1f%n",gaji_pokok);
        System.out.printf("Tunjangan\t\t: Rp %.1f%n", tunjangan);
        System.out.printf("Total Gaji\t\t: Rp %.1f%n", totalgaji);
        scanner.close();

    }


}