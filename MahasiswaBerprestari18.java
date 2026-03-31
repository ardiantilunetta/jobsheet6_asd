public class MahasiswaBerprestari18 {
    Mahasiswa18 [] listMhs;
    int idx;

    MahasiswaBerprestari18(int n){
        listMhs = new Mahasiswa18[n];
        idx = 0;
    }

    void tambah (Mahasiswa18 m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
            System.out.println("---------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa18 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i=0 ; i<listMhs.length-1 ; i++) {
            int idxmin = i;
            for (int j=i+1 ; j<listMhs.length ; j++) {
                if (listMhs[j].ipk<listMhs[idxmin].ipk) {
                    idxmin = j;
                }
            }
            Mahasiswa18 tmp = listMhs[idxmin];
            listMhs[idxmin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i=1 ; i<listMhs.length ; i++) {
            Mahasiswa18 temp = listMhs[i];
            int j = i;
            while (j>0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
