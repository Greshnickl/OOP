import java.io.File;

public class List {
    public static void main(String[] args) {
        // Путь к папке, файлы в которой вы хотите вывести
        String folderPath = "C:\\Users\\Greshnick\\Desktop\\fileTest";

        File folder = new File(folderPath);

        // Проверяем, существует ли папка
        if (folder.exists() && folder.isDirectory()) {
            // Получаем список файлов в папке
            File[] files = folder.listFiles();

            if (files != null) {
                System.out.println("Названия файлов и их расширения:");

                // Проходим по каждому файлу и выводим его имя и расширение
                for (File file : files) {
                    if (file.isFile()) {
                        String fileName = file.getName();
                        System.out.println(fileName);
                    }
                }
            } else {
                System.out.println("Папка пуста или нет доступа к файлам");
            }
        } else {
            System.out.println("Указанная папка не существует или это не папка");
        }
    }
}
