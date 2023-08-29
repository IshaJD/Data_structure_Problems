public class minPlatforms {
    public static void main(String[] args) {
        // find min platforms
        double arr[] = { 9.00, 9.10, 9.40, 9.50 };
        double dep[] = { 9.10, 12.00 };
        int result = minPlatform(arr, dep);
        System.out.println(" result = " + result);
    }

    public static int minPlatform(double arr[], double dep[]) {
        int n1 = arr.length;
        int n2 = dep.length;
        int i = 0, j = 0;
        int plat = 0, max = 0;
        while (i < n1 && j < n2) {
            if (arr[i] < dep[j]) {
                plat++;
                i++;
            } else {
                plat--;
                j++;
            }
            if (max < plat)
                max = plat;
        }
        return plat;

    }
}
