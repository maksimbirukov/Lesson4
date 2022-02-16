package ua.levelup.homework;

import java.util.Arrays;
import java.util.Scanner;
public class MatrixMulHomework4 {

    public static void main(String[] args) throws IllegalAccessException {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ввести количество строк первой матрицы:");
        int l=scan.nextInt();
        System.out.println("Ввести количество столбцов матр.1 и строк матр.2:");
        int m= scan.nextInt();
        System.out.println("Ввести количество столбцов матр.2");
        int n=scan.nextInt();
        int[][] matrix1 = fillMatrix(l, m);
        int[][] matrix2 = fillMatrix(m, n);
        int[][] matrixMul = matrixMul(matrix1, matrix2);
        System.out.println(Arrays.deepToString(matrix1));
        System.out.println(Arrays.deepToString(matrix2));
        System.out.println(Arrays.deepToString(matrixMul));
    }

    static int[][] fillMatrix(int lines, int columns) throws IllegalAccessException {
        if (lines<=0 || columns<=0) {
            throw new IllegalAccessException("not valid size for array with count of lines =" + lines + " and count of columns = " + columns);
        }

        int[][] matrix=new int[lines][columns];
        for (int i=0; i<lines; i++){
            for (int j=0; j<columns; j++){
                matrix[i][j]=(int)(Math.random()*11);
            }
        }
        return matrix;
    }
    public static int[][] matrixMul(int[][]matrix1, int[][]matrix2) {
        int mat1i=matrix1.length;
        int mat1j=matrix1[0].length;
        int mat2j=matrix2[0].length;
        int[][] matrix = new int [mat1i][mat2j];
        for (int i=0; i<mat1i; i++){
            for(int j=0; j<mat2j; j++){
                for (int k=0; k<mat1j; k++){
                    matrix[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        return matrix;
    }
}
