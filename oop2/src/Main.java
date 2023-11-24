import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        String workingDirectory = "C:\\Users\\Greshnick\\Desktop\\fileTest";
        System.out.println("""
                Choose option:
                1. Open working directory from variable
                2. Open working directory from printing path in console
                """);
        int sw = sc.nextInt();
        if (sw == 2){
            workingDirectory = sc1.nextLine();
        }
        ReadFileInfoInDirectory.printFiles(workingDirectory);
        //Snapshot.createSnapshot(workingDirectory);
        //System.out.println(Snapshot.checkCommit(workingDirectory));
    }
}
