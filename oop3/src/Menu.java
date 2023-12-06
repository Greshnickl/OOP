import java.util.Scanner;

public class Menu {
    private String option = "";
    private Options operationHandler = new Options();
    private Scanner scanner = new Scanner(System.in);

    public void printOperations() {
        System.out.println("1. aus - Array Up Stack");
        System.out.println("2. ads - Array Down Stack");
        System.out.println("3. lls - Linked List Stack");
        System.out.println("4. auq - Array Up Queue");
        System.out.println("5. adq - Array Down Queue");
        System.out.println("6. llq - Linked List Queue");
        System.out.println("7. q - Quit");
        System.out.print(">>> ");
    }

    public int getCapacity() {
        System.out.print("Capacity: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void execOperations() {
        while (!option.equals("q")) {
            printOperations();
            option = scanner.nextLine();

            // Implement a switch case for operations with stack/queue
            switch (option) {
                case "aus":
                    int capacity = getCapacity();
                    operationHandler.arrayUpStackHandler(capacity);
                    break;
                case "ads":
                    capacity = getCapacity();
                    operationHandler.arrayDownStackHandler(capacity);
                    break;
                case "lls":
                    capacity = getCapacity();
                    operationHandler.stackLinkListHandler(capacity);
                    break;
                case "auq":
                    capacity = getCapacity();
                    operationHandler.arrayUpQueueHandler(capacity);
                    break;
                case "adq":
                    capacity = getCapacity();
                    operationHandler.arrayDownQueueHandler(capacity);
                    break;
                case "llq":
                    capacity = getCapacity();
                    operationHandler.queueLinkListHandler(capacity);
                    break;
            }
        }
        scanner.close();
    }
}
