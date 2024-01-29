package Recursion.Recursion1;
public class Bubble
{
    void display(int[] arr, int n)
    {
        for (int i = 0; i < n ; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
    void bubble(int[] arr, int n)
    {
        if(n == 1)
        {
            return;
        }
        int c = 0;
        for (int i = 0; i < n-1; i++)
        {
            if (arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                c++;
            }
        }
        if (c == 0)
        {
            return;
        }
        bubble(arr, n-1);
    }
    public static void main(String[] args)
    {
        Bubble ob = new Bubble();
        int[] arr = {2, 6, 3, 9, 1, 7, 8, 4, 5};
        int size = 9;
        System.out.println("Array");
        ob.display(arr, size);
        System.out.println("\nBubble Sort");
        ob.bubble(arr, size);
        ob.display(arr, size);
    }
}