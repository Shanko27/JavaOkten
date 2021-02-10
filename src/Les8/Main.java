package Les8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        int a = 2 + 3;
//        int arr[] = new int[5];
//        try {
//            Object o = null;
//            o.toString();
//            System.out.println(arr[a]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(" Catch ArrayIndexOutOfBoundsException");
//        } catch (NullPointerException e) {
//            System.out.println("Catch NPE");
//        } catch (IndexOutOfBoundsException e){
//            System.out.println("Catch IndexOutOfBoundsException");
//        } finally {
//            System.out.println("Finally");
//        }
//        System.out.println("Out of thy-catch");
//
//try {
//    myMethod();
//} catch (MyException e){
//    System.out.println(e.getVeryDetailedMessrge());
//
//}

        File file = new File("1.txt");

//        try (FileOutputStream   fileOutputStream  = new FileOutputStream(file, true)){
//
//    fileOutputStream.write("Hello World!".getBytes());
//}catch (IOException e){
//    e.printStackTrace();
//}
//     try (FileInputStream fileInputStream = new FileInputStream(file)){
//         System.out.println(fileInputStream.read());
//         int i = 0;
//         while ( (i = fileInputStream.read()) != -1 ){
//             System.out.println((char)i);
//         }
//     } catch (IOException e){
//         e.printStackTrace();
//     }

//        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, true))){
//          printWriter.println("Hello World!");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
//    String s;
//    while ((s = bufferedReader.readLine()) !=null){
//        System.out.println(s);
//    }
            bufferedReader.lines().forEach(s -> System.out.println(s));

        } catch (IOException e) {
            e.printStackTrace();

        }


    }

    private static void myMethod() throws MyException {
        List<String> list = new ArrayList<>();
        if (list.isEmpty()) {
            throw new MyException("Emtpy list", "I dont like empty lists!!!");
        }
    }

}
