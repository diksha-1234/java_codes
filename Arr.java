import java.util.Arrays;

public class Arr {
    public static void main(String[]args)
    {
        /*1-D Array */
        int[] numbers=new int[10];
        numbers[0]=1;
        numbers[1]=5;
        numbers[3]=7;
        numbers[8]=6;
        numbers[9]=-1;
        System.out.println(numbers);
       System.out.println(Arrays.toString(numbers));
       int[]integers={1,3,7,8,9,6,0}; 
        System.out.println(Arrays.toString(integers));
        System.out.println(numbers.length);
        System.out.println(integers.length);

        /*multidimensional array */
        int[][] matrix=new int[5][4];
        matrix[4][2]=7;
        matrix[0][0]=3;
        matrix[3][3]=1;
        System.out.println(Arrays.toString(matrix));
        System.out.println(Arrays.deepToString(matrix));
        int[][][]mtx=new int [5][5][5];
        mtx[4][4][4]=3;
        mtx[2][3][1]=56;
        System.out.println(Arrays.deepToString(mtx));
        int [][] mat={{1,2,3},{4,5,6,7,8}};
        System.out.println(Arrays.deepToString(mat));




    }
}
