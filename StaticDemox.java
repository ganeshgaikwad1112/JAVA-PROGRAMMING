
// Static in java
class StaticDemox
{
    public static void main(String arg[])
    {
        System.out.println("Inside main");
        System.out.println("Value of static No3 : "+Demox.No3);
        System.out.println("Value of static No3 : "+Demox.No4);
        Demox.Gun();

        Demox dobj1;
        dobj1= new Demox();

        Demox dobj2=new Demox();

    }
}

class Demox
{
    public int No1;   //  non static characteristics
    public int No2;   //   non static characteristics
    public static int No3;  // static characteristics
    public static int No4;  // static characteristics

    static   // static block
    {
        System.out.println("Inside Static block");
        No3=51;
        No4=101;
    }
    public Demox()  // Constructor
    {
        System.out.println("Inside Constructor");
        No1=11;
        No2=21;

    }
    public void Fun()  // Non static method
    {
        System.out.println("Inside  non static method");
    }
    public static void Gun()  // Static method
    {
        System.out.println("Inside Static Gun method");
    }
}


