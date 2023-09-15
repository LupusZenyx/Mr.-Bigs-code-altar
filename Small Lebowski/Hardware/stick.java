import java.util.Scanner;

public class stick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("USB Size in GB: ");
        int inputSize = Integer.parseInt(scanner.nextLine());

        System.out.print("Speed of the USB in MB/s: ");
        int inputSpeed = Integer.parseInt(scanner.nextLine());

        double fillTime = (inputSize * 1000.0) / inputSpeed;
        fillTime = Math.round(fillTime * 100.0) / 100.0;

        if (fillTime > 60) {
            fillTime = fillTime / 60.0;
            fillTime = Math.round(fillTime * 100.0) / 100.0;
            System.out.println("It will take " + fillTime + " minutes to fill the USB");
        } else {
            System.out.println("It will take " + fillTime + " seconds to fill the USB");
        }

        scanner.close();
    }
}