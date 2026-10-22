import java.util.Scanner;
public class HitungParkir13 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int jenis = 0, durasi = 0, total = 0;

        do{
            System.out.print("Masukkan jenis (1 mobil, 2 motor, 0 keluar): ");
            jenis = input.nextInt();

            if(jenis == 1 || jenis == 2){
                System.out.print("Masukkkan durasi (jam): ");
                durasi = input.nextInt();
                if(jenis == 1){
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            }
        } while (jenis !=0);
        System.out.println("Output total: Rp "+ total);
        input.close();
    }
}
