package ua.com.javarush.kkushka.ave2.Decoder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

import static ua.com.javarush.kkushka.ave2.Coder.Coder.coder;


public class DeCoderFile {

    public static void deCoderFile(int key) {
        Path pathToFileForCoder = Path.of("src/ua/com/javarush/kkushka/ave2/Coder/FileforCoder.txt").toAbsolutePath();
        Path pathToFileForDeCedor = Path.of("src/ua/com/javarush/kkushka/ave2/Decoder/Decoderfile.txt").toAbsolutePath();

        try (FileReader fileReader = new FileReader(pathToFileForCoder.toFile());
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(pathToFileForDeCedor.toFile())) {

            while (bufferedReader.ready()) {
                String text = bufferedReader.readLine();
                fileWriter.write(coder(text, -key));
                fileWriter.flush();
            }
            System.out.println("Ваш файл расшифрован. Он находится в файле  - Decoderfile.txt");
        } catch (IOException e) {
        }
    }
}
