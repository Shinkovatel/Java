package Homework.homework3;

public class add { // сортировка слиянием

    public static void main(String[] args) {

        int[] a = { 2, 9, 5, 4, 8, 1, 6 };
        mergeSort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void mergeSort(int[] a) {
        int n = a.length;
        if (n == 1)
            return; //

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++)
            l[i] = a[i];

        for (int i = mid; i < n; i++)
            r[i - mid] = a[i];

        mergeSort(l);
        mergeSort(r);
        mergeSort(a, r, l);
    }

    private static void mergeSort(int[] a, int[] r, int[] l) {
        int left = l.length;
        int right = r.length;
        int i = 0;
        int j = 0;
        int idx = 0;

        while (i < left && j < right) {
            if (l[i] < r[j]) {
                a[idx] = l[i];
                i++;
                idx++;
            } else {
                a[idx] = r[j];
                j++;
                idx++;
            }
        }
        for (int ll = i; ll < left; ll++)
            a[idx++] = l[ll];

        for (int rr = j; rr < right; rr++)
            a[idx++] = r[rr];
    }
}
