package ua.com.javarush.kkushka.ave2.Coder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

import static ua.com.javarush.kkushka.ave2.Coder.Coder.coder;


public class CoderFile {

    public static void coderFile(int key) {
        Path pathOfOriginalText = Path.of("src/ua/com/javarush/kkushka/ave2/Coder/FileWithText.txt").toAbsolutePath();
        Path pathToFileForCoder = Path.of("src/ua/com/javarush/kkushka/ave2/Coder/FileforCoder.txt").toAbsolutePath();

        try ( FileReader fileReader = new FileReader(pathOfOriginalText.toFile());
              BufferedReader bufferedReader = new BufferedReader(fileReader);
              FileWriter codfileWriterr = new FileWriter(pathToFileForCoder.toFile())) {

            while (bufferedReader.ready()) {
                String text = bufferedReader.readLine();
                codfileWriterr.write(coder(text, key));
                codfileWriterr.flush();
            }
            System.out.println("Ваш файл зашифрован. Он находится в файле  - FileforCoder.txt" );

        } catch (IOException e) {
        }
    }
}

