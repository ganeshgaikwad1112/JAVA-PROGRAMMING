
// Static in java

class StaticDemo
{

    static
    {
        System.out.println("Inside static block of staticDemo class which contains main");
    }

    public StaticDemo()
    {
        System.out.println("Inside constructor of staticDemo");
    }


    public static void main(String arg[])
    {
        System.out.println("Inside main");
        System.out.println("Value of static No3 : "+Demox.No3); // Demo::No3
        System.out.println("Value of static No4 : "+Demox.No4);// Demo::No4
          Demox.Gun();    // Demo::gun();

        Demox obj1;
        obj1= new Demox();
        Demox obj2= new Demox();
        obj1.Fun();
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
        // non static method can acess static as well as
        // non static data
        // We can use 'this' keyword
        System.out.println("Inside  non static method");
        System.out.println("value of No1 "+this.No1);
        System.out.println("value of No2  "+this.No2);
        System.out.println("value of No3 "+this.No3);
        System.out.println("value of No4 "+this.No4);
        
    }
    public static void Gun()  // Static method
    {
        // static method can acess onle static data
        // we can't use 'this' keyword
        System.out.println("Inside Static Gun method");

        // System.out.println("value of No1 "+No1);
        // System.out.println("value of No2  "+No2);
        System.out.println("value of No3 "+No3);
        System.out.println("value of No4 "+No4);
    }
}


