package pl.andrzejrawski.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class IOFile {
    public static void main(String[] args) {
        String separator = File.separator;
        File file = new File ("H:" + separator + "Java\\Projekty\\src\\pl\\andrzejrawski\\IO\\abc.txt");
        System.out.println(file.exists());

        try {
            List<String> lines = Files.readAllLines(Paths.get("H:\\Java\\Projekty\\src\\pl\\andrzejrawski\\IO\\abc.txt"), Charset.defaultCharset());
            for (String str: lines){
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter("H:\\Java\\Projekty\\src\\pl\\andrzejrawski\\IO\\efg.txt",true);
            writer.write("Hello!");
            writer.write("\r\n");
            writer.write("How are You?");
            writer.write("\r\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
