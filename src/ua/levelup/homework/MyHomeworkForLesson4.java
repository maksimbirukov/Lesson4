package com.company;
import java.util.Arrays;

public class MyHomeworkForLesson4 {
    public static void main(String[] args) {
        int l = 3;
        int n = 4;
        int m = 2;


        int[][] matrix1 = fillMatrix(l, m);
        int[][] matrix2 = fillMatrix(m, n);


        System.out.println(Arrays.deepToString(matrix1));
        System.out.println(Arrays.deepToString(matrix2));

        int[][] multiMatrix = multiplayMatrix(matrix1,matrix2);
        for(int i = 0; i<multiMatrix.length; i++){
            for(int j = 0; j<multiMatrix[0].length; j++){
                System.out.print(multiMatrix[i][j] + " ");
            }
            System.out.println();
        }
      //  System.out.println(Arrays.toString(multiplayMatrix(matrix1, matrix2)));
    }

    private static int[][] fillMatrix(int lines, int colums) {

        int[][] array = new int[lines][colums];

        // Initializing array
        for (int i = 0; i < lines; i++)
            for (int j = 0; j < colums; j++)
                array[i][j] = (int) (Math.random() * 10);


        return array;
    }
    public static int [][] multiplayMatrix( int matrix1[][], int matrix2 [][]) {
        int l = matrix1.length;
        int m = matrix1[0].length;
        int n = matrix2[0].length;

        int[][] matrix3 = new int[l][n];
            for (int i = 0; i < l; i++) {
            for (int r = 0; r < m; r++) {
                for (int j = 0; j < n; j++) {
                    matrix3[i][j] += matrix1[i][r] * matrix2[r][j];


                }
            }
        }
        return matrix3;

    }
}








