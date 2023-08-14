
class Base
{
    public void fun()
    {
        System.out.println("Base fun");
    }
    public final void gun()
    {
        System.out.println("Base final gun");
    }
}
class Derived extends Base
{
    public void fun()
    {
        System.out.println("Derived fun");
    }
    public final void gun()
    {
        System.out.println("derived final gun");
    }
}

class Final2
{
    public static void main(String g[])
    {
        Base bobj=new Derived();

    }   
}