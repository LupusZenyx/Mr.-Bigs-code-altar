import java.util.Scanner;
public class usbstick {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter USB size in GB: ");
            int usbSize = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter USB speed in MB/s: ");
            int usbSpeed = Integer.parseInt(scanner.nextLine());

            double fillTimeSeconds = (usbSize * 1000.0) / usbSpeed;
            double fillTimeMinutes = fillTimeSeconds / 60.0;
            double fillTimeHours = fillTimeMinutes / 60.0;

            fillTimeSeconds = Math.round(fillTimeSeconds * 100.0) / 100.0;
            fillTimeMinutes = Math.round(fillTimeMinutes * 100.0) / 100.0;
            fillTimeHours = Math.round(fillTimeHours * 100.0) / 100.0;

            System.out.println("It will take " + fillTimeSeconds + " seconds (" + (usbSize * 8000.0 / usbSpeed) + " Mbps) to fill the USB.");
            System.out.println("It will take " + fillTimeMinutes + " minutes (" + (usbSize * 8000.0 / usbSpeed / 60.0) + " Mbps) to fill the USB.");
            System.out.println("It will take " + fillTimeHours + " hours (" + (usbSize * 8000.0 / usbSpeed / 3600.0) + " Mbps) to fill the USB.");
            scanner.close();
        }
}

    

