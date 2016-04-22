package BukuTamu;
import java.util.Scanner;
public class BukuTamuMain {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int x=0;
        int y=1;
        do{
            System.out.println("======= BUKU TAMU =======");
            System.out.print("Masukkan nama: ");
            String a= in.next();
            Bukutamu.nama(a, x);
            System.out.print("Masukkan alamat: ");
            String b = in.next();
            Bukutamu.alamat(b, x);
            Bukutamu.tampil();
            x++;
            System.out.print("Ingin menambahkan lagi? (y/n)");
            String c = in.next();
            if(c.equalsIgnoreCase("n"))
                y=0;            
        }while (y!=0);
    }
}
