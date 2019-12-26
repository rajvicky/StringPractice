package pkg;
import java.util.LinkedList;
import java.util.Queue;
 public class B{
    protected int data;
}
/*
class A implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            //TODO: handle exception
        }

    }
}
class HelloWorld{
    public static void main(String []args) throws InterruptedException{
        Thread rb=new Thread(new A());
        Thread rr=new Thread(new A(),"RR");
        rb.start();
        rb.join(1000);
        rr.setPriority(1);
        rr.start();
        rr.yield();
        System.out.println("Main Method is Ended");


        Queue<Integer> q = new LinkedList<>(); 

	// Adds elements {0, 1, 2, 3, 4} to queue 
	for (int i=0; i<5; i++) 
	q.add(i); 

	// Display contents of the queue. 
	System.out.println("Elements of queue-"+q); 

	// To remove the head of queue. 
	int removedele = q.remove(); 
	System.out.println("removed element-" + removedele); 

	System.out.println(q); 

	// To view the head of queue 
	int head = q.peek(); 
	System.out.println("head of queue-" + head); 

    boolean Dy=q.contains(2);
	// Rest all methods of collection interface, 
	// Like size and contains can be used with this 
	// implementation. 
	int size = q.size(); 
	System.out.println("Size of queue-" + size); 
    }
}*/