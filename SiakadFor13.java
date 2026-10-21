import java.util.Scanner;
public class SiakadFor13{
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        for (int i = 1; i <= 10; i++){
            System.out.print("Masukan nilai mahasiswa ke-"+ i +": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
            if (nilai >= 60){
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: "+ tertinggi);
        System.out.println("Nilai terendah: "+ terendah);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);
    }
}