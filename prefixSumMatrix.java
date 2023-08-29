import java.util.Scanner;

public class prefixSumMatrix {
        public static void main(String[] args) {
                System.out.println("ENTER THE MATRIX: ");
                int matrix[][] = new int[4][4];
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[0].length; j++) {
                                matrix[i][j] = sc.nextInt();
                        }
                }
                System.out.println("ENTER THE NUMBER OF QUERIES ");
                int q = sc.nextInt();

                while (q != 0) {
                        System.out.println("ENTER THE ROW1: ");
                        int r1 = sc.nextInt();
                        System.out.println("ENTER THE COL1: ");
                        int c1 = sc.nextInt();
                        System.out.println("ENTER THE ROW2: ");
                        int r2 = sc.nextInt();
                        System.out.println("ENTER THE COL2: ");
                        int c2 = sc.nextInt();
                        PrefixSumMatrix(matrix, r1, c1, r2, c2);
                        System.out.println(SumRegion(matrix, r1, c1, r2, c2));
                        q--;
                }
                sc.close();
        }

        public static void PrefixSumMatrix(int arr[][], int r1, int c1, int r2, int c2) {
                // row wise traversing
                int m = arr.length;// rows
                int n = arr[0].length;// cols
                for (int i = 0; i < m; i++) {
                        for (int j = 1; j < n; j++) {
                                arr[i][j] += arr[i][j - 1];
                        }
                }
                // traverse col-wise
                for (int j = 0; j < n; j++) {
                        for (int i = 1; i < m; i++) {
                                arr[i][j] += arr[i - 1][j];
                        }

                }
        }

        public static int SumRegion(int arr[][], int r1, int c1, int r2, int c2) {
                int up = 0, left = 0, result = 0, repeated = 0;
                int sum = arr[r2][c2];
                // give values according to u
                up = arr[r1 - 1][c2];
                left = arr[r2][c1 - 1];
                repeated = arr[r1 - 1][c1 - 1];
                result = sum - up - left + repeated;
                return result;

        }
}
