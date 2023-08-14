import java.util.*;

class Collection1
{
    public static void main(String a[])
    {
        LinkedList <Integer> lobj = new LinkedList<Integer>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);
        lobj.add(111);
        
        System.out.println("Elements of linked list are :"+lobj);
        

        lobj.addFirst(1);
        System.out.println("Elements of linked list are :"+lobj);

        lobj.addLast(121);
        System.out.println("Elements of linked list are :"+lobj);

        Iterator iobj = lobj.iterator();
        System.out.println("data using iterator is :");
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }


        lobj.remove();
        System.out.println("Elements of linked list are :"+lobj);

        lobj.remove();
        System.out.println("Elements of linked list are :"+lobj);

        lobj.remove(1);  // remove la index pass
        System.out.println("Elements of linked list are :"+lobj);

        lobj.removeLast();
        System.out.println("Elements of linked list are :"+lobj);

        // size of elements
        System.out.println("number of elements are :"+lobj.size());

        lobj.set(1,500);
        System.out.println("Elements of linked list are :"+lobj);



        lobj.clear();
        System.out.println("Elements of linked list are :"+lobj);

        

    }
}