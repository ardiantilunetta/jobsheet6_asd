public class Dosen18 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen18(String kd, String name, Boolean jk, int age) {
    this.kode = kd;
    this.nama = name;
    this.jenisKelamin = jk;
    this.usia = age;
}

    void tampil(){
        System.out.println("Kode : "+kode);
        System.out.println("Nama : "+nama);
        System.out.println("Jenis Kelamin : "+(jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia : "+usia);
        System.out.println("----------------------------------");
    }
}
