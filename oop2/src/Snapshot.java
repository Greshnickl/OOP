import java.nio.file.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDateTime;
public class Snapshot {
    public static void main(String[] args) {
        Path currentWorkingDirectory = Paths.get(System.getProperty("user.dir"));
        Path folderPath = currentWorkingDirectory.resolve("src");
        Path filePath = folderPath.resolve("LastSnapshot.txt");
        try {
            BufferedWriter writer = Files.newBufferedWriter(filePath, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            LocalDateTime currentTime = LocalDateTime.now();
            writer.write(""+currentTime);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

