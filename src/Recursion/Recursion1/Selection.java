package Recursion.Recursion1;
public class Selection
{
    void display(int[] arr, int n)
    {
        for (int i = 0; i < n ; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
    void selection(int[] arr, int start, int n)
    {
        if (start == n-1)
        {
            return;
        }
        int pos = start;
        for (int i = start+1; i < n; i++)
        {
            if (arr[i] < arr[pos])
            {
                pos = i;
            }
        }
        int temp = arr[start];
        arr[start] = arr[pos];
        arr[pos] = temp;
        selection(arr,start+1, n);
    }
    public static void main(String[] args)
    {
        Selection ob = new Selection();
        int[] arr = {2, 6, 3, 9, 1, 7, 8, 4, 5};
        int size = 9;
        System.out.println("Array");
        ob.display(arr, size);
        System.out.println("\nSelection Sort");
        ob.selection(arr,0, size);
        ob.display(arr, size);
    }
}