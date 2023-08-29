import java.util.Arrays;

public class rectangle {
    public static void main(String[] args) {
        // find dimensions of a rectangle of given area such that
        // l>=w
        // (l-w))=min as possible
        int area = 38;
        System.out.println(Arrays.toString(findDimension(area)));

    }

    public static int[] findDimension(int area) {

        int sqrt = (int) Math.pow(area, 0.5);
        if (sqrt * sqrt == area)
            return new int[] { sqrt, sqrt };
        int ans[] = new int[2];
        ans = sqr(ans, area, sqrt);
        return ans;
    }

    public static int[] sqr(int[] ans, int area, int sqrt) {
        if (area % sqrt == 0) {
            ans[0] = area / sqrt;
            ans[1] = sqrt;
            return ans;
        } else
            return sqr(ans, area, sqrt - 1);
    }
}
