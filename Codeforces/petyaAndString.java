import java.util.Scanner;

public class petyaAndString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstString = input.nextLine().toLowerCase();
        String secondString = input.nextLine().toLowerCase();

        int result = firstString.compareTo(secondString);
        if (result > 0) {
            System.out.println(1);            
        }
        else if (result < 0){
            System.out.println(-1);
        } else{
            System.out.println(0);
        }
        
        input.close();
    }
}
