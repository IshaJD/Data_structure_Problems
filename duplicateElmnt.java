import java.util.ArrayList;
import java.util.List;

public class duplicateElmnt {
    public static void main(String[] args) {
        // 3approaches
        int arr[] = { 1, 2, 2, 3, 4, 5, 5 };
        duplicate1(arr);
        // System.out.println(duplicate2(arr));
        duplicate3(arr);
    }

    // time complexity=O(n^2)
    // space complexity=O(1)
    public static void duplicate1(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    System.out.println("duplicate elements=  " + arr[i]);
            }
        }

    }

    // time complexity=O(n)
    // space complexity=O(1)
    public static int duplicate2(int arr[]) {
    int n = arr.length;
    // moore algorithm
    int count = 0, max = 0, curr = 0;
    for (int i = 0; i <= n; i++) {
    if (curr == 0) {
    curr = arr[i];
    count = 1;
    }
    if (arr[i] != arr[i + 1])
    count++;
    else
    count--;

    if (count > max)
    max = count;
    }
    return max;

    }

    // optimal approach
    // time complexity=O(n)
    // space complexity=O(1)
    public static void duplicate3(int arr[]) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            int idx = Math.abs(arr[j] - 1);
            // if the number is visisted then add it in list
            if (arr[idx] < 0) {
                list.add(Math.abs(arr[j]));
            }
            arr[idx] = -arr[idx];
        }
        System.out.println(list);

    }
}
