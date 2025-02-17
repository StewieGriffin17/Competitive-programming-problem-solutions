import java.util.Scanner;

public class bitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput = Integer.parseInt(sc.nextLine());
        
        int number = 0;
        
        for(int i = 0; i < userInput; i++){
            String operation = sc.nextLine().toLowerCase();
            if (operation.equals("++x") || operation.equals("x++")){
                number++;
            }
            else if (operation.equals("x--") ||operation.equals("--x")){
                number--;
            } else{
                System.out.println("Invalid Input!");
                break;
            }
        }
        System.out.println(number);
        sc.close();
    }
}
