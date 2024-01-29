package Array;
import java.util.*;
public class insert_delete
{
    void input(int[] arr, int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void display(int[] arr, int n)
    {
        for (int i = 0; i < n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    void indInsertion(int[] arr, int n, int element, int pos)
    {
        int newArrLength = n + 1;
        int[] newArr = new int[newArrLength];
        for (int i = 0; i < pos - 1; i++)
        {
            newArr[i] = arr[i];
        }
        newArr[pos - 1] = element;
        for (int i = pos; i < newArrLength; i++)
        {
            newArr[i] = arr[i - 1];
        }
        for (int i = 0; i < newArrLength; i++)
        {
            arr[i]=newArr[i];
        }
    }
    void indDeletion(int[] arr, int size, int index)
    {
        for (int i = index; i < size - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        insert_delete ob=new insert_delete();
        int[] arr=new int[50];
        int size;
        System.out.println("Enter the size");
        size=sc.nextInt();
        ob.input(arr,size);
        System.out.println("Array is:");
        ob.display(arr,size);

        System.out.println("\nEnter the element to insert: ");
        int element = sc.nextInt();
        System.out.println("Enter the position to insert:");
        int pos = sc.nextInt();
        if (pos < 1 || pos > size + 1)
        {
            System.out.println("Invalid position");
        }
        else
        {
            System.out.println("Inserted Array");
            ob.indInsertion(arr,size+1,element,pos);
            ob.display(arr, size+1);
        }

        System.out.println("\nEnter the index to be deleted:");
        int ind = sc.nextInt();
        System.out.println("\nDeleted Array");
        ob.indDeletion(arr,size,ind);
        size=size-1;
        ob.display(arr, size+1);
    }
}