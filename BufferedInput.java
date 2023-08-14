
import java.io.BufferedReader;

import java.io.InputStreamReader;

class BufferedInput
{
    public static void main (String ar[])
    {
        InputStreamReader iobj= new InputStreamReader(System.in);
        BufferedReader bobj= new BufferedReader(iobj);

        System.out.println("Enter your name:");
        String name=bobj.readline();

    }
}