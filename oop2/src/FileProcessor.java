import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileProcessor {

    public static void processFileInfo(String folderPath, String fileName) {
        Path directoryPath = Paths.get(folderPath);
        Path filePath = directoryPath.resolve(fileName);

        try {
            String fileExtension = getFileExtension(fileName);

            if (Files.exists(filePath)) {
                System.out.println("Information about file: " + fileName);

                System.out.println("File Name: " + fileName);
                System.out.println("File Extension: " + fileExtension);
                System.out.println("Created Date: " + Files.getAttribute(filePath, "creationTime"));
                System.out.println("Last Updated Date: " + Files.getLastModifiedTime(filePath));

                if (fileExtension != null) {
                    switch (fileExtension.toLowerCase()) {
                        case "txt":
                            processTextFile(filePath);
                            break;
                        case "png":
                        case "jpg":
                            processImageFile(filePath);
                            break;
                        case "py":
                        case "java":
                            processProgramFile(filePath);
                            break;
                        default:
                            System.out.println("General Information: File type not processed for additional details.");
                            break;
                    }
                }
            } else {
                System.out.println("File doesn't exist!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf('.');
        if (lastDotIndex > 0 && lastDotIndex < fileName.length() - 1) {
            return fileName.substring(lastDotIndex + 1);
        }
        return null;
    }

    private static void processTextFile(Path filePath) throws IOException {
        long lineCount = Files.lines(filePath).count();
        long wordCount = Files.lines(filePath)
                .flatMap(line -> Stream.of(line.split("\\s+")))
                .count();
        long charCount = Files.size(filePath);
        System.out.println("Text File Details:");
        System.out.println("Line Count: " + lineCount);
        System.out.println("Word Count: " + wordCount);
        System.out.println("Character Count: " + charCount);
    }

    private static void processImageFile(Path filePath) throws IOException {
        // Add image processing logic here
        System.out.println("Image File Details: (Image size processing logic to be added)");
    }

    private static void processProgramFile(Path filePath) throws IOException {
        // Add program file processing logic here
        System.out.println("Program File Details: (Line count, class count, method count)");
    }

    public static void main(String[] args) {
        String folderPath = "путь_к_папке"; // Укажите путь к папке
        String fileName = "имя_файла"; // Укажите имя файла

        processFileInfo(folderPath, fileName);
    }
}
