import java.util.Arrays;
import java.util.Scanner;

public class helpfulMaths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String givenString = input.nextLine();

        givenString = givenString.replaceAll("[^0-9+]", "");
        String[] numberString = givenString.split("\\+");
        int[] number = new int[numberString.length];

        for (int i = 0; i < numberString.length; i++){
            number[i] = Integer.parseInt(numberString[i]);
        }

        Arrays.sort(number);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number.length; i++){
            result.append(number[i]);
            if ( i < number.length - 1) {
                result.append("+");
            }
        }

        System.out.println(result.toString());
        input.close();
    }
}
