package dz9;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        LineStorage lineStorage = new LineStorage();
        ContentReader contentReader = new ContentReader(lineStorage);
        ContentPrinter contentPrinter = new ContentPrinter(contentReader, lineStorage);
        WordWriter wordWriter = new WordWriter(lineStorage, contentReader);

        Thread read = new Thread(contentReader, "1");
        read.start();


        Thread read1 = new Thread(contentPrinter, "2");
        read1.start();
        Thread read2 = new Thread(wordWriter, "3");
        read2.start();
    }
}
