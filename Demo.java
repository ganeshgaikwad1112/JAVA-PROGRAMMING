// Addition and Substraction using loop

class Maths
{
    public int iNo1;  // characteristics
    public int iNo2; // characteristics

    public Maths()    // Default constructor
    {
        System.out.println("inside default constructor");
        iNo1=0;
        iNo2=0;
    }
        public Maths(int a, int b)  // parameterised constructor
        {
            System.out.println("inside parameterised constructor");
            iNo1=a;
            iNo2=b;
        }

        public int Addition()  // Behaviour
        {
            int iAns=0;
            iAns=iNo1+iNo2;
            return iAns;

        }
        public int Substraction()   // Behaviour
        {
            int iAns=0;
            iAns=iNo1-iNo2;
            return iAns;
        }
}  //  End of Maths class

class Demo
{
    public static void main (String arr[])
    {
        System.out.println("Inside main Function");

        Maths mobj1;
        mobj1=new Maths();
        Maths mobj2;
        mobj2 = new Maths(10,11);

        int iRet=0;

        iRet=mobj1.Addition();
        System.out.println("Addition is"+iRet);

        iRet=mobj2.Addition();
        System.out.println("Additionn is"+iRet);

        iRet=mobj1.Substraction();
        System.out.println("Substraction is"+iRet);

        iRet=mobj2.Substraction();
        System.out.println("Substraction is"+iRet);

    }
}