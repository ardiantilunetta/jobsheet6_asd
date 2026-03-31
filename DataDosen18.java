public class DataDosen18 {
    Dosen18[] dataDosen18 = new Dosen18[10];
    int idx = 0;

    void tambah(Dosen18 dsn) {
        if (idx < dataDosen18.length) {
            dataDosen18[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    void tampil() {
        for (int i=0 ; i<idx ; i++) {
            dataDosen18[i].tampil();
        }
    }

    //Bubble Sort ASC (Usia)
    void bubbleSortASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen18[j].usia < dataDosen18[j - 1].usia) {
                    Dosen18 temp = dataDosen18[j];
                    dataDosen18[j] = dataDosen18[j - 1];
                    dataDosen18[j - 1] = temp;
                }
            }
        }
    }

    //Selection Sort DSC (Usia)
    void selectionSortDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxmax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen18[j].usia > dataDosen18[idxmax].usia) {
                    idxmax = j;
                }
            }
            Dosen18 temp = dataDosen18[i];
            dataDosen18[i] = dataDosen18[idxmax];
            dataDosen18[idxmax] = temp;
        }
    }

    //Insertion Sort DSC (Usia)
    void insertionSortDSC() {
        for (int i = 1; i < idx; i++) {
            Dosen18 temp = dataDosen18[i];
            int j = i;
            while (j > 0 && dataDosen18[j - 1].usia < temp.usia) {
                dataDosen18[j] = dataDosen18[j - 1];
                j--;
            }
            dataDosen18[j] = temp;
        }
    }

}
