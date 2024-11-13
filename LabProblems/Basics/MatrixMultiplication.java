package LabProblems.Basics;

// Write a Java program to multiply two given matrices.

import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int r1,r2,c1,c2,MatA[][],MatB[][],Result[][];
        System.out.print("Enter the Number of Rows of the First Matrix: ");
        r1 = src.nextInt();
        System.out.print("Enter the Number of Columns of the First Matrix: ");
        c1 = src.nextInt();
        System.out.print("Enter the Number of Rows of the Second Matrix: ");
        r2 = src.nextInt();
        System.out.print("Enter the Number of Columns of the Second Matrix: ");
        c2 = src.nextInt();
        if(c1 != r2)
            System.out.println("Matrix Multiplication is not possible since Columns of First Matrix is not equal to Rows of Second Matrix!");
        else {
            System.out.println("Enter the First Matrix: ");
            MatA = new int[r1][c1];
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++)
                    MatA[i][j] = src.nextInt();

            }
            System.out.println("Enter the Second Matrix: ");
            MatB = new int[r2][c2];
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++)
                    MatB[i][j] = src.nextInt();

            }
            src.close();
            Result = new int[r1][c2];
            for(int i=0; i<r1; i++){
                for(int j=0; j<c2; j++){
                    Result[i][j] = 0;
                    for(int k=0; k<c1; k++)
                        Result[i][j] += MatA[i][k] * MatB[k][j];
                }
            }
            System.out.println("Resultant Matrix is: ");
            for(int[] rows: Result){
                for(int columns: rows)
                    System.out.print(columns + " ");
                System.out.println();
            }
        }
    }
}
