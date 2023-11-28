import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String workingDirectory = "C:\\Users\\Greshnick\\Desktop\\fileTest";
        ReadFileInfoInDirectory.printFiles(workingDirectory);
        Options.directoryOption(workingDirectory);


    }
}
