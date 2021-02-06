
class Callme 
{
    synchronized void call(String msg) 
    {      
        System.out.print(msg);
        try 
        {
            Thread.sleep(5000);
        } 
        catch(InterruptedException e) 
        {
            System.out.println("Interrupted");
        }
        if(msg=="[")
            System.out.print("]");
        if(msg=="{")
            System.out.print("}");
        if(msg=="(")
            System.out.print(")");
    }
}
class Caller implements Runnable 
{
    String msg;
    Callme target;
    Thread t;
    public Caller(Callme targ, String s) 
    {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run() 
    {
        target.call(msg);
    }
}
class Main
{
    public static void main(String args[]) 
    {
        Callme target = new Callme();

        Caller ob1 = new Caller(target, "[");   
        Caller ob2 = new Caller(target, "{");
        Caller ob3 = new Caller(target, "(");

        try 
        {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } 
        catch(InterruptedException e) 
        {
            System.out.println("Interrupted");
        }
    }
}
