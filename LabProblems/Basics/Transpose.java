package LabProblems.Basics;

// Write a JAVA program to display transpose of a given matrix.(use arrays & for each version of for loop).

import java.util.Scanner;

class Transpose {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int rows,columns,matrix[][],transpose[][];
        System.out.print("Enter the Number of Rows: ");
        rows = src.nextInt();
        System.out.print("Enter the Number of Columns: ");
        columns = src.nextInt();
        matrix = new int[rows][columns];
        System.out.println("Enter the Matrix: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++)
                matrix[i][j] = src.nextInt();
        }
        src.close();
        transpose = new int[columns][rows];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++)
                 transpose[j][i] = matrix[i][j];
        }
        System.out.println("Transpose is: ");
        for(int[] row: transpose){
            for(int column: row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
