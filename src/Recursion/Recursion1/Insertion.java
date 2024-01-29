package Recursion.Recursion1;
public class Insertion
{
    void display(int[] arr, int n)
    {
        for (int i = 0; i < n ; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
    void insertion(int[] arr, int n)
    {
        if(n <= 1)
        {
            return;
        }
        insertion(arr, n-1);
        int temp = arr[n-1];
        int j = n-2;
        while(j>=0 && arr[j]>temp)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
    public static void main(String[] args)
    {
        Insertion ob = new Insertion();
        int[] arr = {2, 6, 3, 9, 1, 7, 8, 4, 5};
        int size = 9;
        System.out.println("Array");
        ob.display(arr, size);
        System.out.println("\nInsertion Sort");
        ob.insertion(arr, size);
        ob.display(arr, size);
    }
}