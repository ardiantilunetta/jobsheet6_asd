import java.util.Scanner;

public class DosenMain18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen18 data = new DataDosen18();

        int pilih;
        do {
            System.out.println("====== MENU DATA DOSEN ======");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting umur ASC - Bubble Sort");
            System.out.println("4. Sorting umur DSC - Selection Sort");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("====== Tambah Data Dosen ======");
                    System.out.print("Kode Dosen   : ");
                    String kd = sc.nextLine();

                    System.out.print("Nama         : ");
                    String nama = sc.nextLine();

                    System.out.print("Jenis Kelamin (L = 1, P = 0): ");
                    int jk = sc.nextInt();

                    System.out.print("Usia         : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen18 d = new Dosen18(kd, nama, jk == 1, usia);
                    data.tambah(d);
                    break;

                case 2:
                    System.out.println("\n=== DATA DOSEN ===");
                    data.tampil();
                    break;

                case 3: 
                    data.bubbleSortASC();
                    System.out.println("\nData setelah Sorting ASC (Bubble Sort):");
                    data.tampil();
                    break;

                case 4:
                    data.selectionSortDSC();
                    System.out.println("\nData setelah Sorting DESC (Selection Sort):");
                    data.tampil();
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    break;

            }

            System.out.println();

        } while (pilih != 0);

        sc.close();
    }
}
