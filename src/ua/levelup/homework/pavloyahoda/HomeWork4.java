package ua.levelup.homework.pavloyahoda;

import java.util.Arrays;

public class HomeWork4 {
    public static void main(String[] args) {
        int l = 2;
        int n = 2;
        int m = 2;

        int[][] matrix1 = fillMatrix(l, m);
        int[][] matrix2 = fillMatrix(m, n);
//        int[][] multiMatrix = multiMatrix(l, n, m, matrix1, matrix2);

        int [][] multiMatrix = new int[l][n];
        for (int i = 0; i < l; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < m; k++){
                    multiMatrix [i][j] += matrix1 [i][k] * matrix2 [k][j]; //???
                }
            }
        }
        System.out.println(Arrays. deepToString(multiMatrix));
    }

    static int[][] fillMatrix(int line, int column) {
        int[][] matrix = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }

//    static int[][] multiMatrix(int l, int n, int m, int[][] matrix1, int[][] matrix2) {
//        int[][] multiMatrix = new int[l][n];
//        for (int i = 0; i < l; i++) {
//            for (int j = 0; j < n; j++) {
//                for (int k = 0; k < m; k++) {
//                    multiMatrix[i][j] += matrix1[i][k] * matrix2[k][j];  //???
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(multiMatrix));
//        return multiMatrix;
//    }
}
