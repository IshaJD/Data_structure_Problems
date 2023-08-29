public class minRotatedArray {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 0, 1, 2 };
        int result = findMin(arr);
        System.out.println("min = " + result);
    }

    public static int findMin(int arr[]) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < arr[mid - 1])
                return arr[mid];
            else if (arr[low] < arr[mid] && arr[mid] > arr[high]) {
                // left part is sorted
                low = mid + 1;
            } else {
                high = low - 1;
            }

        }
        return arr[low];
    }
}
