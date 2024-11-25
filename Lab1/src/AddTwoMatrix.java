import java.util.Random;

public class AddTwoMatrix {
    public static void main(String args[]) {
        int[][] matrix1 = {{90, 19, 41}, {10, 95, 57}}; // 2x3 matrix
        int[][] matrix2 = {{30, 99, 86}, {70, 45, 16}}; // 2x3 matrix
        
        int[][] sumMatrix = new int[2][3];
        
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[0].length; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
