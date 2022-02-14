package ua.levelup.files.homework;

import java.util.Arrays;

public class aleksandrmikhail_homework4 {
    public static void main(String[] args) {
        int l = 2;
        int m = 5;
        int n = 3;

        int[][] matrix1 = fillMatrix(l, m);
        int[][] matrix2 = fillMatrix(m, n);
        int[][] matrix3 = mulMatrix(matrix1, matrix2);
        System.out.println(Arrays.deepToString(matrix1));
        System.out.println(Arrays.deepToString(matrix2));
        System.out.println(Arrays.deepToString(matrix3));
    }

    static int[][] fillMatrix(int lines, int colums) {

        int[][] arr = new int[lines][colums];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < colums; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        return arr;
    }


    static int[][] mulMatrix(int[][] matrix1, int[][] matrix2){
        int l = matrix1.length;
        int m = matrix2[0].length;

        int[][] matrix3 = new int[l][m];

        for (int i = 0; i <l; i++) {
            for (int j = 0; j <m; j++) {
                for (int r = 0; r < m; r++) {
                    matrix3[i][j] += matrix1[i][r] * matrix2[r][j];
                }
            }
        }
        return matrix3;

    }
}
