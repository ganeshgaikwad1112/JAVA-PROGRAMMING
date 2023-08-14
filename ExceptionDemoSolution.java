import java.util.*;


class ExceptionDemoSolution
{
    public static void main (String aa[])
    {
        Scanner sobj=new Scanner(System.in);

        int iNo1=0,iNo2=0, iAns=0;

        System.out.println("Enter first number");
        iNo1=sobj.nextInt();

        System.out.println("Enter Second number");
        iNo2=sobj.nextInt();

        try
        {
            System.out.println("Inside try block");
            iAns=iNo1/iNo2;
            System.out.println("Division is :"+iAns);
        }
        
        catch(ArithmeticException obj)
        {
            System.out.println("inside catch 1");
            System.out.println(obj);
        }

        catch(NullPointerException obj)
        {
            System.out.println("inside catch 2");
            System.out.println(obj);

        }

        catch(Exception obj)
        {
            System.out.println("inside catch 3");
            System.out.println(obj);

        }

        finally
        {
            System.out.println("inside finally block");
            sobj.close();
        }


    }
}