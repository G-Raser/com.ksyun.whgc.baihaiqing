package Question3;
/**
 * @author Administrator
 */
public class ThreadDemo
{
    public static final int PRINTSIZE = 5;
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<PRINTSIZE; i++) {
                    thread.printA();
                }
            }
        }).start();

        new Thread() {
            @Override
            public void run() {
                for(int i=0; i<PRINTSIZE; i++) {
                    thread.printB();
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<PRINTSIZE; i++) {
                    thread.printC();
                }
            }
        }).start();
    }
}
