import java.util.Scanner;

public class ArrayLearning {

    public int findLargeNumber(int[] ary) {
        if(ary.length == 0) {
            System.out.println("Array is Empty");
            return 0;
        }
        int largeNumber = ary[0];
        for (int i = 1 ; i<ary.length ; i++){
            if(largeNumber<ary[i]) {
                largeNumber = ary[i];
            }
        }
        return largeNumber;
    }
    public int findSmallNumber(int[] ary) {
        if(ary.length == 0) {
            System.out.println("Array is Empty");
            return 0;
        }
        int smallNumber = ary[0];
        for (int i = 1 ; i<ary.length ; i++){
            if(smallNumber>ary[i]) {
                smallNumber = ary[i];
            }
        }
        return smallNumber;
    }
    public int[] ReverseArray (int[] ary) {
        if(ary.length == 0) {
            System.out.println("Array is Empty");
            return new int[0];
        }
        int temp;
        int i = 0;
        int j = ary.length -1;
        while (i<j) {
            temp = ary[i];
            ary[i] = ary[j];
            ary[j] = temp;

            i++;
            j--;
        }
        return ary;
    }

    int[][] Adding2DArrays (int[][] ary1, int[][] ary2) {
        if (ary1.length != ary2.length || ary1[0].length != ary2[0].length
              || ary1 == null || ary2 == null) {
            throw new IllegalArgumentException("Either arrays are empty or arrays are not in same size");
        }
        int[][] sum = new int[ary1.length][ary1[0].length];
        for(int i = 0 ; i<ary1.length ; i++) {
            for (int j = 0 ; j<ary1[0].length ; j++){
                sum[i][j] = ary1[i][j] + ary2[i][j];
            }
        }
        return sum;
    }

    int[][] TransposeOfMatrix (int[][] ary){
        if(ary.length == 0 || ary == null)
            throw new IllegalArgumentException("Either arrays are empty or arrays are not in same size");

        int[][] transposeAry = new int[ary[0].length][ary.length];
        for(int i = 0 ; i<ary.length ; i++) {
            for (int j = 0 ; j<ary[0].length ; j++){
                transposeAry[j][i] = ary[i][j];
            }
        }
        return transposeAry;
    }

    public static void main (String[] arg) {
        int[] num = new int[10];

        Scanner scanner = new Scanner(System.in);
//        The enhanced for-loop (or for-each loop) in Java is generally
//        used for reading or accessing data, not for modifying it.
//        for (int i : num) {
//            System.out.println("Enter value:");
//            i = scanner.nextInt();  // This changes the local copy of i, not the array element.
//        }

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter value:");
            num[i] = scanner.nextInt();
        }

        for (int i : num) {
            System.out.println(i);
        }

        ArrayLearning arrayLearning = new ArrayLearning();
        int numA[] = {-1,25,5,1,9,2,1,2,3,3};

        System.out.println(arrayLearning.findLargeNumber(numA));
        System.out.println(arrayLearning.findSmallNumber(numA));
        for(int i : arrayLearning.ReverseArray(numA)) {
            System.out.print(i+ ",");
        }

        int[][] ary1 = {{1,2,3},{4,5,8}};
        int[][] ary2 = {{1,2,3},{1,2,3}};
//        int[][] sum = arrayLearning.Adding2DArrays(ary1,ary2);
        int[][] sum = arrayLearning.TransposeOfMatrix(ary1);

        for(int i = 0 ; i<sum.length ; i++) {
            for (int j = 0 ; j<sum[0].length ; j++){
                System.out.print(sum[i][j] + ", ");
            }
            System.out.print("\n");
        }

    }
}
