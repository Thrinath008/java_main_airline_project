package thrianth.java_main_airline_project.models;

import java.io.*;

public class fileMange {


    public static void main(String[] args) {
        String path = "C:\\Users\\lakshmi ramesh\\OneDrive\\Desktop\\jaavvvvvaaaaaprojectdemooooo\\demooooflight\\src\\text.txt";

        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("hello mawa");
            bufferedWriter.close();
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!= null){
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

