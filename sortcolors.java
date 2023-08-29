import java.util.Arrays;

public class sortcolors {
    public static void main(String[] args) {
        int arr[] = { 2, 0, 2, 1, 1, 0 };
        System.out.println("Array before sorting : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("AFTER SORTING : ");

        sortColor(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortColor(int arr[]) {
        int n = arr.length;
        int p0 = 0, p2 = n - 1;
        int curr = 0;
        while (curr <= p2) {
            if (arr[curr] == 0) {
                swap(arr, curr, p0);
                curr++;
                p0++;
            }
            if (arr[curr] == 2) {
                swap(arr, curr, p2);
                p2--;
            } else {
                curr++;
            }

        }

    }

    public static void swap(int arr[], int i, int j) {
        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
