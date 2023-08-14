
// create the array and get input from user and dispalyed outputs addition

import java.util.Scanner;


class ArrayUser
{
    public static void main(String arg[])
    {   
        int iCnt = 0;
        int iSum=0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of Array :");
        int iSize = 0;
        iSize = sobj.nextInt();

    //  int Arr[] = ( int* ) malloc (iSize*sizeof(int));
        int Arr[] = new int [iSize];

        System.out.println("number of elments in the array"+Arr.length);

        System.out.println("Enter the elements of array : ");

        for(iCnt=0; iCnt < Arr.length; iCnt++)
        {
            Arr [iCnt] = sobj.nextInt();
        }   

        System.out.println("Elments of the array :");
         for(iCnt=0; iCnt < Arr.length; iCnt++)
         {
            System.out.println(Arr[iCnt]);
         }

        for(iCnt=0; iCnt < Arr.length; iCnt++)
         {
            iSum = iSum+Arr[iCnt];
         }
         System.out.println("Addition is : "+ iSum);

    }
}