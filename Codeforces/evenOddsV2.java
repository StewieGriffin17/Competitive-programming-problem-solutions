import java.util.Scanner;

public class evenOddsV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long number = input.nextLong();
        long index = input.nextLong();
        input.close();

        long oddCount = (number + 1) / 2;

        if(index <= oddCount){
            System.out.println(2 * index - 1);
        } else {
            System.out.println(2 * (index - oddCount));
        }
    }
}
