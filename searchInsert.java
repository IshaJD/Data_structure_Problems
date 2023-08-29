
public class searchInsert {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 };
        int res = searchInsertPos(arr, 5);
        System.out.println("result = " + res);
    }

    public static int searchInsertPos(int arr[], int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;

        }
        return low;
    }
}
