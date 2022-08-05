public class multithread implements Runnable{
    public static void main(String[] args){
        /*process1 obj1 = new process1("thread1111");
        obj1.start();
        process1 obj2 = new process1("thread2222222");
        obj2.start();*/
        Thread t1= new Thread(new multithread(),"t1");
        Thread t2= new Thread(new multithread(),"t2");
        Thread t3= new Thread(new multithread(),"t3");
        t1.start();
        
        
        t3.start();
        t2.start();
        try{
            t2.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    @Override
    public void run(){
        int n=5;
        while(n-->0){
            System.out.println(Thread.currentThread().getName());
        }
    }
    
}
class process1 implements Runnable{
    Thread t;

    private String name;

    process1(String name1){
        name = name1;
    }

    @Override
    public void run(){
        int n=5;
        while(n-->0){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(this.name);
            System.out.println();
        }
    }

    public void start(){
        System.out.println(name+" entered");
        Thread t = new Thread(this,name);
        t.start();
    }

}
