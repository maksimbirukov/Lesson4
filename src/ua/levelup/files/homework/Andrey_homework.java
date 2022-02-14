package ua.levelup.files.homework;

import java.util.Arrays;

public class Andrey_homework {

        public static void main(String[] args) {
            int l = 3;
            int n = 4;
            int m = 2;
            fillMatrix(l, n);

            int[][] firstMatrix = fillMatrix(l, m);
            int[][] secondMatrix = fillMatrix(m, n);

            System.out.println(Arrays.deepToString(matrixMultiplication(firstMatrix, secondMatrix)));

        }

        public static int[][] fillMatrix(int lines, int columns) {
            if (lines == 0 || columns == 0) {
                throw new IllegalArgumentException();
            }
            int[][] matrix = new int[lines][columns];
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = (int) (Math.random() * 10);
                }
            }
            return matrix;
        }

        public static int[][] matrixMultiplication(int[][] firstMatrix, int[][] secondMatrix) {
            if (firstMatrix[0].length != secondMatrix.length){
                throw new IllegalArgumentException();
            }
            int[][] processedMatrix = new int[firstMatrix.length][secondMatrix[0].length];
            for (int i = 0; i < firstMatrix.length; i++) {
                for (int r = 0; r < firstMatrix[0].length; r++) {
                    for (int j = 0; j < secondMatrix[0].length; j++) {
                        processedMatrix[i][j] += firstMatrix[i][r] + secondMatrix[r][j];
                    }
                }
            }

            return processedMatrix;
        }

    }
