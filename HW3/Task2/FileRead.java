package HW3.Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
 public String read(String path) throws IOException, ClassNotFoundException
    {
        FileReader fr = new FileReader(path);
        BufferedReader buff = new BufferedReader(fr);
        String str;
        System.out.println("\nВывод из файла формата .txt\n ");
        StringBuilder sb = new StringBuilder();
        while((str = buff.readLine()) != null)
        {
            sb.append(str);
            System.out.println(str);
        }
        buff.close();
        System.out.println("\nДанные считаны! ");
        return sb.toString();
    }
}