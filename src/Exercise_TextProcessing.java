import java.util.Scanner;

public class Exercise_TextProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(", ");

        for (String username : data) {
            boolean isValid = true;
            if (username.length() >= 3 && username.length() <= 16) {
                for (int i = 0; i < username.length(); i++) {
                    char symbol = username.toLowerCase().charAt(i);
                    if (symbol < 97 || symbol> 122)  {
                       if(!(symbol == 45 || symbol == 95))
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid){
                System.out.println(username);
            }
        }

    }
}