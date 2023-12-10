import java.util.Scanner;

public class Menu {

    public static void printOperations() {
        System.out.println("1. aus - Array Up Stack");
        System.out.println("2. ads - Array Down Stack");
        System.out.println("3. lls - Linked List Stack");
        System.out.println("4. auq - Array Up Queue");
        System.out.println("5. adq - Array Down Queue");
        System.out.println("6. llq - Linked List Queue");
        System.out.println("7. q - Quit");
        System.out.print(">>> ");
    }

    public static int getCapacity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Capacity: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void execOperations() {
        Scanner scanner = new Scanner(System.in);
        String option = " ";
        while (!option.equals("q")) {
            printOperations();
            option = scanner.nextLine();

            // Implement a switch case for operations with stack/queue
            switch (option) {
                case "aus":
                    int capacity = getCapacity();
                    Options.arrayUpStackHandler(capacity);
                    break;
                case "ads":
                    capacity = getCapacity();
                    Options.arrayDownStackHandler(capacity);
                    break;
                case "lls":
                    capacity = getCapacity();
                    Options.stackLinkListHandler(capacity);
                    break;
                case "auq":
                    capacity = getCapacity();
                    Options.arrayUpQueueHandler(capacity);
                    break;
                case "adq":
                    capacity = getCapacity();
                    Options.arrayDownQueueHandler(capacity);
                    break;
                case "llq":
                    capacity = getCapacity();
                    Options.queueLinkListHandler(capacity);
                    break;
            }
        }
    }
}
