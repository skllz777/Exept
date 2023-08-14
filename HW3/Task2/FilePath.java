package HW3.Task2;

import java.io.File;

public class FilePath {
    public String getPathToFile() {
        try {
            String PathProject = System.getProperty("user.dir");
            String pathFile = PathProject.concat("/data.txt");
            File file = new File(pathFile);
            String absolutePath = file.getAbsolutePath();
            System.out.println(absolutePath);
            return absolutePath;
        } catch (Exception e) {
            System.out.println("ошибка: " + e.getMessage());
        }
        return null;
    }
}