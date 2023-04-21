package Question3;
/**
 * @author Haiqing Bai
 * @date 2023/4/20
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
