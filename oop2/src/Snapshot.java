import java.nio.file.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.stream.Stream;
import java.io.BufferedReader;


public class Snapshot {


    public static String lastCommitTime(String workingDirectory){
        Path directoryPath = Path.of(workingDirectory);
        String files = "";
        try (Stream<Path> paths = Files.walk(directoryPath)){

        } catch (IOException e){
            e.printStackTrace();
        }
        return ""+directoryPath;
    }


    public static boolean checkCommit(String workingDirectory) {
        Path directoryPath = Paths.get("C:\\Users\\Greshnick\\Desktop\\OOP\\oop2\\Snapshots");
        try (Stream<Path> paths = Files.walk(directoryPath)) {
            return paths.filter(Files::isRegularFile)
                    .anyMatch(path -> {
                        try (BufferedReader reader = Files.newBufferedReader(path)) {
                            String firstLine = reader.readLine();
                            return firstLine != null && firstLine.equals(workingDirectory);
                        } catch (IOException e) {
                            e.printStackTrace();
                            return false;
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


    public static void createSnapshot(String workingDirectory) {
        long fileCount = 0;
        Path currentWorkingDirectory = Paths.get(System.getProperty("user.dir"));
        Path folderPath = currentWorkingDirectory.resolve("Snapshots");
        try {
            fileCount = Files.walk(folderPath).filter(Files::isRegularFile).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path filePath = folderPath.resolve(fileCount+".txt");
        try {
            BufferedWriter writer = Files.newBufferedWriter(filePath, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            LocalDateTime currentTime = LocalDateTime.now();
            writer.write(workingDirectory);
            writer.newLine();
            writer.write("" + currentTime);
            writer.close();
            System.out.println("Snapshot created at time: " + currentTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

