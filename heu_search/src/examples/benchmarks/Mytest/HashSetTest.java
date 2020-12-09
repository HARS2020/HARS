package benchmarks.Mytest;

public class HashSetTest {


        public static void main(String[] args) throws Throwable {
            new HashSetTest().run();
        }

        private void run() throws Throwable {

            final benchmarks.instrumented.java15.util.HashSet var0 = new benchmarks.instrumented.java15.util.HashSet();

            Thread t1 = new Thread(new Runnable() {
                public void run() {
                    try {

                        final boolean var1 = var0.removeAll((benchmarks.instrumented.java15.util.Collection) var0);
                        final boolean var2 = var0.add((java.lang.Object) null);

                    } catch (Throwable t) {
                        throw new RuntimeException(t);
                    }
                }
            });

            Thread t2 = new Thread(new Runnable() {
                public void run() {
                    try {

                        final boolean var1 = var0.add((java.lang.Object) null);
                        final boolean var2 = var0.removeAll((benchmarks.instrumented.java15.util.Collection) var0);

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
