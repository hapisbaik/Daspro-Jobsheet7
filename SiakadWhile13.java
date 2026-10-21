import java.util.Scanner;
public class SiakadWhile13 {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int i = 0,jml,nilai;
        System.out.print("Masukan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml){
            System.out.print("Masukan nilai mahasiswa ke-"+ (i+1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100){
                System.out.println("Nilai tidak valid. Masukan lagi nilai yang valid!");
                continue;
            }

            if (nilai > 80 && nilai <= 100){
                System.out.println("Nilai mahasiswa ke-"+ (i+1) + " adalah A");
            } else if (nilai > 73 && nilai <= 80){
                System.out.println("Nilai mahasiswa ke-"+ (i+1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73){
                System.out.println("Nilai mahasiswa ke-"+ (i+1) + " adalah B");
            } else if (nilai > 60 && nilai <= 65){
                System.out.println("Nilai mahasiswa ke-"+ (i+1) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60){
                System.out.println("Nilai mahasiswa ke-"+ (i+1) + " adalah C");
            } else if (nilai > 39 && nilai <= 50){
                System.out.println("Nilai mahasiswa ke-"+ (i+1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-"+ (i+1) + " adalah E");
            }
            i++;
        }
    }
}
