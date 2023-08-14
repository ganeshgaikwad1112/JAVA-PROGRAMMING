
class ThreadDemo10
{
    public static void main(String a[])
    {   
        System.out.println("Inside main method");

        System.out.println("Name of current thread is :"+Thread.currentThread().getName());

        System.out.println("Priority of t1 is "+Thread.currentThread().getPriority());


    }
}