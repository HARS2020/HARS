package benchmarks.Mytest;

public class ArrayListTest {

    public static void main(String[] args) throws Throwable {
        new ArrayListTest().run();
    }

    public void run() throws Throwable {

        final benchmarks.instrumented.java15.util.ArrayList var0 = new benchmarks.instrumented.java15.util.ArrayList((int) 2);
        final int var1 = var0.lastIndexOf((java.lang.Object) null);
        var0.trimToSize();
        final benchmarks.instrumented.java15.util.ListIterator var2 = var0.listIterator();
        final boolean var3 = var0.remove((java.lang.Object) null);
        var0.add((int) 0, (java.lang.Object) var0);

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {

                    final boolean var4 = var0.equals((java.lang.Object) null);
                    final boolean var5 = var0.add((java.lang.Object) null);

                } catch (Throwable t) {
                    throw new RuntimeException(t);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {

                    final boolean var4 = var0.add((java.lang.Object) var0);
                    final boolean var5 = var0.equals((java.lang.Object) var0);

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
