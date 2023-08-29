import java.util.ArrayList;

public class sumOfSubsets {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);

        ArrayList<Integer> ans = sos(arr, arr.size());
        System.out.println(ans);

    }

    public static ArrayList<Integer> sos(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> ans = new ArrayList<>();
        func(arr, ans, 0, 0, N);
        return ans;
    }

    public static void func(ArrayList<Integer> arr, ArrayList<Integer> ans, int idx, int sum, int n) {
        if (idx == n) {
            ans.add(sum);
            return;
        } else {
            func(arr, ans, idx + 1, sum + arr.get(idx), n);
            func(arr, ans, idx + 1, sum, n);
        }
    }
}
