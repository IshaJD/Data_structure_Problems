public class palindromeArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 1, 6 };
        System.out.println(isPalindrome(arr));
    }

    // time complexity-O(n/2)
    public static boolean isPalindrome(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                // checking frist and last values
                return false;
            }
        }
        return true;
    }
}