import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String givenString = input.nextLine();
        String[] stringArr = givenString.split("");
        int count = 0;
        boolean is_dangerous = false;

        for (int i = 0; i < stringArr.length -1; i++){
            if (stringArr[i].equals(stringArr[i+1])) {
                count++;
            } else{
                count = 0;
            }

            if (count == 6) {
                is_dangerous = true;
                break;
            }
        }

        if (is_dangerous) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

        input.close();
    }
}