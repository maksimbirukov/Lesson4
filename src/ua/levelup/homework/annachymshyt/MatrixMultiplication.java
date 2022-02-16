package ua.levelup.homework.annachymshyt;


public class MatrixMultiplication{

    public static void main(String[] args){
        int l = 4;
        int n = 5;
        int m = 3;

        int [][] matrix1 = fillMatrix(l, m);
        int [][] matrix2 = fillMatrix(m, n);


        printMatrix(matrix1);
        System.out.println();
        printMatrix(matrix2);

        System.out.println();
        int [][] multiplication = multiply(matrix1, matrix2); // matrix multiplication
        printMatrix(multiplication);

    }

    // function to fill the matrix with random numbers
    static int[][] fillMatrix(int lines, int columns){
        int [][] array= new int[lines][columns];

        for(int i = 0; i<lines; i++){
            for(int j = 0; j<columns; j++){
                array[i][j] = (int)(Math.random()*10);
            }
        }
        return array;
    }
    // function to multiply two matrices
    static int [][] multiply(int [][] matrix1, int [][]matrix2){
        int [][] multiplication = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i<matrix1.length; i++){
            for(int r = 0; r< matrix1[0].length; r++){
                for(int j =0; j < matrix2[0].length; j++){
                    multiplication[i][j] += matrix1[i][r]*matrix2[r][j];
                }
            }
        }

        return multiplication;
    }
    // function to print the matrix
    static void printMatrix(int [][] matrix){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
