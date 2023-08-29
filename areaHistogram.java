import java.util.Stack;

public class areaHistogram {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3, 1 };
        System.out.println("MAXIMUM AREA = " + area(arr));
        System.out.println("MAXIMUM AREA= " + area1(arr));
    }

    // tc=O(n^2)
    public static int area(int[] a) {
        int n = a.length;
        int leftsmaller = Integer.MAX_VALUE;
        int rightsmaller = Integer.MAX_VALUE;
        int area = 0;
        int maxarea = 0;
        // iterate through the Array
        for (int i = 0; i < n; i++) {
            // calculate left smaller
            for (int j = 0; j < i; j++) {
                leftsmaller = Math.min(leftsmaller, a[j]);
            }
            // calculate right smaller
            for (int j = i + 1; j < n; j++) {
                rightsmaller = Math.min(rightsmaller, a[j]);
            }
            area = a[i] * (rightsmaller - leftsmaller + 1);
            maxarea = Math.max(maxarea, area);
        }
        return maxarea;
    }

    // tc=O(n)
    public static int area1(int arr[]) {
        int n = arr.length;
        int leftsmaller[] = new int[n];
        int rightsmaller[] = new int[n];
        Stack<Integer> s = new Stack<>();
        // for leftsmaller
        for (int i = 0; i < n; i++) {
            // if incoming height is smaller
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            // if nothing is left in satck then boundary is 0
            if (s.isEmpty())
                leftsmaller[i] = 0;
            else
                leftsmaller[i] = s.peek() + 1;

            s.push(i);

        }
        // for rightsmaller
        // clear stack
        while (!s.isEmpty()) {
            s.pop();
        }
        for (int i = n - 1; n >= 0; n--) {

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            // if nothing is left in satck then boundary is 0
            if (s.isEmpty())
                rightsmaller[i] = n - 1;
            else
                rightsmaller[i] = s.peek() - 1;

            s.push(i);

        }
        int area = 0;
        int maxarea = 0;
        for (int i = 0; i < n; i++) {
            area = arr[i] * (rightsmaller[i] - leftsmaller[i] + 1);
            maxarea = Math.max(maxarea, area);
        }
        return maxarea;
    }

}
