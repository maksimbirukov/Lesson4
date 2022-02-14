package ua.levelup.files;

import java.util.Arrays;

public class MatrixMul {

    public static void main(String[] args) {

        int l = 3; //Count of lines for first matrix
        int n = 4; //Count of columns for second matrix
        int m = 2; //Count of columns for first matrix and count of lines for second

        //Fill with random values matrix1 (l x m)
        int[][] matrix1 = fillMatrix(l, m);
        //Fill with random values matrix2 (m x n)
        int[][] matrix2 = fillMatrix(m, n);

        // Here we need to have new matrix as result of multiplying matrix1 and matrix2
        int[][] matrixMul = matrixMul(matrix1, matrix2);

        System.out.println(Arrays.deepToString(matrixMul));
    }

    static int[][] fillMatrix(int lines, int columns) {
        if (lines <= 0 || columns <= 0) {
            throw new IllegalArgumentException("not valid size for array with count of lines =" + lines + " and count of columns = " + columns);
        }
        int[][] matrix = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 11);
            }
        }

        return matrix;
    }

    public static int[][] matrixMul(int[][] matrix1, int[][] matrix2) {
        //TODO Implement here your logic

        return new int[matrix1.length][];
    }
}
