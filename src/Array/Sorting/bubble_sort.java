package Array.Sorting;
public class bubble_sort
{
    void display(int[] arr, int n)
    {
        for (int i = 0; i < n ; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
    void bubbleSort(int[] arr, int n)
    {
        int i, j, temp;
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n - 1 - i; j++)
            {
                // if(arr[j]<arr[j+1])    // for descending
                if (arr[j] > arr[j + 1]) // for ascending
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        bubble_sort ob = new bubble_sort();
        int[] arr = {2, 6, 3, 9, 1, 7, 8, 4, 5};
        int size = 9;
        System.out.println("Array");
        ob.display(arr, size);
        System.out.println("\nBubble Sort");
        ob.bubbleSort(arr, size);
        ob.display(arr, size);
    }
}