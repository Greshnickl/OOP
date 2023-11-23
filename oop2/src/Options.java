import java.util.Scanner;
import java.util.SortedMap;

public class Options {

    public static void directoryOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Choose option:
                1. Open working directory from variable
                2. Open working directory from printing path in console
                """);
        int sw = sc.nextInt();
        switch (sw){
            case 1:
                System.out.println("1");
                break;
            case 2:
                String directory = sc.nextLine();
                break;
        }
    }
}
