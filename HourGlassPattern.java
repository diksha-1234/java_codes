public class HourGlassPattern {
    public static void main(String []args){
        int n=20;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
