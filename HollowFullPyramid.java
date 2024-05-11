public class HollowFullPyramid {
    public static void main(String[] args) {
        int n=10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                if (i == n || k == 1 || k == i) {
                    System.out.print("* ");
                } 
                else {
                    System.out.print("  ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
