package dz9;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@NoArgsConstructor
@Data
public class WordWriter implements Runnable {
    private LineStorage lineStorage;
    private ContentReader contentReader;
    File file3 = new File("writer2.txt");

    public WordWriter(LineStorage lineStorage, ContentReader contentReader) {
        this.lineStorage = lineStorage;
        this.contentReader = contentReader;
    }

    @Override
    public void run() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(contentReader.file))) {


            synchronized (lineStorage) {
                while (bufferedReader.readLine() != null) {
                    if (lineStorage.isBool()) {

                        try {
                            lineStorage.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    lineStorage.setBool(true);

                    try (PrintWriter printWriter = new PrintWriter(new FileWriter(file3, true))) {
                        String[] words = lineStorage.getStr().split(" ");
                        for (String word : words) {
                            printWriter.println(word);
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    lineStorage.notify();

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
