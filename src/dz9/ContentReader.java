package dz9;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;


@NoArgsConstructor
@Data

public class ContentReader implements Runnable {
    private LineStorage lineStorage;

    public ContentReader(LineStorage lineStorage) {
        this.lineStorage = lineStorage;
    }

    File file = new File("lorem.txt");


    @Override
    public void run() {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            synchronized (lineStorage) {
                String s;
                while ((s = bufferedReader.readLine()) != null) {

                    if (!lineStorage.isBool()) {
                        try {
                            lineStorage.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    lineStorage.setStr(s);
                    lineStorage.setBool(false);
                    lineStorage.notify();
                }

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}








