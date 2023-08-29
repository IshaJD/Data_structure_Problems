import java.util.ArrayDeque;
import java.util.Deque;

class maxSlidingWindow {
    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        printArray(maxWindow2(arr, 3));
        System.out.println();
        printArray(maxWindow1(arr, 3));
    }

    public static int[] maxWindow2(int[] a, int k) {
        int n = a.length;
        int ri = 0;
        int result[] = new int[n - k + 1];
        Deque<Integer> q = new ArrayDeque<>();
        // iterate over the Array
        for (int i = 0; i < n; i++) {
            // remove the out of bound elements
            while (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }
            // remove the element
            while (!q.isEmpty() && a[q.peek()] < a[i]) {
                q.poll();
            }
            // add the current idx
            q.offer(i);
            // store maximum of each subarray
            if (i > k - 1) {
                result[ri++] = a[q.peek()];
            }
        }
        return result;
    }

    public static int[] maxWindow1(int[] a, int k) {
        int n = a.length;
        int ri = 0;
        int[] output = new int[n - k + 1];
        for (int i = 0; i < n - k + 1; i++) {
            // go to each subarray
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                // calculate max
                max = Math.max(max, a[j]);
                output[ri++] = max;
            }
        }
        return output;
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}