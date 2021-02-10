package dz9;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;


@NoArgsConstructor
@Data

public class ContentPrinter implements Runnable {
    private ContentReader contentReader;
    private LineStorage lineStorage;
    File file2 = new File("writer.txt");


    public ContentPrinter(ContentReader contentReader, LineStorage lineStorage) {
        this.contentReader = contentReader;
        this.lineStorage = lineStorage;
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
                    try {
                        Thread.sleep(100);
                        lineStorage.setBool(true);
                        System.out.println(lineStorage.getStr());
                        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file2, true))) {
                            printWriter.println(lineStorage.getStr());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        lineStorage.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}