
// in array input from user and addition of this number 

import java.util.Scanner;
class ArrayS
{
    public static void main(String Arg[])
    {
        int iCnt=0;
        int iSum=0;
        Scanner obj ;
        obj= new Scanner (System.in);

        System.out.println("Enter the size");
        int iSize=obj .nextInt();

        int Arr[]=new int [iSize];
        System.out.println("Enter the element u want");
        for (iCnt=0;iCnt<iSize;iCnt++)
        {
            Arr[iCnt]=obj.nextInt();
        }
        System.out.println("Display the Elements");
        for(iCnt=0;iCnt<iSize;iCnt++)
        {
            System.out.println(Arr[iCnt]);
            iSum=iSum+Arr[iCnt];
        }
        // for(iCnt=0;iCnt<iSize;iCnt++)
        // {
        //     iSum=iSum+Arr[iCnt];
        // }
       System.out.println("Addition is:"+iSum);
    }
}