import java.util.concurrent.locks.ReentrantLock;


public class PrintABC {

    private static int state = 0;
    private byte[] a={'A','A'};
    private byte[] b={'B','B'};
    private byte[] c={'C','C','C'};

    public PrintABC(){
    }

    public void threadTest() {

        final ReentrantLock lock = new ReentrantLock();

        // thread1
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run(){
                while (state <Integer.MAX_VALUE) {
                    try {
                        // 加锁
                        lock.lock();
                        if (state % 3 == 0) {
                            System.out.print(a);
                            state++;
                        }
                    }
                    finally {
                        lock.unlock();
                    }

                }
            }
        });

        // thread2
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                while (state <Integer.MAX_VALUE) {
                    try {
                        // 加锁
                        lock.lock();
                        if (state % 3 == 1) {
                            System.out.print(b);
                            state++;
                        }
                    }
                    finally {
                        lock.unlock();
                    }
                }
            }
        });

        // thread3
        Thread t3 = new Thread(new Runnable() {

            @Override
            public void run() {
                while (state <Integer.MAX_VALUE) {
                    try {
                        // 加锁
                        lock.lock();
                        if (state % 3 == 2) {
                            System.out.print(c);
                            state++;
                        }
                    }
                    finally {
                        lock.unlock();
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();

    }

}

