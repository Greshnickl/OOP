import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String workingDirectory = "C:\\Users\\Greshnick\\Desktop\\fileTest";
        ReadFileInfoInDirectory.printFiles(workingDirectory);
        System.out.println(Snapshot.lastCommitTime(workingDirectory));
        Options.directoryOption(workingDirectory);


    }
}
