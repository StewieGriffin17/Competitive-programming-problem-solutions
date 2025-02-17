import java.util.Scanner;

public class beautifulMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int[][] matrix = new int[5][5];
        int indexRow = 0, indexCol = 0;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                matrix[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (matrix[i][j] == 1) {
                    indexRow = i;
                    indexCol = j;
                }
            }
        }

        int requiredMoves = Math.abs(2 - indexRow) + Math.abs(2 - indexCol);
        System.out.println(requiredMoves);
        input.close();
    }
}