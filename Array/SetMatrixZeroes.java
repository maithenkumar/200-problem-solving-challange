// https://leetcode.com/problems/set-matrix-zeroes/description/

import java.util.ArrayList;
import java.util.Arrays;

class SetMatrixZeroes {

    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 0, 2 }, { 1, 3, 1, 5 } };
        System.out.println(Arrays.toString(setZeroes2(matrix)));
    }
//optimal solution 
    public static int[][] setZeroes2(int[][] matrix) {
        ArrayList<Integer> i=new ArrayList<>();
        ArrayList<Integer> j=new ArrayList<>();
        for (int j2 = 0; j2 < matrix.length; j2++) {
            for (int k = 0; k < matrix[j2].length; k++) {
                if(matrix[j2][k]==0){
                    i.add(j2);
                    j.add(k);

                }
            }
        }
        for (int j2 = 0; j2 < i.size(); j2++) {
            set1(matrix, i.get(j2), j.get(j2));
        }

            return matrix;
    }
    //Brute force 
    public static int[][] setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    set1(matrix, i, j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1) {

                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        return matrix;
    }

    private static void set1(int[][] matrix, int i, int j) {
        for (int j2 = 0; j2 < matrix[i].length; j2++) {
            if (matrix[i][j2] != 0) {
                matrix[i][j2] = 0;
            }
        }
        for (int j2 = 0; j2 < matrix.length; j2++) {
            if (matrix[j2][j] != 0) {
                matrix[j2][j] = 0;

            }
        }
    }
}
