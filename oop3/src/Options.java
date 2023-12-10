import java.util.Scanner;

public class Options {
    private String option = "";

    public static void printAvailableOperations() {
        System.out.println("1. push - Push elements");
        System.out.println("2. pop - Pop elements");
        System.out.println("3. peek - View top element");
        System.out.println("4. clear - Clear");
        System.out.println("5. b - Return back");
        System.out.print(">>> ");
    }

    public static void arrayUpStackHandler(int capacity) {
        AUS<Integer> arrayUpStack = new AUS<>(capacity);
        Scanner scanner = new Scanner(System.in);
        String option;
        do {
            printAvailableOperations();
            option = scanner.nextLine();

            switch (option) {
                case "push":
                    for (int i = 0; i < capacity; i++) {
                        System.out.print("Element: ");
                        String item = scanner.nextLine();
                        arrayUpStack.push(Integer.parseInt(item));
                    }
                    break;
                case "pop":
                    if (arrayUpStack.isEmpty()) {
                        System.out.println("Stack is empty!");
                    } else {
                        System.out.print("Items: ");
                        while (!arrayUpStack.isEmpty()) {
                            System.out.print(arrayUpStack.pop() + " ");
                        }
                        scanner.nextLine();
                    }
                    break;
                case "peek":
                    if (arrayUpStack.isEmpty()) {
                        System.out.println("Stack is empty!");
                    } else {
                        System.out.println("Top element: " + arrayUpStack.peek());
                    }
                    break;
                case "clear":
                    arrayUpStack.clear();
                    break;
                case "b":
                    break;
                default:
                    System.out.println("Invalid operation!");
                    break;
            }
        } while (!option.equals("b"));
    }

    public static void arrayDownStackHandler(int capacity) {
        ADS<Integer> arrayDownStack = new ADS<>(capacity);
        Scanner scanner = new Scanner(System.in);
        String option;
        do {
            printAvailableOperations();
            option = scanner.nextLine();

            switch (option) {
                case "push":
                    for (int i = 0; i < capacity; i++) {
                        System.out.print("Element: ");
                        String item = scanner.nextLine();
                        arrayDownStack.push(Integer.parseInt(item));
                    }
                    break;
                case "pop":
                    if (arrayDownStack.isEmpty()) {
                        System.out.println("Stack is empty!");
                    } else {
                        System.out.print("Items: ");
                        while (!arrayDownStack.isEmpty()) {
                            System.out.print(arrayDownStack.pop() + " ");
                        }
                        scanner.nextLine();
                    }
                    break;
                case "peek":
                    if (arrayDownStack.isEmpty()) {
                        System.out.println("Stack is empty!");
                    } else {
                        System.out.println("Top element: " + arrayDownStack.peek());
                    }
                    break;
                case "clear":
                    arrayDownStack.clear();
                    break;
                case "b":
                    break;
                default:
                    System.out.println("Invalid operation!");
                    break;
            }
        } while (!option.equals("b"));
    }
    public static void stackLinkListHandler(int capacity) {
        SLL<Integer> linkedListStack = new SLL<>();
        Scanner scanner = new Scanner(System.in);
        String option;
        do {
            printAvailableOperations();
            option = scanner.nextLine();

            switch (option) {
                case "push":
                    for (int i = 0; i < capacity; i++) {
                        System.out.print("Element: ");
                        String item = scanner.nextLine();
                        linkedListStack.push(Integer.parseInt(item));
                    }
                    break;
                case "pop":
                    if (linkedListStack.isEmpty()) {
                        System.out.println("Stack is empty!");
                    } else {
                        System.out.print("Items: ");
                        while (!linkedListStack.isEmpty()) {
                            System.out.print(linkedListStack.pop() + " ");
                        }
                        scanner.nextLine();
                    }
                    break;
                case "peek":
                    if (linkedListStack.isEmpty()) {
                        System.out.println("Stack is empty!");
                    } else {
                        System.out.println("Top element: " + linkedListStack.peek());
                    }
                    break;
                case "clear":
                    linkedListStack.clear();
                    break;
                case "b":
                    break;
                default:
                    System.out.println("Invalid operation!");
                    break;
            }
        } while (!option.equals("b"));
    }
    public static void arrayUpQueueHandler(int capacity) {
        AUQ<Integer> arrayUpQueue = new AUQ<>(capacity);
        Scanner scanner = new Scanner(System.in);
        String option;
        do {
            printAvailableOperations();
            option = scanner.nextLine();

            switch (option) {
                case "push":
                    for (int i = 0; i < capacity; i++) {
                        System.out.print("Element: ");
                        String item = scanner.nextLine();
                        arrayUpQueue.enqueue(Integer.parseInt(item));
                    }
                    break;
                case "pop":
                    if (arrayUpQueue.isEmpty()) {
                        System.out.println("Queue is empty!");
                    } else {
                        System.out.print("Items: ");
                        while (!arrayUpQueue.isEmpty()) {
                            System.out.print(arrayUpQueue.dequeue() + " ");
                        }
                        scanner.nextLine();
                    }
                    break;
                case "peek":
                    if (arrayUpQueue.isEmpty()) {
                        System.out.println("Queue is empty!");
                    } else {
                        System.out.println("Top element: " + arrayUpQueue.peek());
                    }
                    break;
                case "clear":
                    arrayUpQueue.clear();
                    break;
                case "b":
                    break;
                default:
                    System.out.println("Invalid operation!");
                    break;
            }
        } while (!option.equals("b"));
    }
    public static void arrayDownQueueHandler(int capacity) {
        ADQ<Integer> arrayDownQueue = new ADQ<>(capacity);
        Scanner scanner = new Scanner(System.in);
        String option;
        do {
            printAvailableOperations();
            option = scanner.nextLine();

            switch (option) {
                case "push":
                    for (int i = 0; i < capacity; i++) {
                        System.out.print("Element: ");
                        String item = scanner.nextLine();
                        arrayDownQueue.enqueue(Integer.parseInt(item));
                    }
                    break;
                case "pop":
                    if (arrayDownQueue.isEmpty()) {
                        System.out.println("Queue is empty!");
                    } else {
                        System.out.print("Items: ");
                        while (!arrayDownQueue.isEmpty()) {
                            System.out.print(arrayDownQueue.dequeue() + " ");
                        }
                        scanner.nextLine();
                    }
                    break;
                case "peek":
                    if (arrayDownQueue.isEmpty()) {
                        System.out.println("Queue is empty!");
                    } else {
                        System.out.println("Top element: " + arrayDownQueue.peek());
                    }
                    break;
                case "clear":
                    arrayDownQueue.clear();
                    break;
                case "b":
                    break;
                default:
                    System.out.println("Invalid operation!");
                    break;
            }
        } while (!option.equals("b"));
    }
    public static void queueLinkListHandler(int capacity) {
        QLL<Integer> linkedListQueue = new QLL<>();
        Scanner scanner = new Scanner(System.in);
        String option;
        do {
            printAvailableOperations();
            option = scanner.nextLine();

            switch (option) {
                case "push":
                    for (int i = 0; i < capacity; i++) {
                        System.out.print("Element: ");
                        String item = scanner.nextLine();
                        linkedListQueue.enqueue(Integer.parseInt(item));
                    }
                    break;
                case "pop":
                    if (linkedListQueue.isEmpty()) {
                        System.out.println("Queue is empty!");
                    } else {
                        System.out.print("Items: ");
                        while (!linkedListQueue.isEmpty()) {
                            System.out.print(linkedListQueue.dequeue() + " ");
                        }
                        scanner.nextLine();
                    }
                    break;
                case "peek":
                    if (linkedListQueue.isEmpty()) {
                        System.out.println("Queue is empty!");
                    } else {
                        System.out.println("Top element: " + linkedListQueue.peek());
                    }
                    break;
                case "clear":
                    linkedListQueue.clear();
                    break;
                case "b":
                    break;
                default:
                    System.out.println("Invalid operation!");
                    break;
            }
        } while (!option.equals("b"));
    }
}
