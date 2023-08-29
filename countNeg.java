public class countNeg {
    public static void main(String[] args) {
        int[][] matrix = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
        System.out.println(" TOTAL NEGATIVES ARE = " + countNega(matrix));
    }

    public static int countNega(int arr[][]) {
        // approach 1 -- traverse all matrix and count negatives --> tc-O(n2)
        // approach 2-- go to each row and find first negative
        int count = 0;
        for (int[] row : arr) {

            int low = 0, high = row.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;

                if (row[mid] > 0)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            count += (row.length - low);
        }
        return count;
    }
}
