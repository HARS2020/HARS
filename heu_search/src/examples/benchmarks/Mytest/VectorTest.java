package benchmarks.Mytest;

public class VectorTest {

    public static void main(String[] args) throws Throwable {
        new VectorTest().run();
    }

    private void run() throws Throwable {

        final benchmarks.instrumented.java15.util.Vector var0 = new benchmarks.instrumented.java15.util.Vector((int) 0);
        var0.ensureCapacity((int) 0);
        final java.lang.String var1 = var0.toString();
        final int var2 = var0.hashCode();
        var0.addElement((java.lang.Object) null);
        final java.lang.String var3 = var0.toString();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {

                    final benchmarks.instrumented.java15.util.TreeSet var4 = new benchmarks.instrumented.java15.util.TreeSet((benchmarks.instrumented.java15.util.Collection) var0);
                    final benchmarks.instrumented.java15.util.Comparator var5 = var4.comparator();
                    final benchmarks.instrumented.java15.util.TreeSet var6 = new benchmarks.instrumented.java15.util.TreeSet((benchmarks.instrumented.java15.util.Comparator) var5);
                    final boolean var7 = var0.remove((java.lang.Object) var6);
                    final boolean var8 = var0.remove((java.lang.Object) var0);

                } catch (Throwable t) {
                    throw new RuntimeException(t);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {

                    final boolean var4 = var0.remove((java.lang.Object) var3);
                    final boolean var5 = var0.remove((java.lang.Object) null);

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
