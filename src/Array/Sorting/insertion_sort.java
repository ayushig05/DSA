package Array.Sorting;
public class insertion_sort
{
    void display(int[] arr, int n)
    {
        for (int i = 0; i < n ; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
    void insertionSort(int[] arr, int n)
    {
        int i,j,temp;
        for (i = 1; i < n; i++)
        {
            temp=arr[i];
            j=i-1;
            //while(j>=0 && arr[j]<temp)     //descending
            while(j>=0 && arr[j]>temp)    //ascending
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args)
    {
        insertion_sort ob = new insertion_sort();
        int[] arr = {2, 6, 3, 9, 1, 7, 8, 4, 5};
        int size = 9;
        System.out.println("Array");
        ob.display(arr, size);
        System.out.println("\nInsertion Sort");
        ob.insertionSort(arr, size);
        ob.display(arr, size);
    }
}