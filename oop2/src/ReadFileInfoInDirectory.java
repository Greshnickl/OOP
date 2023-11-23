import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class ReadFileInfoInDirectory {







    public static void print(String directoryPath){
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(directoryPath))) {
            for (Path path : directoryStream) {
                BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
                System.out.println(path.getFileName() + " | LastModified: " + attributes.lastModifiedTime());
            }
        } catch (IOException | DirectoryIteratorException e) {
            e.printStackTrace();
        }
    }
}
