package Array.Sorting;
public class selection_sort
{
    void display(int[] arr, int n)
    {
        for (int i = 0; i < n ; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
    void selectionSort(int[] arr, int n)
    {
        int i, j, pos, temp;
        for (i = 0; i < n; i++)
        {
            pos = i;
            for (j = i + 1; j < n; j++)
            {
                // if(arr[j]>arr[pos])    // for descending
                if (arr[j] < arr[pos]) // for ascending
                {
                    pos = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
    }
    public static void main(String[] args)
    {
        selection_sort ob = new selection_sort();
        int[] arr = {2, 6, 3, 9, 1, 7, 8, 4, 5};
        int size = 9;
        System.out.println("Array");
        ob.display(arr, size);
        System.out.println("\nSelection Sort");
        ob.selectionSort(arr, size);
        ob.display(arr, size);
    }
}