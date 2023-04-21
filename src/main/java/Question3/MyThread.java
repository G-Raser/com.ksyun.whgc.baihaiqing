package Question3;
/**
 * @author Haiqing Bai
 * @date 2023/4/20
 */
public class MyThread {
    int count = 1;
    public synchronized void printA() {  //A线程
        while(count<=0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("A");
        count--;
        this.notifyAll();
    }
    public synchronized void printB() {   //B线程
        while(count!=0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("B");
        count--;
        this.notifyAll();

    }
    public synchronized void printC() {    //C线程
        while(count>=0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("C");
        count=-count;
        this.notifyAll();
    }
}
