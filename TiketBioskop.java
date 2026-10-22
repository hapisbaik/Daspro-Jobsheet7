import java.util.Scanner;
public class TiketBioskop{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        final int hargaTiket = 50000;
        int totalTiketHariIni = 0;
        double totalPendapatanHariIni = 0;
        
        System.out.println("=== Program Penghitung Penjualan Tiket Bioskop ===");
        System.out.println("Masukan jumlah tiket per transaksi.");
        System.out.println("Masukan angka negatif untuk mengabaikan input.");
        System.out.println("Masukan 0 untuk menghentikan program.\n");

        while(true){
            System.out.print("Masukkan jumlah tiket(0 untuk keluar): ");
            int jumlahTiket = input.nextInt();
            if(jumlahTiket == 0){
                break;
            }
            if(jumlahTiket < 0){
                System.out.println("Input tidak valid. Silahkan masukan jumlah tiket yang benar.\n");
                continue;
            }
            double diskon = 0;
            if(jumlahTiket > 10){
                diskon = 0.15;
            } else if (jumlahTiket > 4){
                diskon = 0.10;
            }
            double hargaTotalTransaksi = jumlahTiket * hargaTiket;
            double jumlahDiskon = hargaTotalTransaksi * diskon;
            double hargaBayar = hargaTotalTransaksi - jumlahDiskon;

            totalTiketHariIni += jumlahTiket;
            totalPendapatanHariIni += hargaBayar;
            System.out.println("Diskon yang didapat: "+ (int)(diskon *100) + "%");
            System.out.println("Total bayar transaksi ini: Rp "+(int)hargaBayar);
            System.out.println("-----------------------------");
        }
            System.out.println("\n==========================");
            System.out.println("REKAPITULASI PENJUALAN TIKET BIOSKOP");
            System.out.println("============================");
            System.out.println("Total tiket terjual: " + totalTiketHariIni + "tiket");
            System.out.println("Total Pendapatan: Rp "+ (long)totalPendapatanHariIni);
            System.out.println("=============================");

            input.close();
    }
}