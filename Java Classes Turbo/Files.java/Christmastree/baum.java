import java.util.Scanner;

public class baum {
    public static void main(String[] args) {
        
        // Tree Characters
        String star = "\033[33m*\033[0m";
        String slash = "\033[32m/\033[0m";
        String backslash = "\033[32m\\\033[0m";
        String dot = "\033[32m.\033[0m";
        String bracket = "\033[38;2;102;51;0m[_]\033[0m";

        Scanner input = new Scanner(System.in);
        System.out.println("Input Tree Lenght: ");
        int sinput = input.nextInt();
        int lenght = sinput / 2;
        input.close();

        for (int i = 1; i <= lenght; i++) {
            System.out.print(" ");
        }
        System.out.println(star);
        for (int i = 1; i <= lenght; i++) {
            for (int j = 1; j <= lenght - i; j++) {
                System.out.print(" ");
            }
            System.out.print(slash);

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(dot);
            }
            System.out.println(backslash);
            for (int j = 1; j <= lenght - i; j++) {
                System.out.print(" ");
            }
            System.out.print(slash);

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(dot);
            }
            System.out.println(backslash);
  
        } 
        

        for (int i = 1; i <= lenght - 1; i++) {
            System.out.print(" ");
        }
        System.out.println(bracket);



    }
}