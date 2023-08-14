package HW3.Task2;

import java.io.File;
import java.io.IOException;

public class FileCreation {
    public String createFile() throws IOException {

        String fileName = "data.txt";
        File file = new File(fileName);
        if (file.createNewFile()) {
            System.out.println("Файл создан: " + file.getName());
        } else {
            System.out.println("Такой файл уже существует.");
        }
        return fileName;
    }
}