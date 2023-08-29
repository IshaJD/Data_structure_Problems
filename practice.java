import java.util.HashMap;

public class practice {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 1, 9 };
        System.out.println("result= " + func(arr, 5));
        System.out.println("maxlen= " + func2(arr, 6));
    }

    public static int func(int arr[], int target) {
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0, maxlen = 0;
        int len = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == target)
                maxlen = Math.max(maxlen, (i + 1));
            int rem = target - sum;
            if (hm.containsKey(rem)) {
                len = i - hm.get(rem);
                maxlen = Math.max(maxlen, (len + 1));
            }
            if (!hm.containsKey(sum))
                hm.put(sum, i);

        }
        return maxlen;
    }

    public static int func2(int arr[], int k) {
        int i = 0, j = 0, sum = 0;
        int n = arr.length;
        int maxlen = 0;
        while (j < n) {
            while (i <= j && sum > k) {
                sum -= arr[j];
                j++;
            }
            if (sum == k) {
                maxlen = Math.max(maxlen, j - i + 1);
            }
            j++;
            if (j < n) {
                sum += arr[j];
            }
        }
        return maxlen;
    }

}