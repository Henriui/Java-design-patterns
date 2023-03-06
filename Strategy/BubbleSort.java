package Strategy;

public class BubbleSort implements ISort {
    public int[] sort(int[] arr) {
        int temp = 0;

        int n = arr.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (arr[i] > arr[k]) {
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }

        }
        return arr;
    }
}
