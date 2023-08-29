
public class movingZeroes {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 0, 1, 0, 7, 8 };
        System.out.println("Array after moving zeroes : ");
        moveZero(arr);

    }

    public static void moveZero(int arr[]) {
        int n = arr.length;
        int i = 0, j = i + 1;
        while (j < n) {
            if (arr[i] == 0 && arr[j] != 0) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j++;

            } else if (arr[i] == 0 && arr[j] == 0)
                j++;
            else {
                i++;
                j++;
            }

        }
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2] + " ");
        }
    }
}
