public class SortingMain18 {

    public static void main(String[] args) {
        int a[] = {20,10,2,7,12};
        int b[] = {30,20,2,8,14};
        int c[] = {40,10,4,9,3};
        Sorting18 dataurut1 = new Sorting18(a, a.length);
        Sorting18 dataurut2 = new Sorting18(b, b.length);
        Sorting18 dataurut3 = new Sorting18(c, c.length);
        System.out.println("Data awal 3");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();    
    }
}
