
import java.util.ArrayList;
import java.util.HashSet;

public class commonElement {
    public static void main(String[] args) {
        int a[] = { 1, 5, 10, 20, 40, 80 };
        int b[] = { 6, 7, 20, 80, 100 };
        int c[] = { 3, 4, 15, 20, 30, 70, 80 };

        findCommon2(a, b, c);

    }

    public static ArrayList<Integer> findCommon1(int arr[], int brr[], int crr[]) {
        // using hashing
        int n1 = arr.length;
        int n2 = brr.length;
        int n3 = crr.length;
        int i = 0, j = 0;

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        while (i < n1) {
            hs1.add(arr[i]);
        }
        while (j < n2) {
            hs2.add(brr[j]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int k = 0; k < n3; k++) {

            if (hs1.contains(crr[k]) && hs2.contains(crr[k])) {
                ans.add(crr[k]);

            }
        }
        return ans;

    }

    public static void findCommon2(int arr[], int brr[], int crr[]) {
        int i = 0, j = 0, k = 0;
        int n1 = arr.length;
        int n2 = brr.length;
        int n3 = crr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < n1 && j < n2 && k < n3) {
            if (arr[i] == brr[j] && brr[j] == crr[k]) {
                // not repeat
                if (!ans.contains(arr[i])) {
                    ans.add(arr[i]);
                    i++;
                    j++;
                    k++;
                }
            } else if (arr[i] < brr[j] && arr[i] < crr[k]) {
                i++;
            } else if (brr[j] < arr[i] && brr[j] < crr[k]) {
                j++;
            } else {
                k++;
            }
        }
        System.out.println("common elements are : " + ans);
    }

}
