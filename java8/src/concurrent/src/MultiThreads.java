package concurrent.src;

public class MultiThreads {
    /**
     * 멀티 스레드
     */
    // 1. 스레드 상속받아서 만들기
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello : " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println(Thread.currentThread().getName()); // 메인 스레드
//        // 2. Runnable
//        Thread thread = new Thread(()-> {
//            System.out.println("Thread : " + Thread.currentThread().getName());
//        });
//        thread.start();

        /**
         * Tread의 주요 기능
         */
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                System.out.println("interrupt");
                e.printStackTrace();
                return;
            }
            System.out.println(Thread.currentThread().getName());
        });
        thread1.start();
        thread1.interrupt();
    }
}
