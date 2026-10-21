import java.util.Scanner;
public class SiakadFor13{
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        for (int i = 1; i <= 10; i++){
            System.out.print("Masukan nilai mahasiswa ke-"+ i +": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
        }
        System.out.println("Nilai tertinggi: "+ tertinggi);
        System.out.println("Nilai terendah: "+ terendah);
    }
}