import java.io.File;
public class FileList {
    String folderPath;
    File folder;
    FileList(String folderPath){
        this.folderPath = folderPath;
        this.folder = new File(folderPath);
    }

    public void print() {
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();

            if (files.length != 0) {
                System.out.println("Files in a folder:");
                for (File file : files) {
                    if (file.isFile()) {
                        String fileName = file.getName();
                        System.out.println(fileName);
                    }
                }
            } else {
                System.out.println("Folder is empty");
            }
        } else {
            System.out.println("Folder does not exists or it is not folder");
        }
    }
}
