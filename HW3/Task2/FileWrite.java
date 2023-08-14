package HW3.Task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public void writeFile(String filePath) throws IOException, ClassNotFoundException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Привет, мир!");
            writer.close();
            System.out.println("Данные записаны в файл.");
            FileRead readTextFormat = new FileRead();
            readTextFormat.read(filePath);

        } catch (IOException e) {
            System.out.println("Произошла ошибка при создании файла.");
            e.printStackTrace();
        }
    }
}