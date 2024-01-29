package Linked_List;
import java.util.LinkedList;
public class LL
{
    public static void main(String[] args)
    {
        LinkedList<String> ob=new LinkedList<String>();
        ob.addFirst("a");
        ob.addFirst("is");
        System.out.println(ob);
        ob.addFirst("this");
        ob.add("list");
        System.out.println(ob);
        System.out.println(ob.size());
        for (int i = 0; i < ob.size(); i++)
        {
            System.out.print(ob.get(i)+" -> ");
        }
        System.out.println("null");
//       ob.removeFirst();
//       System.out.println(ob);
//       ob.removeLast();
//       System.out.println(ob);
        ob.remove(3);
        System.out.println(ob);
    }
}