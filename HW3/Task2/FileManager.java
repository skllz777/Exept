package HW3.Task2;

// Задача 2: Файловый менеджер (ООП, исключения)

// Создайте класс FileManager. Этот класс должен иметь методы для выполнения основных операций с файлами: чтение, запись и 
// копирование. Каждый из этих методов должен выбрасывать соответствующее исключение, если в процессе выполнения операции произошла 
// ошибка (например, FileNotFoundException, если файл не найден)

import java.io.IOException;

public class FileManager {
    public void fileManager() {

        FilePath filePath = new FilePath();
        FileCopy fileCopy = new FileCopy();
        String path = filePath.getPathToFile();
        
        FileCreation fileCreation = new FileCreation(); 
        try {
            String newFileName = fileCreation.createFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            fileCopy.fileCopy(path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        FileRead fileRead = new FileRead();
        try {
            fileRead.read(path);
        } catch (ClassNotFoundException | IOException eх) {
            System.out.println(eх.getMessage());
        }

        FileWrite fileWrite = new FileWrite();
        try {
            fileWrite.writeFile("C:/GB/Programmer/Exception/HW/HW3/Task2");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } catch (ClassNotFoundException exception2) {
            System.out.println(exception2.getMessage());
        }
    }
}
