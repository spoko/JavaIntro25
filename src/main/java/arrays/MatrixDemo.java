package arrays;

public class MatrixDemo {

    public static void main(String[] args) {
        int [][] matrix = {
                {4, 67, 3453, 2222, 345},
                {6, 333, 3333345},
                {89999, 2323}
        };

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.printf("Element in position %d%d is %d%n", i, j, matrix[i][j]);
            }
        }
    }
}
