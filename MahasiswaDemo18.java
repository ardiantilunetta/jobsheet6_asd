import java.util.Scanner;

public class MahasiswaDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jml = 5;
        
        MahasiswaBerprestari18 list = new MahasiswaBerprestari18();


        for (int i = 0; i < jml; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i+1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            list.tambah(new Mahasiswa18(nim, nama, kelas, ipk));
        }

        // list.tampil();
        System.out.println("--------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan IPK Mahasiswa yang Dicari : ");
        double cari = sc.nextDouble();

        // System.out.println("Menggunakan Sequential Searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int)posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        System.out.println("Menggunakan Binary Search");
        double posisi2 = list.findBinarySearch(cari, 0, jml-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}