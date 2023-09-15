import java.util.Scanner;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
public class hello_world {

        public static void main(String[] args) throws IOException, URISyntaxException{
                double num1;
                double num2;
                String operator;
                double result;
                String link = "https://youtube.com/v/dQw4w9WgXcQ?t=0"; 
                try {
                try (Scanner scan = new Scanner(System.in)) {
                        System.out.println("Number 1");
                        num1 = scan.nextDouble();

                        System.out.println("Operator (+, -, /, *)");
                        operator = scan.next();

                        System.out.println("Number 2");
                        num2 = scan.nextDouble();
                }
                        if (operator.equals("+")) {
                        result = num1 + num2;
                } else if (operator.equals("-")) {
                        result = num1 - num2;
                } else if (operator.equals("*")) {
                        result = num1 * num2;
                } else if (operator.equals("/")) {
                        if (num1 == 0) {
                                result = 0;
                                System.out.println("vscode wants to access your camera");
                                
                                Desktop.getDesktop().browse(new URI(link));
                                    
                                System.exit(0);
                        } else {
                                result = num1 / num2;
                        }
                        
                } else {
                        System.out.println("Bruder wtf");
                        
                        Desktop.getDesktop().browse(new URI(link));
                            
                        System.exit(0);
                        result = 0;
                }


                
                System.out.println(result);        
                 } catch (Exception e) {
                        Desktop.getDesktop().browse(new URI(link));
                        System.out.println("Bruder was hast du getan?");
                        
                } 
                
        }

}
