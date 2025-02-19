import java.util.ArrayList;
import java.util.Scanner;

public class evenOdds {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        int index = input.nextInt();

        ArrayList<Long> oddNumbers = new ArrayList<>();
        ArrayList<Long> evenNumbers = new ArrayList<>();
        
        for (long i = 1; i <= number; i++){
            if (i % 2 != 0) {
                oddNumbers.add(i);
            } else {
                evenNumbers.add(i);
            }
        }

        ArrayList<Long> mergedArray = new ArrayList<>(oddNumbers);
        mergedArray.addAll(evenNumbers);

        System.out.println(mergedArray.get(index - 1));
        
        input.close();
    }
}