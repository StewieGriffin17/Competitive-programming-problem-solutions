import java.util.Scanner;

public class wordCapitalization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String givenString = input.nextLine();

        char firstLatter = Character.toUpperCase(givenString.charAt(0));
        
        StringBuilder result = new StringBuilder();
        result.append(firstLatter);
        for (int i = 1; i < givenString.length(); i++){
            result.append(givenString.charAt(i));
        }

        System.out.println(result.toString());
        input.close();
    }
}
