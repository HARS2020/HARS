package benchmarks.Mytest;

public class HashTableTest {
    public static void main(String[] args) throws Throwable {
        new HashTableTest().run();
    }

    private void run() throws Throwable {

        final benchmarks.instrumented.java15.util.Hashtable var0 = new benchmarks.instrumented.java15.util.Hashtable();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {

                    final java.lang.Object var1 = var0.put((java.lang.Object) var0, (java.lang.Object) var0);
                    final benchmarks.instrumented.java15.util.Set var2 = var0.entrySet();
                    final benchmarks.instrumented.java15.util.Set var3 = var0.entrySet();
                    final benchmarks.instrumented.java15.util.Set var4 = var0.entrySet();
                    final benchmarks.instrumented.java15.util.LinkedHashSet var5 = new benchmarks.instrumented.java15.util.LinkedHashSet((benchmarks.instrumented.java15.util.Collection) var4);
                    final java.lang.Object var6 = var0.put((java.lang.Object) var5, (java.lang.Object) var5);

                } catch (Throwable t) {
                    throw new RuntimeException(t);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {

                    final benchmarks.instrumented.java15.util.Set var1 = var0.entrySet();
                    final benchmarks.instrumented.java15.util.Set var2 = var0.entrySet();
                    final benchmarks.instrumented.java15.util.Set var3 = var0.entrySet();
                    final benchmarks.instrumented.java15.util.Hashtable var4 = new benchmarks.instrumented.java15.util.Hashtable();
                    final benchmarks.instrumented.java15.util.IdentityHashMap var5 = new benchmarks.instrumented.java15.util.IdentityHashMap((benchmarks.instrumented.java15.util.Map) var4);
                    final java.lang.Object var6 = var0.put((java.lang.Object) var4, (java.lang.Object) var5);
                    final benchmarks.instrumented.java15.util.Set var7 = var0.entrySet();

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
