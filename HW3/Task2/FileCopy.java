package HW3.Task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class FileCopy {

    public void fileCopy(String path) throws IOException {
        try {
            File source = new File(path);
            FileCreation fileCreation = new FileCreation();
            String newFilePath = fileCreation.createFile();
            File dest = new File(newFilePath);

            FileCopy fc = new FileCopy();
            fc.copyFile(source, dest);

            FileRead fileRead = new FileRead();
            fileRead.read(newFilePath);

            System.out.println("Данные из файла: " + path + " скопированы новый файл: " + newFilePath);
        } catch (Exception e) {
            System.out.println("ошибка: " + e.getMessage());
        }
    }

    public void copyFile(File sourceFilePath, File destinationFilePath) throws FileNotFoundException, IOException {
        try (InputStream in = new FileInputStream(sourceFilePath);
                OutputStream out = new FileOutputStream(destinationFilePath)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        }
    }
}
