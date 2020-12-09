package benchmarks.Mytest;

public class LinkedListTest {

    public static void main(String[] args) throws Throwable {
        new LinkedListTest().run();
    }

    private void run() throws Throwable {

        final benchmarks.instrumented.java15.util.LinkedList var0 = new benchmarks.instrumented.java15.util.LinkedList();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {

                    var0.addFirst((java.lang.Object) null);
                    var0.addFirst((java.lang.Object) var0);

                } catch (Throwable t) {
                    throw new RuntimeException(t);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {

                    var0.addFirst((java.lang.Object) null);
                    final java.lang.Object var1 = var0.remove();

                } catch (Throwable t) {
                    throw new RuntimeException(t);
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
