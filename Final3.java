
final class Base
{
   
}
class Derived extends Base  // cant inherit bcz base class is final
{
   
}

class Final3
{
    public static void main(String g[])
    {
        Base bobj=new Derived();

    }   
}