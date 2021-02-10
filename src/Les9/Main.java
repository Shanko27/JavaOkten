package Les9;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static volatile boolean flag = true;
    //    private static volatile a = 0;
    private static AtomicInteger a = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
//MyThraedEx myThraedEx = new MyThraedEx("Full","Roma");
//myThraedEx.start();
//
//
//
//        Runnable runnable = () -> {
//            for (int i = 0; i < 5; i++) {
//                try {
//                    System.out.println(Thread.currentThread().getName() + ": " + i);
//                    Thread.sleep(500);
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                } } };
//        Runnable runnable2 = () -> {
//            for (int i = 0; i < 7; i++) {
//                try {
//                    System.out.println(Thread.currentThread().getName() + ": " + i);
//                    Thread.sleep(600);
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                } } };
//
//        Thread thread  = new Thread(runnable, "My_Thread");
//        Thread thread2  = new Thread(runnable2, "My_Thread_2");
//
////Thread thread = new Thread(new MyThread(), "My_Thraed");
//
//                thread.start();
//        thread.join();
//
//        thread2.start();
//                thread.join();
////        thread.run();
////        System.out.println("main");
//        for (int i = 0; i < 5; i++) {
//
//            System.out.println(Thread.currentThread().getName() + ": " + i);
//        }

//        Thread thread1 = new Thread(() -> {
//            for (int i = 0; i < 2000; i++) {
//                System.out.println("value: " + i);
//            }
//            flag = false;
//            System.out.println("flag" + flag);
//        });
//        Thread thread2 = new Thread(new Runnable() {
//            int i = 1;
//            @Override
//            public void run() {
//             while (flag){
//                 i++;
//             }
//                System.out.println("value:" + i);
//            }
//        });
//        thread1.start();
//        thread2.start();

//        Runnable runnable = () -> {
//            while (a.get() <10){
//                System.out.println(Thread.currentThread().getName() + ": " + a.incrementAndGet());
//            }
//        };
//        Thread thread1 = new Thread(runnable,"Thr1");
//        Thread thread2 = new Thread(runnable,"Thr2");
//
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
//        System.out.println(a);


        BankAccount bankAccount = new BankAccount(50);
        CreditCard creditCard1 = new CreditCard(bankAccount);
        CreditCard creditCard2 = new CreditCard(bankAccount);
        CardOwner husband = new CardOwner(creditCard1);
        CardOwner wife = new CardOwner(creditCard2);

        Thread husbandThread = new Thread(husband, "Husband");
        Thread wifeThread = new Thread(wife, "Wife");

        husbandThread.start();
        wifeThread.start();
        husbandThread.join();
        wifeThread.join();
        System.out.println(bankAccount.getAmountOfMoney());


    }
}
