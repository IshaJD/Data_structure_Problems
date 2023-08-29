import java.util.*;

public class Majority {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(major2(arr, 7));
        System.out.println(major1(arr));
        System.out.println(major3(arr));
    }

    public static int major1(int arr[]) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > (n / 2))
                return arr[i];
        }
        return -1;
    }

    public static int major2(int arr[], int n) {
        int el = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            } else if (el == arr[i])
                cnt++;
            else
                cnt--;
        }
        // check if stored element is majority or no
        // getting its count
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el)
                cnt1++;
        }
        if (cnt1 > (n / 2))
            return el;
        return -1;
    }

    // using hashmap
    public static int major3(int arr[]) {
        int n = arr.length;
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }

            if (hm.get(arr[i]) > n / 2)
                ans = arr[i];

        }
        return ans;

    }
}