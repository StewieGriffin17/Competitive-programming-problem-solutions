/* You are given a rectangular board of M × N squares. Also you are given an unlimited number of standard domino pieces of 2 × 1 squares. You are allowed to rotate the pieces. You are asked to place as many dominoes as possible on the board so as to meet the following conditions:
1. Each domino completely covers two squares.
2. No two dominoes overlap.
3. Each domino lies entirely inside the board. It is allowed to touch the edges of the board.
Find the maximum number of dominoes, which can be placed under these restrictions.
*/

import java.util.Scanner;

public class aDominoPiling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n= input.nextInt();
        
        int area = m*n;
        int domino = area/2;

        System.out.println(domino);

        input.close();
    }
}
