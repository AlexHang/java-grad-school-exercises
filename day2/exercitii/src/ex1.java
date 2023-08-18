import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ex1 {

    public static int[][] matrixSum(int[][]m1, int[][]m2){
        int[][] result = new int[3][3];
        for(int i =0; i<3; i++){
            for(int j=0; j<3; j++){
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    public static int[][] matrixProduct(int[][]m1, int[][]m2){
        int[][] result = new int[3][3];
        for(int i =0; i<3; i++){
            for(int j=0; j<3; j++){
                result[i][j] = 0;
                for(int k = 0; k <3; k++)
                    result[i][j] += m1[i][k] * m2[k][j];
            }
        }
        return result;
    }

    public static void displayMatrix(int[][] matrix){
        for(int i =0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int matrixSize = 3;
        int[][] a = {
                {4,1,2},
                {3,4,6},
                {2,7,5}
        };
        int[][] b = {
                {9,1,2},
                {3,4,5},
                {7,1,2}
        };
        ex1.displayMatrix(ex1.matrixSum(a,b));
        ex1.displayMatrix(ex1.matrixProduct(a,b));
    }
}