package benchmarks.Mytest;

public class TreeSetTest {

    public static void main(String[] args) throws Throwable {
        new TreeSetTest().run();
    }

    private void run() throws Throwable {

        final benchmarks.instrumented.java15.util.TreeSet var0 = new benchmarks.instrumented.java15.util.TreeSet((benchmarks.instrumented.java15.util.Comparator) null);
        final boolean var1 = var0.retainAll((benchmarks.instrumented.java15.util.Collection) var0);
        final int var2 = var0.hashCode();
        final boolean var3 = var0.isEmpty();
        var0.clear();
        final java.util.Spliterator var4 = var0.spliterator();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {

                    final java.lang.Object[] var5 = var0.toArray();
                    final boolean var6 = var0.add((java.lang.Object) null);

                } catch (Throwable t) {
                    throw new RuntimeException(t);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {

                    final boolean var5 = var0.add((java.lang.Object) var0);
                    final java.lang.Object[] var6 = var0.toArray();

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
