import java.util.Scanner;

public class hq9plus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String givenString = input.nextLine();

        if (givenString.contains("H") || givenString.contains("Q") || givenString.contains("9")) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

        input.close();
    }
}
